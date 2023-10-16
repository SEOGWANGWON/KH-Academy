CREATE TABLE cafes(
    cafe_id INT PRIMARY KEY,
    cname VARCHAR2(255) NOT NULL,
    address VARCHAR2(255),
    phone_number VARCHAR2(15),
    operating_hours VARCHAR2(255)
);

CREATE SEQUENCE cafe_seq
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;
CREATE OR REPLACE TRIGGER cafe_trigger
BEFORE INSERT ON cafes
FOR EACH ROW
BEGIN
    SELECT cafe_seq.NEXTVAL
    INTO:NEW.cafe_id
    FROM dual;
END;
/
COMMIT;
CREATE TABLE menu (
    menu_id INT PRIMARY KEY,
    cafe_id int,
    menu_name VARCHAR2(255) NOT NULL,
    price NUMBER(8,2) NOT NULL,
    CONSTRAINT fk_cafe
        FOREIGN KEY (cafe_id)   -- 다른 테이블 값을 참조하는 키
        REFERENCES cafes(cafe_id)   -- 테이블 관계를 정리
);

/*
오류 발생 : ORA-00054: 리소스가 사용 중이어서 NOWAIT가 지정되었거나 시간 초과가 만료된 상태로 획득합니다.
오류 발생으로 인한 세션 킬 코드
SELECT object_id, object_type FROM dba_objects WHERE object_name='CAFES';
SELECT * FROM v$locked_object WHERE object_id= 77182;
SELECT sid, serial#, command, taddr FROM v$session WHERE sid = 497;
ALTER SYSTEM KILL SESSION '497, 47424';
*/

INSERT INTO menu (menu_id, cafe_id, menu_name, price)
VALUES (1, 2, '에스프레소', 3.50);

ALTER TABLE menu ADD description VARCHAR2 (500);

UPDATE menu
SET menu_name = '고든램지의 혼신의 힘을 담은 비프 웰링턴'
WHERE menu_id = 1 AND cafe_id = 2;

UPDATE menu
SET price = 49.99
WHERE menu_id = 1 AND cafe_id = 2;

-- menu 2
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (2, 4, '아메리카노', 4.00, '매끈한 아메리카노 커피');

-- menu 3
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (3, 6, '카페 라떼', 4.50, '부드러운 카페 라떼');
-- menu 4
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (4, 8, '카푸치노', 4.50, '크림이 올라간 카푸치노');
-- menu 5
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (5, 10, '아이스 커피', 3.75, '시원한 아이스 커피');
-- menu 6
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (6, 12, '모카라떼', 5.00, '초콜릿 풍미의 모카라떼');
-- menu 7
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (7, 14, '핫 초코렛', 4.25, '따뜻한 핫 초콜릿');
-- menu 8
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (8, 16, '카페 아메리카노', 3.75, '매쁜한 카페 아메리카노');
-- menu 9
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (9, 18, '카페 모카', 4.50, '모카풍미의 카페 모카');
-- menu 10
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (10, 20, '바닐라 라떼', 4.25, '바닐라 향의 라떼');

INSERT INTO menu (menu_id, cafe_id, menu_name, price)
VALUES (11, 22, '에스프레소', 3.50);

UPDATE menu
SET menu_name = '영국 현지인들이 인정한 가게의 피쉬 앤 칩스'
WHERE menu_id = 11 AND cafe_id = 22;

UPDATE menu
SET price = 6.99
WHERE menu_id = 11 AND cafe_id = 22;

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (12, 24, '이연복셰프의 정수를 담은 동파육', 8.99, '둘이먹다 다섯이 죽는맛');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (13, 26, '롯데리아 핫크리스피 버거', 4.99, '담백하고 영양이 좋지만 살짝 매운');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (14, 28, '맥주창고', 4.49, '저렴하고 다양한 메뉴');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (15, 30, '말차밀크티', 4.00, '고소하고 은은한 향과 맛');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (16, 32, '대파, 콩나물을 잔뜩 넣은 해장열라면', 4.00, '얼큰하고 속이 시원한 라면');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (17, 34, '사골육수로 끓이고 수제햄을 넣은 부대찌개', 13.99, '깊은 육수맛과 신선한 햄');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (18, 36, '랜덤메뉴', 7.99, '뭐가 나올지 몰라요');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (19, 38, '제육덮밥', 6.49, '남자라면 누구나 좋아하는 맛');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (20, 38, '참치김밥', 4.49, '참치가득 마요네즈 가득');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (21, 8, '아메리카노', 4.00, '매끈한 아메리카노 커피');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (22, 10, '카페 라떼', 4.50, '부드러운 카페 라떼');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (23, 12, '카푸치노', 4.50, '크림이 올라간 카푸치노');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (24, 14, '아이스 커피', 3.75, '시원한 아이스 커피');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (25, 16, '모카라떼', 5.00, '초콜릿 풍미의 모카라떼');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (26, 28, '핫 초코렛', 4.25, '따뜻한 핫 초콜릿');

