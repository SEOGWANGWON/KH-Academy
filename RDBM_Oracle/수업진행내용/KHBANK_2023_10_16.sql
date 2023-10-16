CREATE TABLE BANK(
    -- �� ���� id�� �����ϰ� �ĺ�
    account_id INT PRIMARY KEY, -- �⺻Ű
    
    -- �ߺ��� ���� ��ȣ ������� ����, NULL ���� ������ ����
    account_number VARCHAR2(15) UNIQUE NOT NULL, -- ���� ����� NOT NULLŰ ���� (���¹�ȣ)
   
    -- ���� ������ �̸�, NULL ���� ������ ����
    account_name VARCHAR2(50) NOT NULL,
   
    --�ݾ�, �ܾ�, �Ҽ��� ���� 2�ڸ����� ǥ��
    balance DECIMAL(15,2) NOT NULL, -- �ܾ��� 0���� �۰ų� ���� �� ����
    
    --���� ���� ������ ����
    branch_name VARCHAR(50),
    
    --�ش� ������ ������ �ŷ� ��¥
    last_transaction_date DATE,
    
    --�ܾ��� 0 �̻��� �Ǿ����, ���� ������ �ʵ��� ����
    CONSTRAINT chk_balance CHECK (balance >= 0) -- üũ ����
    );
    

INSERT INTO BANK (account_id, account_number,account_name, balance, branch_name, last_transaction_date)
VALUES (1, 8435678100420, 'ȫ�浿', 700000000, '������ ����',TO_DATE('2023-10-13',('YYYY-MM-DD')));

ALTER TABLE BANK MODIFY balance DECIMAL(15,2);

update bank
SET branch_name = '��������'
where account_id = 1;

INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (2, '1236777888', '�̵���', 400.50, '��������', TO_DATE('2023-10-07', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (3, '1111222233', '�迵��', 500.75, '��������', TO_DATE('2023-10-14', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (4, '4444555566', '��ö��', 2000.00, '��������', TO_DATE('2023-10-13', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (5, '7777888899', '������', 750.25, '��������', TO_DATE('2023-10-12', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (6, '2222333344', '�����', 3000.50, '��������', TO_DATE('2023-10-11', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (7, '5555666777', '������', 1500.75, '��������', TO_DATE('2023-10-10', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (8, '8888999000', '����ȣ', 4000.00, '��������', TO_DATE('2023-10-09', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (9, '3333444555', '�輭��', 950.25, '��������', TO_DATE('2023-10-08', 'YYYY-MM-DD'));
INSERT INTO BANK (account_id, account_number, account_name, balance, branch_name, last_transaction_date)
VALUES (10, '6666777888', '�̵���', 3200.50, '��������', TO_DATE('2023-10-07', 'YYYY-MM-DD'));

--�ܾ��� 1000�̻��� ������ ���¹�ȣ�� �ܾ� ��ȸ
SELECT ACCOUNT_NUMBER AS "���� ��ȣ", BALANCE AS "�ܾ�"
FROM BANK
WHERE BALANCE >=1000;

--���ð� "��������" �� ������ ���� ������ �̸� ��ȸ
SELECT ACCOUNT_NAME FROM BANK
WHERE BRANCH_NAME = '��������';

--������ �ŷ����ڰ� '2023-10-10' ������ ������ ���¹�ȣ�� ������ �ŷ� ��¥�� ��ȸ
SELECT ACCOUNT_NUMBER, LAST_TRANSACTION_DATE FROM BANK
WHERE LAST_TRANSACTION_DATE < '2023-10-10';

--�ܾ��� ���� ū ������ ���� ��ȣ�� �ܾ��� ��ȸ
SELECT ACCOUNT_NUMBER, BALANCE AS "�ܾ�" FROM BANK
WHERE BALANCE = (SELECT MAX(BALANCE) FROM BANK)
GROUP BY ACCOUNT_NUMBER, BALANCE;

--�ܾ��� 500���� ũ�� 1000���� ���� ������ ���� ������ �̸� ��ȸ
SELECT ACCOUNT_NAME, BALANCE FROM BANK
WHERE BALANCE BETWEEN 500 AND 1000;

--���¹�ȣ�� 1234567890 ������ �ܾ��� 1500���� ������Ʈ �ϱ�
UPDATE BANK
SET BALANCE = 1500.00
WHERE ACCOUNT_NUMBER = 1234567890;

--�ܾ��� 2000 �̻��� ������ �ܾ��� 10 % ����
UPDATE BANK
SET BALANCE = BALANCE*(1.10)
WHERE BALANCE >= 2000;

--�ܾ��� 0���� ���� ���°� �ִ��� Ȯ��
SELECT ACCOUNT_NUMBER, BALANCE
FROM BANK
WHERE BALANCE < 0;

--������ �ŷ� ��¥�� ���� ���� ������ ������ �̸� ��ȸ (FETCH ���)
SELECT ACCOUNT_NAME AS "���� ���θ�" , LAST_TRANSACTION_DATE
FROM BANK
ORDER BY LAST_TRANSACTION_DATE DESC
FETCH FIRST 1 ROWS ONLY; 

--��� ������ ��� �ܾ� ���
SELECT AVG(BALANCE) FROM BANK;


--���ð� "��������" �� ������ ��� �ܾ� ���
SELECT BRANCH_NAME, AVG(BALANCE)
FROM BANK
WHERE BRANCH_NAME = '��������'
GROUP BY BRANCH_NAME;
