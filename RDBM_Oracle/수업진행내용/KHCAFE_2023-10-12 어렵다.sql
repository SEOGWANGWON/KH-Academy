-- 제품 테이블 생성
CREATE TABLE products (
    product_id NUMBER(5) PRIMARY KEY,
    product_name VARCHAR2(100),
    category VARCHAR2(50),
    price NUMBER(10, 2),
    stock_quantity NUMBER(5)
);

--인덱스 생성 : 제품 이름으로 검색을 최적화
CREATE INDEX idx_product_name ON products(product_name);


--인덱스 생성 : 카테고리로 검색을 최적화
CREATE INDEX idx_category ON products(category);

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (1, '노트북', '전자제품', 899.99,  10);

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (2, '스마트폰', '전자제품', 499.99, 20);

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (3, '커피머신', '가전제품', 59.99, 5);

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (4, '운동화', '신발', 79.99, 30);

--제품 이름으로 검색 ( 인덱스 활용 )
SELECT * FROM products
WHERE product_name = '노트북';

--주문 ID 주문 검색 ( 인덱스 활용하여 주문 검색 )
SELECT & FROM orders WHERE order_id = 7;


-- 인덱스 활용 예제들
-- cafe_id 가 6인 카페에서 주문 검색
SELECT * FROM cafes c
JOIN orders o ON c.cafe_id = o.cafe_id
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE c.cafe_id = 6;

--강사님의 답안지
SELECT * FROM orders WHERE cafe_id = 6;

-- 10.00 ~ 15.00 특정 가격 범위로 주문 검색
SELECT * FROM orders WHERE total_price >= 10.00 AND total_price <= 15.00;

--강사님의 답안지
SELECT * FROM orders WHERE total_price >= 10.10 AND total_price <= 15.00;

-- 2023-10-11 14:00:00 ~ 2023-10-11 15:00:00 범위로 주문검색
SELECT * FROM orders WHERE ORDER_DATE >= '2023-10-11 14:00:00' AND order_date <= '2023-10-11 15:00:00';

--강사님의 답안지
SELECT * FROM orders
WHERE order_date >= TIMESTAMP '2023-10-11 14:00:00'
AND order_date < TIMESTAMP '2023-10-11 15:00:00';

/************************** 함수 ***************************/

--문자열에서 특정 문자 또는 문자열을 다른 문자열로 대체
SELECT REPLACE (description, '풍미', '맛') FROM menu;
SELECT product_name, REPLACE(product_name, '스마트', '똑똑한')
FROM products;

-- CONCAT 두 문자열을 결합
SELECT product_name || '가격 : $' || TO_CHAR(price, '999.99')
FROM products;

-- SUBSTR 문자열 일부 추출 ( 컬럼, 범위~, ~까지)
SELECT product_name, SUBSTR(product_name, 1, 3)
FROM products;

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (5, '후드 집업', '의류', 20.99, 33);

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (6, '원피스', '의류', 10.99, 2);

-- TRIM, LTRIM, RTRIM 문자열에서 제거하는데 사용 EX) L,RTRIM ( 컬럼, '제거하고싶은 문자' )
-- TRIM 양쪽 끝에있는 ' ' (공백)을 제거하는데 사용
-- LTRIM 문자열 (시작부분)의 ' ' (공백)을제거 
-- RTRIM 문자열 오른쪽 (끝부분)의 ' ' (공백) 을 제거
SELECT product_name, TRIM(' '), LTRIM(product_name, '노트'),
RTRIM(product_name,'폰')
FROM products;

SELECT LTRIM(product_name) FROM products;

SELECT LTRIM(category, '제품') FROM products;

SELECT LTRIM(category, '전자') FROM products;

--전자제품에서 제품을 제거하고 출력 SELECT RTRIM 활용
SELECT RTRIM(category, '제품') FROM products;

-- INSTR : 문자열에서 특정 문자 위치 INSTR(컬럼명, 위치를 알고싶은 문자열)
SELECT product_name, INSTR(product_name, ' ')
FROM products;

--LENGTHB, LENGTH : 바이트 문자열 길이, 문자단위로 문자열 길이
SELECT product_name, LENGTHB(product_name), LENGTH(product_name)
FROM products;

-- 가장 긴 제품 이름 찾기 : 
SELECT product_name
FROM products
WHERE LENGTH(product_name) = (SELECT MAX(LENGTH(product_name)) FROM products);
-- WHERE LENGTH(product_name) 이부분과 괄호 잘보기


--제품 가격 반올림
SELECT product_name, ROUND(price)  -- *, 컬럼은 안됨 (*은 모두를 포함하기때문에)
FROM products;



