CREATE TABLE USERINFO (
    user_id NUMBER(10) PRIMARY KEY,
    username VARCHAR2(50),
    email VARCHAR2(100),
    reg_date DATE
);

INSERT INTO USERINFO (user_id, username, email, reg_date)
VALUES (1, 'kh1', NULL, TO_DATE('2023-10-23','YYYY-MM-DD'));

SELECT * FROM USERINFO WHERE email IS NULL AND user_id IS NOT NULL;
-- NULL �� �������� �ʴ� ���̹Ƿ� �Ϲ����� �� �����ڷ� ó���� �� ����
-- SQL������ NULL ���� ���ϱ� ���ؼ� Ư���� ������� ó���� �� ����
-- IS NULL, IS NOT NULL  ����ؾ���


-- ��ǰ ��հ����� 9 �̻� �ϴ� ī�װ��� ã�� ����
select product_name, sum(price), AVG(PRICE), COUNT(*)
FROM PRODUCTS
WHERE PRICE >= 9
GROUP BY product_name
ORDER BY AVG(PRICE) ASC;

CREATE TABLE HELLO (
    user_id number(10) primary key,
    username varchar2(100),
    likefood varchar2(100),
    phone_number varchar2(15)
);


