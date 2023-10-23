CREATE TABLE USERINFO (
    user_id NUMBER(10) PRIMARY KEY,
    username VARCHAR2(50),
    email VARCHAR2(100),
    reg_date DATE
);

INSERT INTO USERINFO (user_id, username, email, reg_date)
VALUES (1, 'kh1', NULL, TO_DATE('2023-10-23','YYYY-MM-DD'));

SELECT * FROM USERINFO WHERE email IS NULL AND user_id IS NOT NULL;
-- NULL 은 존재하지 않는 값이므로 일반적인 비교 연산자로 처리할 수 없음
-- SQL에서는 NULL 값을 비교하기 위해서 특수한 방법으로 처리할 수 있음
-- IS NULL, IS NOT NULL  사용해야함


-- 제품 평균가격이 9 이상 하는 카테고리를 찾고 싶음
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