--제품 이름에 폰이 들어가는 제품 찾기 INSTR
SELECT product_name
FROM products
WHERE INSTR(product_name, '폰')  >0;         -- INSTR 는 INT 이기때문에 관계연산자를 넣어야함 


-- BOOK 테이블의 들어갈 값들이 안들어 가는 이유 수정 (MODIFY 문자열크기 늘리기, UNION ALL추가 , ; 제거)

CREATE TABLE book (
    book_id NUMBER PRIMARY KEY,
    title VARCHAR2(255) NOT NULL,
    author VARCHAR2(100) NOT NULL,
    publication_year NUMBER(4),
    isbn VARCHAR2(13),
    genre VARCHAR2(50),
    description CLOB,
    price NUMBER(10, 2),
    publication_date DATE,
    created_date DATE DEFAULT SYSDATE,
    updated_date DATE,
    is_available CHAR(1) CHECK (is_available IN ('Y', 'N'))
);

ALTER TABLE BOOK MODIFY isbn VARCHAR2(15);
--MIDIFY
INSERT INTO book (book_id, title, author, publication_year, isbn, genre, description, price, publication_date, updated_date, is_available)
VALUES
    (1, 'The Great Gatsby', 'F. Scott Fitzgerald', 1925, '978-0743273565', 'Fiction', 'A story of decadence and excess.', 12.99, TO_DATE('1925-04-10', 'YYYY-MM-DD'), NULL, 'Y');
INSERT INTO book (book_id, title, author, publication_year, isbn, genre, description, price, publication_date, updated_date, is_available)

VALUES(2, 'To Kill a Mockingbird', 'Harper Lee', 1960, '978-0446310789', 'Fiction', 'A classic of modern American literature.', 14.99, TO_DATE('1960-07-11', 'YYYY-MM-DD'), NULL, 'Y');
INSERT INTO book (book_id, title, author, publication_year, isbn, genre, description, price, publication_date, updated_date, is_available)

VALUES(3, 'The Catcher in the Rye', 'J.D. Salinger', 1951, '978-0316769488', 'Fiction', 'A controversial novel.', 11.99, TO_DATE('1951-07-16', 'YYYY-MM-DD'), NULL, 'N');

