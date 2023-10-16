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
        FOREIGN KEY (cafe_id)   -- �ٸ� ���̺� ���� �����ϴ� Ű
        REFERENCES cafes(cafe_id)   -- ���̺� ���踦 ����
);

/*
���� �߻� : ORA-00054: ���ҽ��� ��� ���̾ NOWAIT�� �����Ǿ��ų� �ð� �ʰ��� ����� ���·� ȹ���մϴ�.
���� �߻����� ���� ���� ų �ڵ�
SELECT object_id, object_type FROM dba_objects WHERE object_name='CAFES';
SELECT * FROM v$locked_object WHERE object_id= 77182;
SELECT sid, serial#, command, taddr FROM v$session WHERE sid = 497;
ALTER SYSTEM KILL SESSION '497, 47424';
*/

INSERT INTO menu (menu_id, cafe_id, menu_name, price)
VALUES (1, 2, '����������', 3.50);

ALTER TABLE menu ADD description VARCHAR2 (500);

UPDATE menu
SET menu_name = '��緥���� ȥ���� ���� ���� ���� ������'
WHERE menu_id = 1 AND cafe_id = 2;

UPDATE menu
SET price = 49.99
WHERE menu_id = 1 AND cafe_id = 2;

-- menu 2
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (2, 4, '�Ƹ޸�ī��', 4.00, '�Ų��� �Ƹ޸�ī�� Ŀ��');

-- menu 3
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (3, 6, 'ī�� ��', 4.50, '�ε巯�� ī�� ��');
-- menu 4
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (4, 8, 'īǪġ��', 4.50, 'ũ���� �ö� īǪġ��');
-- menu 5
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (5, 10, '���̽� Ŀ��', 3.75, '�ÿ��� ���̽� Ŀ��');
-- menu 6
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (6, 12, '��ī��', 5.00, '���ݸ� ǳ���� ��ī��');
-- menu 7
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (7, 14, '�� ���ڷ�', 4.25, '������ �� ���ݸ�');
-- menu 8
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (8, 16, 'ī�� �Ƹ޸�ī��', 3.75, '�Ż��� ī�� �Ƹ޸�ī��');
-- menu 9
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (9, 18, 'ī�� ��ī', 4.50, '��īǳ���� ī�� ��ī');
-- menu 10
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (10, 20, '�ٴҶ� ��', 4.25, '�ٴҶ� ���� ��');

INSERT INTO menu (menu_id, cafe_id, menu_name, price)
VALUES (11, 22, '����������', 3.50);

UPDATE menu
SET menu_name = '���� �����ε��� ������ ������ �ǽ� �� Ĩ��'
WHERE menu_id = 11 AND cafe_id = 22;

UPDATE menu
SET price = 6.99
WHERE menu_id = 11 AND cafe_id = 22;

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (12, 24, '�̿��������� ������ ���� ������', 8.99, '���̸Դ� �ټ��� �״¸�');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (13, 26, '�Ե����� ��ũ������ ����', 4.99, '����ϰ� ������ ������ ��¦ �ſ�');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (14, 28, '����â��', 4.49, '�����ϰ� �پ��� �޴�');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (15, 30, '������ũƼ', 4.00, '����ϰ� ������ ��� ��');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (16, 32, '����, �ᳪ���� �ܶ� ���� ���忭���', 4.00, '��ū�ϰ� ���� �ÿ��� ���');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (17, 34, '��������� ���̰� �������� ���� �δ��', 13.99, '���� �������� �ż��� ��');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (18, 36, '�����޴�', 7.99, '���� ������ �����');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (19, 38, '��������', 6.49, '���ڶ�� ������ �����ϴ� ��');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (20, 38, '��ġ���', 4.49, '��ġ���� ������� ����');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (21, 8, '�Ƹ޸�ī��', 4.00, '�Ų��� �Ƹ޸�ī�� Ŀ��');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (22, 10, 'ī�� ��', 4.50, '�ε巯�� ī�� ��');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (23, 12, 'īǪġ��', 4.50, 'ũ���� �ö� īǪġ��');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (24, 14, '���̽� Ŀ��', 3.75, '�ÿ��� ���̽� Ŀ��');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (25, 16, '��ī��', 5.00, '���ݸ� ǳ���� ��ī��');

INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (26, 28, '�� ���ڷ�', 4.25, '������ �� ���ݸ�');

-- ���￡ ��ġ�� ��� ī�� ��ȸ : SELECT * FROM cafes WHERE address LIKE '%����%';

SELECT * FROM cafes WHERE address LIKE '%����%'; -- cafes ���̺��� address �÷��� �ִ� '����'�� Ű����� ��ȯ

--�޴��� �Ƹ޸�ī�밡 �ִ� ī�� ã�� : 
--SELECT c.CNAME, m.menu_name 
--FROM cafes c 
--JOIN menu m ON c.cafe_id = m.cafe_id
--WHERE m.menu_name = '�Ƹ޸�ī��';

SELECT c.CNAME AS ī���, m.menu_name AS �޴���
FROM cafes c 
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE m.menu_name = '�Ƹ޸�ī��'; -- '�Ƹ޸�ī��' Ű����� �����ؼ� ��ȯ

--�ָ�(����� or �Ͽ���)�� ��Ǵ� ī�� ���
SELECT * FROM cafes WHERE operating_hours LIKE '%�ָ�%';

--02�� �����ϴ� ��ȭ��ȣ�� ������ ������ ī�� ã�� 
SELECT * FROM cafes WHERE address LIKE '%����%' AND phone_number LIKE '%02%';

--�̸��� �󶼰� ���Ե� ī�� ã��
SELECT * FROM cafes WHERE cname LIKE '%��%';

--4.00 �̸��� ������ ���� �޴� �׸� ã��
SELECT * FROM menu WHERE price <=3.99;

/*
������ �� 
select uname, kor
from sungjuk
where kor>=50;
*/

--���� ��Ǵ� ī�� ã��
SELECT * FROM cafes WHERE operating_hours LIKE '%��-��%' AND operating_hours LIKE '%�ָ�%';

--���� ��ǰ� ���� 4.00 �̸��� ������ ���� ī�� ã�� ( ��Ǯ���� )
SELECT * FROM cafes WHERE operating_hours LIKE '%��-��%' AND operating_hours LIKE '%�ָ�%' AND price <=3.99;

--�� ��� �̸��� ���� ī�� ã��
SELECT * FROM cafes WHERE cname LIKE '%��%';

--��� ī���� �޴� �׸� �� ���: ( ��Ǯ���� )
SELECT cname,menu_name,COUNT() AS �޴����� FROM cafes, menu; 

--�޴� ���� '���̽�'�� ���Ե� ī�� ã��:
SELECT * 
FROM cafes c
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE m.description LIKE '%���̽�%';

--�� ī�亰 ��� �޴� �׸��� �� ���� ���: (��Ǯ����)
SELECT c.cname, m.menu_name, SUM(m.price) AS ���޴��ǰ���
FROM cafes c
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE m.price;


--'���ݸ�'�� ���� ���Ե� �޴� �׸��� �ִ� ī�� ����:
SELECT c.cname , m.description
FROM cafes c
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE m.description LIKE '%���ݸ�%';



CREATE TABLE orders (
    order_id NUMBER PRIMARY KEY,
    cafe_id NUMBER,
    menu_id NUMBER,
    order_date TIMESTAMP,
    quantity NUMBER,
    total_price NUMBER
);
--�ܷ� Ű ���� ���� �߰�
ALTER TABLE orders
ADD CONSTRAINT fk_orders_cafe
FOREIGN KEY (cafe_id)
REFERENCES cafes(cafe_id);

ALTER TABLE orders
ADD CONSTRAINT fk_orders_menu
FOREIGN KEY (menu_id)
REFERENCES menu(menu_id);



--���̺� �ڸ�Ʈ �߰�
COMMENT ON TABLE orders IS '�ֹ� ������ �����ϴ� ���̺�';