-- 서울에 위치한 모든 카페 조회 : SELECT * FROM cafes WHERE address LIKE '%서울%';

SELECT * FROM cafes WHERE address LIKE '%서울%'; -- cafes 테이블의 address 컬럼에 있는 '서울'을 키워드로 반환

--메뉴가 아메리카노가 있는 카페 찾기 : 
--SELECT c.CNAME, m.menu_name 
--FROM cafes c 
--JOIN menu m ON c.cafe_id = m.cafe_id
--WHERE m.menu_name = '아메리카노';

SELECT c.CNAME AS 카페명, m.menu_name AS 메뉴명
FROM cafes c 
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE m.menu_name = '아메리카노'; -- '아메리카노' 키워드로 추출해서 반환

--주말(토요일 or 일요일)에 운영되는 카페 목록
SELECT * FROM cafes WHERE operating_hours LIKE '%주말%';

--02를 포함하는 전화번호를 가지는 서울의 카페 찾기 
SELECT * FROM cafes WHERE address LIKE '%서울%' AND phone_number LIKE '%02%';

--이름에 라떼가 포함된 카페 찾기
SELECT * FROM cafes WHERE cname LIKE '%라떼%';

--4.00 미만의 가격을 가진 메뉴 항목 찾기
SELECT * FROM menu WHERE price <=3.99;

/*
참고한 글 
select uname, kor
from sungjuk
where kor>=50;
*/

--매일 운영되는 카페 찾기
SELECT * FROM cafes WHERE operating_hours LIKE '%월-금%' AND operating_hours LIKE '%주말%';

--매일 운영되고 가격 4.00 미만의 가격을 가진 카페 찾기 ( 못풀었음 )
SELECT * FROM cafes WHERE operating_hours LIKE '%월-금%' AND operating_hours LIKE '%주말%' AND price <=3.99;

--대 라는 이름을 가진 카페 찾기
SELECT * FROM cafes WHERE cname LIKE '%대%';

--모든 카페의 메뉴 항목 수 계산: ( 못풀었음 )
SELECT cname,menu_name,COUNT() AS 메뉴갯수 FROM cafes, menu; 

--메뉴 설명에 '아이스'가 포함된 카페 찾기:
SELECT * 
FROM cafes c
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE m.description LIKE '%아이스%';

--각 카페별 모든 메뉴 항목의 총 가격 계산: (못풀었음)
SELECT c.cname, m.menu_name, SUM(m.price) AS 모든메뉴의가격
FROM cafes c
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE m.price;


--'초콜릿'이 설명에 포함된 메뉴 항목이 있는 카페 선택:
SELECT c.cname , m.description
FROM cafes c
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE m.description LIKE '%초콜릿%';



CREATE TABLE orders (
    order_id NUMBER PRIMARY KEY,
    cafe_id NUMBER,
    menu_id NUMBER,
    order_date TIMESTAMP,
    quantity NUMBER,
    total_price NUMBER
);
--외래 키 제약 조건 추가
ALTER TABLE orders
ADD CONSTRAINT fk_orders_cafe
FOREIGN KEY (cafe_id)
REFERENCES cafes(cafe_id);

ALTER TABLE orders
ADD CONSTRAINT fk_orders_menu
FOREIGN KEY (menu_id)
REFERENCES menu(menu_id);



--테이블 코멘트 추가
COMMENT ON TABLE orders IS '주문 정보를 저장하는 테이블';

--열 코멘트 추가
COMMENT ON COLUMN orders.order_id IS '주문을 고유하게 식별하는 번호';
COMMENT ON COLUMN orders.cafe_id IS '주문이 발생한 카페의 ID';
COMMENT ON COLUMN orders.menu_id IS '주문한 메뉴 항목의 ID';
COMMENT ON COLUMN orders.order_date IS '주문이 발생한 날짜와 시간';
COMMENT ON COLUMN orders.quantity IS '주문한 메뉴 항목의 수량';
COMMENT ON COLUMN orders.total_price IS '주문 총 금액';

--첫 주문 주문 테이블에 추가
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (1, 2, 1, TIMESTAMP '2023-10-11 14:30:00', 2, 7.00);

--두번째 주문 주문 테이블에 추가
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (2, 4, 2, TIMESTAMP '2023-10-11 12:30:40', 2, 7.00);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 1;

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 2;


/*
SELECT
    --주문 번호         --카페이름              --메뉴이름  
    o.order_id,     c.cname AS cafe_name,    m.menu_name,
    --메뉴가격          --총수량               --총금액
    m.price,          o.quantity,            o.total_price
FROM ORDERS o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.menu_id = m.menu_id;
WHERE o.order_id = 1;
*/

/*******************************
      수정된 insert 문
********************************/