INSERT INTO book (book_id, title, author, publication_year, isbn, genre, description, price, publication_date, is_available)
SELECT 4, '태백산맥', '조정래', 1997, '978-8936433598', 'Historical Fiction', '한국 현대사를 배경으로 한 대하소설.', 20.99, TO_DATE('1997-05-15', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 5, '토지', '박경리', 1986, '978-8937409054', 'Historical Fiction', '한국의 근대사를 배경으로 한 대하소설.', 18.99, TO_DATE('1986-03-10', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 6, '또 다른 고향', '김유정', 1942, '978-8930205551', 'Short Story', '군산의 자연과 사람들의 삶을 그린 단편집.', 15.99, TO_DATE('1942-10-05', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 7, '삼포 가는 길', '황석영', 1973, '978-8937460148', 'Novel', '어촌을 배경으로 한 인간의 삶과 운명을 그린 소설.', 13.99, TO_DATE('1973-07-20', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 8, '감옥으로부터의 사색', '윤동주', 1941, '978-8937462807', 'Poetry', '저자의 생애와 사상을 반영한 시집.', 12.99, TO_DATE('1941-06-15', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 9, '별에서 온 그대', '박효련', 2013, '978-8965702024', 'Romance', '외계인과 인간의 사랑을 그린 로맨스 소설.', 14.99, TO_DATE('2013-11-16', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 10, '겨울왕국', '김민주', 2014, '978-8965702031', 'Fantasy', '눈의 마법으로 세상을 뒤흔든 두 자매의 이야기.', 16.99, TO_DATE('2014-01-10', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 11, '얼음과 불의 노래', '김진명', 2011, '978-8965702048', 'Fantasy', '대륙을 뒤흔든 전쟁과 정치를 그린 판타지 소설.', 19.99, TO_DATE('2011-04-20', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 12, '해를 품은 달', '정은궐', 2012, '978-8965702055', 'Historical Fiction', '왕과 무녀의 금지된 사랑을 그린 소설.', 18.99, TO_DATE('2012-09-15', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 13, '빛의 눈동자', '이동훈', 2015, '978-8965702062', 'Sci-Fi', '미래의 과학기술을 배경으로 한 과학 소설.', 17.99, TO_DATE('2015-02-10', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 14, '바람의 나라', '유승희', 2006, '978-8965702079', 'Fantasy', '고대를 배경으로 한 판타지 대하소설.', 20.99, TO_DATE('2006-05-17', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 15, '미래의 선택', '정유미', 2016, '978-8965702086', 'Sci-Fi', '타임머신을 중심으로 한 과학 소설.', 15.99, TO_DATE('2016-07-20', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 16, '꽃을 보듯 너를 본다', '나태주', 1992, '978-8936434120', 'Poetry', '사랑과 삶을 주제로 한 시집.', 12.99, TO_DATE('1992-04-10', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 17, '아프니까 청춘이다', '김난도', 2009, '978-8934938841', 'Essay', '청춘의 아픔과 기쁨을 담은 에세이.', 14.99, TO_DATE('2009-11-11', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 18, '소나기', '황순원', 1953, '978-8930207562', 'Short Story', '어린 시절의 추억과 사랑을 그린 단편집.', 13.99, TO_DATE('1953-05-15', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 19, '우리들의 행복한 시간', '공지영', 2005, '978-8934918874', 'Novel', '죄책감에 시달리는 여성과 사형수의 이야기.', 16.99, TO_DATE('2005-04-20', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 20, '몽실언니', '김련희', 2018, '978-8937464252', 'Novel', '한국 전통문화를 배경으로 한 여성의 이야기.', 18.99, TO_DATE('2018-10-25', 'YYYY-MM-DD'), 'Y' FROM dual;


-- UPDATE와 SET 을 이용한 title 이름 수정
UPDATE book
SET title = '태백싼맥'
WHERE title = '태백산맥';  

UPDATE book
SET title = '땅'
WHERE title = '토지';

SELECT title FROM BOOK;

UPDATE BOOK SET title = '또 다른 쉼터' WHERE BOOK_ID = 6;

--책이름을 나디아 연대기 7~10번까지 변경하고자 함 BETWEEN
UPDATE BOOK
SET title = '나디아 연대기'
WHERE book_id BETWEEN 7 AND 10;

--UPDATE 를 이용해서 쿼리문 변경하는 방법
UPDATE BOOK
SET title = 
    CASE 
        WHEN title = '얼음과 불의 노래' THEN '얼음과 바다의 노래'
        WHEN title = '해를 품은 달' THEN '달을 품은 달'
        WHEN title = '빛의 눈동자' THEN '햇빛의 눈동자'
        ELSE title
    END;
    
UPDATE BOOK
SET title =
    CASE
        WHEN title = '얼음과 바다의 노래' THEN '얼바노'
        WHEN title = '달를 품은 달' THEN '달품달'
        WHEN title = '햇빛의 눈동자' THEN '석양이 진다'
        WHEN title = '나디아 연대기' THEN '나대지마 연대기'
        WHEN title = '아프니까 청춘이다' THEN '아프리카 청춘이다'
        WHEN title = '소나기' THEN '우나기'
        WHEN title = '몽실언니' THEN '몽실형님'
        WHEN title = '우리들의 행복한 시간' THEN '너만 행복한 시간'
        WHEN title = '미래의 선택' THEN '양자역학'
        WHEN title = '바람의 나라' THEN '미세먼지의 나라'
        ELSE title
    END;
    
SELECT REPLACE ('Hello, World!', 'Hello', 'Hi') FROM dual;  --dual 테이블이 없을때 임시로 쓰는 임시 테이블

SELECT 'Hello' || ' World!' AS "ㅎㅇ" FROM dual;

/** 
     Hello World FROM DUAL 
        - LOWER 문자열을 소문자로 변환
        - UPPER 문자열을 대문자로 변환
        - INITCAP 각 단어의 첫 글자를 대문자로 변환
        - SUBSTR 문자열의 (1~5) 일부분 추출
        - TRIM '   Hello, World   ' 양쪽 공백 제거 
        - LTRIM '   Hello, World   ' 왼쪽 공백 제거
        - RTRIM '   Hello, Wolrd   ' 오른쪽 공백 제거
        - INSTR 문자열에서 Wrold 문자열의 위치 찾기
        - LENGTHB (여기서는 헬로우 월드! 활용)
        - LENGTH 활용하기
        - 왼쪽에 문자열을 채우고 싶다. -> LPAD 활용
        SELECT LPAD('5', 4, '0') FROM DUAL;
**/

-- Hello World FROM DUAL 
-- LOWER 문자열을 소문자로 변환
SELECT LOWER  ('   Hello, World   ')
FROM dual;

-- UPPER 문자열을 대문자로 변환
SELECT UPPER ('   Hello, World   ') FROM dual;

-- INICAP 각 단어의 첫 글자를 대문자로 변환
SELECT INITCAP('   hello, world   ') FROM dual;

-- SUBSTR 문자열의 (1~5) 일부분 추출  ( 문자열 , 시작하는 위치 , 시작하는위치에서부터 나타낼 거리)
SELECT SUBSTR('   Hello, World   ',4,5) FROM dual;   

-- TRIM '   Hello, World   ' 양쪽 공백 제거 
SELECT '   Hello, World   ', TRIM(' ')FROM DUAL;

-- LTRIM '   Hello, World   ' 왼쪽 공백 제거
SELECT LTRIM ('   Hello, World   ',' ') FROM DUAL;

-- RTRIM '   Hello, Wolrd   ' 오른쪽 공백 제거
SELECT RTRIM ('   Hello, World   ',' ') FROM DUAL;

-- INSTR 문자열에서 Wrold 문자열의 위치 찾기
SELECT INSTR('   Hello, World   ','World') FROM dual;
-- LENGTHB (여기서는 헬로우 월드! 활용)
SELECT LENGTHB ('헬로우 월드!') FROM DUAL;
-- LENGTH 활용하기
SELECT LENGTH ('   Hello,World   ') from dual;
-- 왼쪽에 문자열을 채우고 싶다. -> LPAD 활용
SELECT LPAD('hi', 19, '   Hello, World   ') from dual;
SELECT LPAD('5', 4, '0') FROM DUAL;

--서브쿼리활용해서 가장 비싼책의 정보
SELECT price 
FROM BOOK
WHERE price = (SELECT MAX(price) from book);

-- 윈도우 함수 RANK 활용해서 각 장르별로 가장 비싼 두번째 책 가져오기
SELECT b.*, RANK() OVER (PARTITION BY genre ORDER BY price DESC) AS RANK FROM BOOK b
WHERE RANK = 1;



-- 윈도우 함수 ROW_NUMBER 활용 해서 가장 비싼책 가져오기 장르별로 
SELECT * FROM ( SELECT b.* ROW_NUMBER() OVER(PARTITION BY genre ORDER BY price DESC)
          FROM BOOK b 
)
WHERE rn = 1;  -- rn = 행 번호 순서 번호를 나타내는 별칭 ( rn 뭘로 쓰던 상관없음 )
*/
/*
SELECT * FROM ( SELECT b.*, ROW_NUMBER() OVER(PARTITION BY genre ORDER BY price DESC)
-- genre 열을 기준으로 데이터를 분할하고 price 열을 기준으로 내림차순으로 정렬하여 각 분할된 그룹 내에서 순위 할당
          FROM BOOK b 
)
WHERE rn = 1;  -- rn = 행 번호 순서 번호를 나타내는 별칭
*/

--각 저자가 쓴 책 수가 2권 이상인 저자 찾기
SELECT author,count(author)
FROM BOOK
group by author
having count(author) >= 2;

--각 장르별로 판매된 가장 비싼 책을 가져오기
SELECT GENRE, price
FROM BOOK
WHERE price = (SELECT MAX(price) FROM BOOK);

--상위 5권의 책 가져오기  ROWNUM 사용
SELECT * FROM (
    SELECT ROWNUM AS rn, b.*
    FROM BOOK b
    )
WHERE rn <= 5;

-- 각 장르별로 평균가격과 최고 가격 가져오기
SELECT GENRE, AVG(PRICE) AS "평균 가격", MAX(PRICE) AS "최고 가격"
FROM BOOK
GROUP BY GENRE;

-- 'Romance' 장르의 책 중에서 제일 비싼 책 찾기
SELECT * FROM BOOK
WHERE GENRE = 'Romance' AND price = (SELECT MAX(price) FROM BOOK);

-- 가격대 별로 책의 판매량 ( CASE와 JOIN ) 판매량??
-- ( PRICE < 10 '상대적으로 구매할 수 있는 책' 10 AND price < 20 THEN '보통 책')

SELECT  b.title, b.author, b.genre, b.price, 
    CASE 
        WHEN PRICE < 10 THEN '저렴한 책'
        WHEN PRICE < 20 THEN '조금 비싼 책'
        ELSE '많이 비싼책'
    END AS "책 가격대",
    o.quantity
FROM BOOK b
JOIN orders o ON b.book_id = o.cafe_id;
    

    

--'소설' 장르의 책과 'Novel' 장르의 책 합치기 ( UNION )
SELECT GENRE, title FROM BOOK
WHERE GENRE = 'Fantasy'
UNION
SELECT GENRE, title FROM BOOK
WHERE GENRE = 'Novel';


--상위 5권의 책 가져오기 ( ROWNUM )
SELECT * FROM (SELECT ROWNUM AS rm, b.* FROM BOOK b)
WHERE rm <= 5;


--책의 출판 년도와 그 해에 출판된 책 수
SELECT b.PUBLICATION_YEAR, b.PUBLICATION_DATE, o.quantity FROM BOOK b
JOIN orders o ON b.book_id = o.order_id;

