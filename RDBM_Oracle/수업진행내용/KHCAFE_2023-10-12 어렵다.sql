-- ��ǰ ���̺� ����
CREATE TABLE products (
    product_id NUMBER(5) PRIMARY KEY,
    product_name VARCHAR2(100),
    category VARCHAR2(50),
    price NUMBER(10, 2),
    stock_quantity NUMBER(5)
);

--�ε��� ���� : ��ǰ �̸����� �˻��� ����ȭ
CREATE INDEX idx_product_name ON products(product_name);


--�ε��� ���� : ī�װ��� �˻��� ����ȭ
CREATE INDEX idx_category ON products(category);

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (1, '��Ʈ��', '������ǰ', 899.99,  10);

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (2, '����Ʈ��', '������ǰ', 499.99, 20);

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (3, 'Ŀ�Ǹӽ�', '������ǰ', 59.99, 5);

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (4, '�ȭ', '�Ź�', 79.99, 30);

--��ǰ �̸����� �˻� ( �ε��� Ȱ�� )
SELECT * FROM products
WHERE product_name = '��Ʈ��';

--�ֹ� ID �ֹ� �˻� ( �ε��� Ȱ���Ͽ� �ֹ� �˻� )
SELECT & FROM orders WHERE order_id = 7;


-- �ε��� Ȱ�� ������
-- cafe_id �� 6�� ī�信�� �ֹ� �˻�
SELECT * FROM cafes c
JOIN orders o ON c.cafe_id = o.cafe_id
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE c.cafe_id = 6;

--������� �����
SELECT * FROM orders WHERE cafe_id = 6;

-- 10.00 ~ 15.00 Ư�� ���� ������ �ֹ� �˻�
SELECT * FROM orders WHERE total_price >= 10.00 AND total_price <= 15.00;

--������� �����
SELECT * FROM orders WHERE total_price >= 10.10 AND total_price <= 15.00;

-- 2023-10-11 14:00:00 ~ 2023-10-11 15:00:00 ������ �ֹ��˻�
SELECT * FROM orders WHERE ORDER_DATE >= '2023-10-11 14:00:00' AND order_date <= '2023-10-11 15:00:00';

--������� �����
SELECT * FROM orders
WHERE order_date >= TIMESTAMP '2023-10-11 14:00:00'
AND order_date < TIMESTAMP '2023-10-11 15:00:00';

/************************** �Լ� ***************************/

--���ڿ����� Ư�� ���� �Ǵ� ���ڿ��� �ٸ� ���ڿ��� ��ü
SELECT REPLACE (description, 'ǳ��', '��') FROM menu;
SELECT product_name, REPLACE(product_name, '����Ʈ', '�ȶ���')
FROM products;

-- CONCAT �� ���ڿ��� ����
SELECT product_name || '���� : $' || TO_CHAR(price, '999.99')
FROM products;

-- SUBSTR ���ڿ� �Ϻ� ���� ( �÷�, ����~, ~����)
SELECT product_name, SUBSTR(product_name, 1, 3)
FROM products;

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (5, '�ĵ� ����', '�Ƿ�', 20.99, 33);

INSERT INTO products(product_id, product_name, category, price, stock_quantity)
VALUES (6, '���ǽ�', '�Ƿ�', 10.99, 2);

-- TRIM, LTRIM, RTRIM ���ڿ����� �����ϴµ� ��� EX) L,RTRIM ( �÷�, '�����ϰ���� ����' )
-- TRIM ���� �����ִ� ' ' (����)�� �����ϴµ� ���
-- LTRIM ���ڿ� (���ۺκ�)�� ' ' (����)������ 
-- RTRIM ���ڿ� ������ (���κ�)�� ' ' (����) �� ����
SELECT product_name, TRIM(' '), LTRIM(product_name, '��Ʈ'),
RTRIM(product_name,'��')
FROM products;

SELECT LTRIM(product_name) FROM products;

SELECT LTRIM(category, '��ǰ') FROM products;

SELECT LTRIM(category, '����') FROM products;

--������ǰ���� ��ǰ�� �����ϰ� ��� SELECT RTRIM Ȱ��
SELECT RTRIM(category, '��ǰ') FROM products;

-- INSTR : ���ڿ����� Ư�� ���� ��ġ INSTR(�÷���, ��ġ�� �˰���� ���ڿ�)
SELECT product_name, INSTR(product_name, ' ')
FROM products;

--LENGTHB, LENGTH : ����Ʈ ���ڿ� ����, ���ڴ����� ���ڿ� ����
SELECT product_name, LENGTHB(product_name), LENGTH(product_name)
FROM products;