-- 주문 3
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (3, 4, 4, TIMESTAMP '2023-10-11 10:00:00', 1, 4.50);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 3;

-- 주문 4
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (4, 6, 6, TIMESTAMP '2023-10-11 17:15:00', 2, 10.00);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 4;

--cafe_id = 6; 의 카페에 메뉴가 없어서 추가
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (21, 6, '수박 화채', 11.49, '과일통조림을 마구마구 넣었다!');

--주문 5
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (5, 8, 8, TIMESTAMP '2023-10-11 16:30:00', 3, 11.25);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 5;

--  주문 6
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (6, 10, 10, TIMESTAMP '2023-10-11 15:45:00', 1, 4.25);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 6;

-- 주문 7
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (7, 12, 12, TIMESTAMP '2023-10-11 13:15:00', 2, 10.00);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 7;

-- 주문 8
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (8, 14, 14, TIMESTAMP '2023-10-11 11:00:00', 4, 18.00);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 8;

-- 주문 9
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (9, 16, 16, TIMESTAMP '2023-10-11 18:30:00', 2, 9.00);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 9;

-- 주문 10
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (10, 18, 18, TIMESTAMP '2023-10-11 19:45:00', 1, 4.50);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 10;

/*******************************
      추가된 insert 문
********************************/

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (11, 6, 7, TIMESTAMP '2023-10-11 14:30:00', 3, 12.75);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (12, 8, 8, TIMESTAMP '2023-10-11 15:45:00', 2, 7.50);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (13, 8, 9, TIMESTAMP '2023-10-11 16:00:00', 1, 4.50);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (14, 10, 10, TIMESTAMP '2023-10-11 11:30:00', 4, 17.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (15, 12, 11, TIMESTAMP '2023-10-11 13:15:00', 2, 7.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (16, 14, 12, TIMESTAMP '2023-10-11 12:45:00', 3, 13.50);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (17, 24, 13, TIMESTAMP '2023-10-11 17:30:00', 1, 4.25);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (18, 28, 14, TIMESTAMP '2023-10-11 18:15:00', 2, 9.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (19, 30, 15, TIMESTAMP '2023-10-11 19:00:00', 1, 5.50);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (20, 2, 16, TIMESTAMP '2023-10-11 14:00:00', 3, 15.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (21, 26, 17, TIMESTAMP '2023-10-11 15:30:00', 4, 18.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (22, 32, 18, TIMESTAMP '2023-10-11 16:45:00', 2, 9.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (23, 34, 19, TIMESTAMP '2023-10-11 12:15:00', 1, 4.50);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (24, 36, 21, TIMESTAMP '2023-10-11 14:30:00', 3, 12.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (25, 38, 22, TIMESTAMP '2023-10-11 15:45:00', 2, 9.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (26, 24, 23, TIMESTAMP '2023-10-11 17:30:00', 2, 9.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (27, 14, 24, TIMESTAMP '2023-10-11 18:45:00', 3, 13.50);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (28, 16, 25, TIMESTAMP '2023-10-11 19:15:00', 1, 4.25);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (29, 28, 26, TIMESTAMP '2023-10-11 10:00:00', 4, 17.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (30, 28, 21, TIMESTAMP '2023-10-11 14:15:00', 2, 8.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (31, 30, 21, TIMESTAMP '2023-10-11 14:45:00', 2, 8.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (32, 32, 22, TIMESTAMP '2023-10-11 17:00:00', 4, 18.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (33, 34, 23, TIMESTAMP '2023-10-11 18:30:00', 1, 4.50);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (34, 34, 24, TIMESTAMP '2023-10-11 19:15:00', 2, 9.00);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (35, 36, 25, TIMESTAMP '2023-10-11 10:45:00', 3, 13.50);

INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (36, 38, 26, TIMESTAMP '2023-10-11 12:00:00', 1, 4.25);

-- 특정 카페의 주문 조회 (in 바다 카페 주문 조회
SELECT c.cname, o.order_id, m.menu_id, m.menu_name, o.order_date, o.quantity, o.total_price
FROM cafes c
JOIN orders o ON c.cafe_id = o.cafe_id
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE c.cname LIKE 'in 바다'; -- 서브쿼리로도 가능

-- 특정 주문 날짜 범위 내 주문 조회
SELECT o.order_id, c.cname, m.menu_id, m.menu_name, o.order_date, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_date >= '23/10/11 12:00:00';

-- 각 카페별 주문 총액 조회   ( 못 풀었음 )
SELECT c.cname, m.menu_name, o.quantity AS 주문수, o.total_price AS 총_가격
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_date >= '23/10/11 12:00:00';


DELETE FROM orders WHERE order_id =36;
DELETE FROM orders WHERE order_id BETWEEN 33 AND 35;
-- 10~23 번까지 삭제
DELETE FROM orders WHERE order_id BETWEEN 10 AND 23;