--�� �ڸ�Ʈ �߰�
COMMENT ON COLUMN orders.order_id IS '�ֹ��� �����ϰ� �ĺ��ϴ� ��ȣ';
COMMENT ON COLUMN orders.cafe_id IS '�ֹ��� �߻��� ī���� ID';
COMMENT ON COLUMN orders.menu_id IS '�ֹ��� �޴� �׸��� ID';
COMMENT ON COLUMN orders.order_date IS '�ֹ��� �߻��� ��¥�� �ð�';
COMMENT ON COLUMN orders.quantity IS '�ֹ��� �޴� �׸��� ����';
COMMENT ON COLUMN orders.total_price IS '�ֹ� �� �ݾ�';

--ù �ֹ� �ֹ� ���̺� �߰�
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (1, 2, 1, TIMESTAMP '2023-10-11 14:30:00', 2, 7.00);

--�ι�° �ֹ� �ֹ� ���̺� �߰�
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
    --�ֹ� ��ȣ         --ī���̸�              --�޴��̸�  
    o.order_id,     c.cname AS cafe_name,    m.menu_name,
    --�޴�����          --�Ѽ���               --�ѱݾ�
    m.price,          o.quantity,            o.total_price
FROM ORDERS o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.menu_id = m.menu_id;
WHERE o.order_id = 1;
*/

/*******************************
      ������ insert ��
********************************/

-- �ֹ� 3
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (3, 4, 4, TIMESTAMP '2023-10-11 10:00:00', 1, 4.50);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 3;

-- �ֹ� 4
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (4, 6, 6, TIMESTAMP '2023-10-11 17:15:00', 2, 10.00);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 4;

--cafe_id = 6; �� ī�信 �޴��� ��� �߰�
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (21, 6, '���� ȭä', 11.49, '������������ �������� �־���!');

--�ֹ� 5
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (5, 8, 8, TIMESTAMP '2023-10-11 16:30:00', 3, 11.25);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 5;

--  �ֹ� 6
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (6, 10, 10, TIMESTAMP '2023-10-11 15:45:00', 1, 4.25);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 6;

-- �ֹ� 7
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (7, 12, 12, TIMESTAMP '2023-10-11 13:15:00', 2, 10.00);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 7;

-- �ֹ� 8
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (8, 14, 14, TIMESTAMP '2023-10-11 11:00:00', 4, 18.00);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 8;

-- �ֹ� 9
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (9, 16, 16, TIMESTAMP '2023-10-11 18:30:00', 2, 9.00);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 9;

-- �ֹ� 10
INSERT INTO orders (order_id, cafe_id, menu_id, order_date, quantity, total_price)
VALUES (10, 18, 18, TIMESTAMP '2023-10-11 19:45:00', 1, 4.50);

SELECT o.order_id, c.cname AS cafe_name, m.menu_name, m.price, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_id = 10;

/*******************************
      �߰��� insert ��
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

-- Ư�� ī���� �ֹ� ��ȸ (in �ٴ� ī�� �ֹ� ��ȸ
SELECT c.cname, o.order_id, m.menu_id, m.menu_name, o.order_date, o.quantity, o.total_price
FROM cafes c
JOIN orders o ON c.cafe_id = o.cafe_id
JOIN menu m ON c.cafe_id = m.cafe_id
WHERE c.cname LIKE 'in �ٴ�'; -- ���������ε� ����

-- Ư�� �ֹ� ��¥ ���� �� �ֹ� ��ȸ
SELECT o.order_id, c.cname, m.menu_id, m.menu_name, o.order_date, o.quantity, o.total_price
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_date >= '23/10/11 12:00:00';

-- �� ī�亰 �ֹ� �Ѿ� ��ȸ   ( �� Ǯ���� )
SELECT c.cname, m.menu_name, o.quantity AS �ֹ���, o.total_price AS ��_����
FROM orders o
JOIN cafes c ON o.cafe_id = c.cafe_id
JOIN menu m ON o.cafe_id = m.cafe_id
WHERE o.order_date >= '23/10/11 12:00:00';


DELETE FROM orders WHERE order_id =36;
DELETE FROM orders WHERE order_id BETWEEN 33 AND 35;
-- 10~23 ������ ����
DELETE FROM orders WHERE order_id BETWEEN 10 AND 23;