-- ���� �� ��ǰ �̸� ã�� : 
SELECT product_name
FROM products
WHERE LENGTH(product_name) = (SELECT MAX(LENGTH(product_name)) FROM products);
-- WHERE LENGTH(product_name) �̺κа� ��ȣ �ߺ���


--��ǰ ���� �ݿø�
SELECT product_name, ROUND(price)  -- *, �÷��� �ȵ� (*�� ��θ� �����ϱ⶧����)
FROM products;



--��ǰ �̸��� ���� ���� ��ǰ ã�� INSTR
SELECT product_name
FROM products
WHERE INSTR(product_name, '��')  >0;         -- INSTR �� INT �̱⶧���� ���迬���ڸ� �־���� 


-- BOOK ���̺��� �� ������ �ȵ�� ���� ���� ���� (MODIFY ���ڿ�ũ�� �ø���, UNION ALL�߰� , ; ����)

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
SELECT 4, '�¹���', '������', 1997, '978-8936433598', 'Historical Fiction', '�ѱ� ����縦 ������� �� ���ϼҼ�.', 20.99, TO_DATE('1997-05-15', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 5, '����', '�ڰ渮', 1986, '978-8937409054', 'Historical Fiction', '�ѱ��� �ٴ�縦 ������� �� ���ϼҼ�.', 18.99, TO_DATE('1986-03-10', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 6, '�� �ٸ� ����', '������', 1942, '978-8930205551', 'Short Story', '������ �ڿ��� ������� ���� �׸� ������.', 15.99, TO_DATE('1942-10-05', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 7, '���� ���� ��', 'Ȳ����', 1973, '978-8937460148', 'Novel', '������ ������� �� �ΰ��� ��� ����� �׸� �Ҽ�.', 13.99, TO_DATE('1973-07-20', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 8, '�������κ����� ���', '������', 1941, '978-8937462807', 'Poetry', '������ ���ֿ� ����� �ݿ��� ����.', 12.99, TO_DATE('1941-06-15', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 9, '������ �� �״�', '��ȿ��', 2013, '978-8965702024', 'Romance', '�ܰ��ΰ� �ΰ��� ����� �׸� �θǽ� �Ҽ�.', 14.99, TO_DATE('2013-11-16', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 10, '�ܿ�ձ�', '�����', 2014, '978-8965702031', 'Fantasy', '���� �������� ������ ����� �� �ڸ��� �̾߱�.', 16.99, TO_DATE('2014-01-10', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 11, '������ ���� �뷡', '������', 2011, '978-8965702048', 'Fantasy', '����� ����� ����� ��ġ�� �׸� ��Ÿ�� �Ҽ�.', 19.99, TO_DATE('2011-04-20', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 12, '�ظ� ǰ�� ��', '������', 2012, '978-8965702055', 'Historical Fiction', '�հ� ������ ������ ����� �׸� �Ҽ�.', 18.99, TO_DATE('2012-09-15', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 13, '���� ������', '�̵���', 2015, '978-8965702062', 'Sci-Fi', '�̷��� ���б���� ������� �� ���� �Ҽ�.', 17.99, TO_DATE('2015-02-10', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 14, '�ٶ��� ����', '������', 2006, '978-8965702079', 'Fantasy', '��븦 ������� �� ��Ÿ�� ���ϼҼ�.', 20.99, TO_DATE('2006-05-17', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 15, '�̷��� ����', '������', 2016, '978-8965702086', 'Sci-Fi', 'Ÿ�Ӹӽ��� �߽����� �� ���� �Ҽ�.', 15.99, TO_DATE('2016-07-20', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 16, '���� ���� �ʸ� ����', '������', 1992, '978-8936434120', 'Poetry', '����� ���� ������ �� ����.', 12.99, TO_DATE('1992-04-10', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 17, '�����ϱ� û���̴�', '�賭��', 2009, '978-8934938841', 'Essay', 'û���� ���İ� ����� ���� ������.', 14.99, TO_DATE('2009-11-11', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 18, '�ҳ���', 'Ȳ����', 1953, '978-8930207562', 'Short Story', '� ������ �߾�� ����� �׸� ������.', 13.99, TO_DATE('1953-05-15', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 19, '�츮���� �ູ�� �ð�', '������', 2005, '978-8934918874', 'Novel', '��å���� �ô޸��� ������ �������� �̾߱�.', 16.99, TO_DATE('2005-04-20', 'YYYY-MM-DD'), 'Y' FROM dual
UNION ALL
SELECT 20, '���Ǿ��', '�����', 2018, '978-8937464252', 'Novel', '�ѱ� ���빮ȭ�� ������� �� ������ �̾߱�.', 18.99, TO_DATE('2018-10-25', 'YYYY-MM-DD'), 'Y' FROM dual;


-- UPDATE�� SET �� �̿��� title �̸� ����
UPDATE book
SET title = '�¹�Ѹ�'
WHERE title = '�¹���';  

UPDATE book
SET title = '��'
WHERE title = '����';

SELECT title FROM BOOK;

UPDATE BOOK SET title = '�� �ٸ� ����' WHERE BOOK_ID = 6;

--å�̸��� ����� ����� 7~10������ �����ϰ��� �� BETWEEN
UPDATE BOOK
SET title = '����� �����'
WHERE book_id BETWEEN 7 AND 10;

--UPDATE �� �̿��ؼ� ������ �����ϴ� ���
UPDATE BOOK
SET title = 
    CASE 
        WHEN title = '������ ���� �뷡' THEN '������ �ٴ��� �뷡'
        WHEN title = '�ظ� ǰ�� ��' THEN '���� ǰ�� ��'
        WHEN title = '���� ������' THEN '�޺��� ������'
        ELSE title
    END;
    
UPDATE BOOK
SET title =
    CASE
        WHEN title = '������ �ٴ��� �뷡' THEN '��ٳ�'
        WHEN title = '�޸� ǰ�� ��' THEN '��ǰ��'
        WHEN title = '�޺��� ������' THEN '������ ����'
        WHEN title = '����� �����' THEN '�������� �����'
        WHEN title = '�����ϱ� û���̴�' THEN '������ī û���̴�'
        WHEN title = '�ҳ���' THEN '�쳪��'
        WHEN title = '���Ǿ��' THEN '��������'
        WHEN title = '�츮���� �ູ�� �ð�' THEN '�ʸ� �ູ�� �ð�'
        WHEN title = '�̷��� ����' THEN '���ڿ���'
        WHEN title = '�ٶ��� ����' THEN '�̼������� ����'
        ELSE title
    END;
    
SELECT REPLACE ('Hello, World!', 'Hello', 'Hi') FROM dual;  --dual ���̺��� ������ �ӽ÷� ���� �ӽ� ���̺�

SELECT 'Hello' || ' World!' AS "����" FROM dual;

/** 
     Hello World FROM DUAL 
        - LOWER ���ڿ��� �ҹ��ڷ� ��ȯ
        - UPPER ���ڿ��� �빮�ڷ� ��ȯ
        - INITCAP �� �ܾ��� ù ���ڸ� �빮�ڷ� ��ȯ
        - SUBSTR ���ڿ��� (1~5) �Ϻκ� ����
        - TRIM '   Hello, World   ' ���� ���� ���� 
        - LTRIM '   Hello, World   ' ���� ���� ����
        - RTRIM '   Hello, Wolrd   ' ������ ���� ����
        - INSTR ���ڿ����� Wrold ���ڿ��� ��ġ ã��
        - LENGTHB (���⼭�� ��ο� ����! Ȱ��)
        - LENGTH Ȱ���ϱ�
        - ���ʿ� ���ڿ��� ä��� �ʹ�. -> LPAD Ȱ��
        SELECT LPAD('5', 4, '0') FROM DUAL;
**/

-- Hello World FROM DUAL 
-- LOWER ���ڿ��� �ҹ��ڷ� ��ȯ
SELECT LOWER  ('   Hello, World   ')
FROM dual;

-- UPPER ���ڿ��� �빮�ڷ� ��ȯ
SELECT UPPER ('   Hello, World   ') FROM dual;

-- INICAP �� �ܾ��� ù ���ڸ� �빮�ڷ� ��ȯ
SELECT INITCAP('   hello, world   ') FROM dual;

-- SUBSTR ���ڿ��� (1~5) �Ϻκ� ����  ( ���ڿ� , �����ϴ� ��ġ , �����ϴ���ġ�������� ��Ÿ�� �Ÿ�)
SELECT SUBSTR('   Hello, World   ',4,5) FROM dual;   

-- TRIM '   Hello, World   ' ���� ���� ���� 
SELECT '   Hello, World   ', TRIM(' ')FROM DUAL;

-- LTRIM '   Hello, World   ' ���� ���� ����
SELECT LTRIM ('   Hello, World   ',' ') FROM DUAL;

-- RTRIM '   Hello, Wolrd   ' ������ ���� ����
SELECT RTRIM ('   Hello, World   ',' ') FROM DUAL;

-- INSTR ���ڿ����� Wrold ���ڿ��� ��ġ ã��
SELECT INSTR('   Hello, World   ','World') FROM dual;
-- LENGTHB (���⼭�� ��ο� ����! Ȱ��)
SELECT LENGTHB ('��ο� ����!') FROM DUAL;
-- LENGTH Ȱ���ϱ�
SELECT LENGTH ('   Hello,World   ') from dual;
-- ���ʿ� ���ڿ��� ä��� �ʹ�. -> LPAD Ȱ��
SELECT LPAD('hi', 19, '   Hello, World   ') from dual;
SELECT LPAD('5', 4, '0') FROM DUAL;

--��������Ȱ���ؼ� ���� ���å�� ����
SELECT price 
FROM BOOK
WHERE price = (SELECT MAX(price) from book);

-- ������ �Լ� RANK Ȱ���ؼ� �� �帣���� ���� ��� �ι�° å ��������
SELECT b.*, RANK() OVER (PARTITION BY genre ORDER BY price DESC) AS RANK FROM BOOK b
WHERE RANK = 1;



-- ������ �Լ� ROW_NUMBER Ȱ�� �ؼ� ���� ���å �������� �帣���� 
SELECT * FROM ( SELECT b.* ROW_NUMBER() OVER(PARTITION BY genre ORDER BY price DESC)
          FROM BOOK b 
)
WHERE rn = 1;  -- rn = �� ��ȣ ���� ��ȣ�� ��Ÿ���� ��Ī ( rn ���� ���� ������� )
*/
/*
SELECT * FROM ( SELECT b.*, ROW_NUMBER() OVER(PARTITION BY genre ORDER BY price DESC)
-- genre ���� �������� �����͸� �����ϰ� price ���� �������� ������������ �����Ͽ� �� ���ҵ� �׷� ������ ���� �Ҵ�
          FROM BOOK b 
)
WHERE rn = 1;  -- rn = �� ��ȣ ���� ��ȣ�� ��Ÿ���� ��Ī
*/

--�� ���ڰ� �� å ���� 2�� �̻��� ���� ã��
SELECT author,count(author)
FROM BOOK
group by author
having count(author) >= 2;

--�� �帣���� �Ǹŵ� ���� ��� å�� ��������
SELECT GENRE, price
FROM BOOK
WHERE price = (SELECT MAX(price) FROM BOOK);

--���� 5���� å ��������  ROWNUM ���
SELECT * FROM (
    SELECT ROWNUM AS rn, b.*
    FROM BOOK b
    )
WHERE rn <= 5;

-- �� �帣���� ��հ��ݰ� �ְ� ���� ��������
SELECT GENRE, AVG(PRICE) AS "��� ����", MAX(PRICE) AS "�ְ� ����"
FROM BOOK
GROUP BY GENRE;

-- 'Romance' �帣�� å �߿��� ���� ��� å ã��
SELECT * FROM BOOK
WHERE GENRE = 'Romance' AND price = (SELECT MAX(price) FROM BOOK);

-- ���ݴ� ���� å�� �Ǹŷ� ( CASE�� JOIN ) �Ǹŷ�??
-- ( PRICE < 10 '��������� ������ �� �ִ� å' 10 AND price < 20 THEN '���� å')

SELECT  b.title, b.author, b.genre, b.price, 
    CASE 
        WHEN PRICE < 10 THEN '������ å'
        WHEN PRICE < 20 THEN '���� ��� å'
        ELSE '���� ���å'
    END AS "å ���ݴ�",
    o.quantity
FROM BOOK b
JOIN orders o ON b.book_id = o.cafe_id;
    

    

--'�Ҽ�' �帣�� å�� 'Novel' �帣�� å ��ġ�� ( UNION )
SELECT GENRE, title FROM BOOK
WHERE GENRE = 'Fantasy'
UNION
SELECT GENRE, title FROM BOOK
WHERE GENRE = 'Novel';


--���� 5���� å �������� ( ROWNUM )
SELECT * FROM (SELECT ROWNUM AS rm, b.* FROM BOOK b)
WHERE rm <= 5;


--å�� ���� �⵵�� �� �ؿ� ���ǵ� å ��
SELECT b.PUBLICATION_YEAR, b.PUBLICATION_DATE, o.quantity FROM BOOK b
JOIN orders o ON b.book_id = o.order_id;

