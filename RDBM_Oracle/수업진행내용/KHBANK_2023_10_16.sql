CREATE TABLE BANK(
    -- 각 계좌 id를 고유하게 식별
    account_id INT PRIMARY KEY, -- 기본키
    
    -- 중복된 계좌 번호 허용하지 않음, NULL 값은 허용되지 않음
    account_number VARCHAR2(15) UNIQUE NOT NULL, -- 고유 제약과 NOT NULL키 제약 (계좌번호)
   
    -- 계좌 소유주 이름, NULL 값은 허용되지 않음
    account_name VARCHAR2(50) NOT NULL,
   
    --금액, 잔액, 소수점 이하 2자리까지 표현
    balance DECIMAL(15,2) NOT NULL, -- 잔액은 0보다 작거나 같을 수 없음
    
    --은행 계좌 정보를 저장
    branch_name VARCHAR(50),
    
    --해당 계좌의 마지막 거래 날짜
    last_transaction_date DATE,
    
    --잔액은 0 이상이 되어야함, 값이 나오지 않도록 설정
    CONSTRAINT chk_balance CHECK (balance >= 0) -- 체크 제약
    );
    

INSERT INTO BANK (account_id, account_number,account_name, balance, branch_name, last_transaction_date)
VALUES (1, 8435678100420, '홍길동', 700000000, '의적의 계좌',TO_DATE('2023-10-13',('YYYY-MM-DD')));

ALTER TABLE BANK MODIFY balance DECIMAL(15,2);

update bank
SET branch_name = '서쪽지점'
where account_id = 1;

INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (2, '1236777888', '이동연', 400.50, '북쪽지점', TO_DATE('2023-10-07', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (3, '1111222233', '김영희', 500.75, '서쪽지점', TO_DATE('2023-10-14', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (4, '4444555566', '박철수', 2000.00, '동쪽지점', TO_DATE('2023-10-13', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (5, '7777888899', '이지은', 750.25, '남쪽지점', TO_DATE('2023-10-12', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (6, '2222333344', '배민정', 3000.50, '북쪽지점', TO_DATE('2023-10-11', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (7, '5555666777', '송은희', 1500.75, '서쪽지점', TO_DATE('2023-10-10', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (8, '8888999000', '정민호', 4000.00, '동쪽지점', TO_DATE('2023-10-09', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (9, '3333444555', '김서영', 950.25, '남쪽지점', TO_DATE('2023-10-08', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (10, '6666777888', '이동훈', 3200.50, '북쪽지점', TO_DATE('2023-10-07', 'YYYY-MM-DD'));

--잔액이 1000이상인 계좌의 계좌번호와 잔액 조회
SELECT ACCOUNT_NUMBER AS "계좌 번호", BALANCE AS "잔액"
FROM BANK
WHERE BALANCE >=1000;

--도시가 "서쪽지점" 인 계좌의 계좌 소유주 이름 조회
SELECT ACCOUNT_NAME FROM BANK
WHERE BRANCH_NAME = '서쪽지점';

--마지막 거래날자가 '2023-10-10' 이전인 계좌의 계좌번호와 마지막 거래 날짜를 조회
SELECT ACCOUNT_NUMBER, LAST_TRANSACTION_DATE FROM BANK
WHERE LAST_TRANSACTION_DATE < '2023-10-10';

--잔액이 가장 큰 계좌의 계좌 번호와 잔액을 조회
SELECT ACCOUNT_NUMBER, BALANCE AS "잔액" FROM BANK
WHERE BALANCE = (SELECT MAX(BALANCE) FROM BANK)
GROUP BY ACCOUNT_NUMBER, BALANCE;

--잔액이 500보다 크고 1000보다 작은 계좌의 계좌 소유주 이름 조회
SELECT ACCOUNT_NAME, BALANCE FROM BANK
WHERE BALANCE BETWEEN 500 AND 1000;

--계좌번호가 1234567890 계좌의 잔액을 1500으로 업데이트 하기
UPDATE BANK
SET BALANCE = 1500.00
WHERE ACCOUNT_NUMBER = 1234567890;

--잔액이 2000 이상인 계좌의 잔액을 10 % 증가
UPDATE BANK
SET BALANCE = BALANCE*(1.10)
WHERE BALANCE >= 2000;

--잔액이 0보다 작은 계좌가 있는지 확인
SELECT ACCOUNT_NUMBER, BALANCE
FROM BANK
WHERE BALANCE < 0;

--마지막 거래 날짜가 가장 빠른 계좌의 소유주 이름 조회 (FETCH 사용)
SELECT ACCOUNT_NAME AS "계좌 주인명" , LAST_TRANSACTION_DATE
FROM BANK
ORDER BY LAST_TRANSACTION_DATE DESC
FETCH FIRST 1 ROWS ONLY; 

--모든 계좌의 평균 잔액 계산
SELECT AVG(BALANCE) FROM BANK;


--도시가 "남쪽지점" 인 계좌의 평균 잔액 계산
SELECT BRANCH_NAME, AVG(BALANCE)
FROM BANK
WHERE BRANCH_NAME = '남쪽지점'
GROUP BY BRANCH_NAME;
