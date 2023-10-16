/*
“고객 (Customers)", 
"주문 (Orders)",
 "제품 (Products)" 
세 가지 테이블 생성
 각 테이블에 샘플 데이터를 삽입
*/

-- 고객 (Customers)
CREATE TABLE Customers (
    c_id NUMBER(5) PRIMARY KEY,
    c_name VARCHAR2(50),
    c_email VARCHAR2(100),
    c_birthdate DATE
    );


-- 주문 (Orders)
CREATE TABLE Orders (
    o_id NUMBER(5) PRIMARY KEY,
    o_date DATE,
    o_amount NUMBER(10, 2),
    c_id NUMBER(5),
    FOREIGN KEY (c_id) REFERENCES Customers(c_id)
    );


-- 제품 (Products) 
CREATE TABLE Products (
    p_id NUMBER(5) PRIMARY KEY,
    p_name VARCHAR2(50),
    p_price NUMBER(10, 2),
    p_quantity NUMBER(5)
);

-- 고객 데이터 삽입 (2개)
INSERT INTO Customers (c_id, c_name, c_email, c_birthdate)
VALUES (1, 'K Smith', 'john@example.com', TO_DATE('1990-05-15', 'YYYY-MM-DD'));

-- 주문 데이터 삽입 (2개)
INSERT INTO Orders (order_id, order_date, order_amount, customer_id) 
VALUES (1, TO_DATE('2023-10-05', 'YYYY-MM-DD'), 150.00, 1);

-- 제품 데이터 삽입 (총 2개)
INSERT INTO Products (product_id, product_name, product_price, product_stock_quantity)
VALUES (1, '사과', 1.99, 100);

