/*
--��� ���̺� ����
CREATE TABLE Hobbies (
MNO NUMBER PRIMARY KEY,
Hobby VARCHAR(100)
);
// NUMBER �Ҽ��� ���� ���� ���
// INT �Ҽ��� ���� ���X

--������� ��� ������ ����
INSERT INTO Hobbies (MNO, Hobby)
--VALUES (1, 'å�б�')
SELECT 1, 'å�б�' FROM DUAL UNION ALL --// ���ϰ� ��ȸ
SELECT 2, '����' FROM DUAL UNION ALL
SELECT 3, '����' FROM DUAL UNION ALL
SELECT 4, '�ڵ�' FROM DUAL UNION ALL
SELECT 5, '����' FROM DUAL UNION ALL
SELECT 6, '��α�' FROM DUAL UNION ALL
SELECT 7, '����' FROM DUAL UNION ALL
SELECT 8, '����' FROM DUAL UNION ALL
SELECT 9, '���߱�' FROM DUAL UNION ALL
SELECT 10, '����ŷ' FROM DUAL UNION ALL
SELECT 11, '���' FROM DUAL UNION ALL
SELECT 12, '������' FROM DUAL UNION ALL
SELECT 13, '����' FROM DUAL UNION ALL
SELECT 14, '����������' FROM DUAL UNION ALL
SELECT 15, '�౸' FROM DUAL UNION ALL
SELECT 16, '�䰡' FROM DUAL UNION ALL
SELECT 17, '����' FROM DUAL UNION ALL
SELECT 18, '����' FROM DUAL UNION ALL
SELECT 19, '�״Ͻ�' FROM DUAL UNION ALL
SELECT 20, '����' FROM DUAL UNION ALL
SELECT 21, '����' FROM DUAL;

GRANT DBA TO khstore;
*/

--����� �̸�, �̸��� �ּ� �� ��� �˻�
SELECT M.MName, M.MEmail, H.Hobby
FROM MEMBERINFO M
JOIN Hobbies H ON M.MNO = H.MNO;

--����� ���̵� ��й�ȣ
CREATE TABLE ID_PW (
MNO INT PRIMARY KEY, 
USER_ID VARCHAR(50),
USER_PW VARCHAR(50)
);

-- ������� ���̵�� ��й�ȣ ������ ���� (���Ƿ� ����)
/*
INSERT INTO ID_PW (MNO, USER_ID, USER_PW)
SELECT
    1, 'chanchan', 'password1' FROM DUAL UNION ALL
SELECT
    2, 'heehee', 'password2' FROM DUAL UNION ALL
SELECT
    3, 'gyugyu', 'password3' FROM DUAL UNION ALL
SELECT
    4, 'emily', 'password4' FROM DUAL UNION ALL
SELECT
    5, 'robert', 'password5' FROM DUAL UNION ALL
SELECT
    6, 'sarah', 'password6' FROM DUAL UNION ALL
SELECT
    7, 'david', 'password7' FROM DUAL UNION ALL
SELECT
    8, 'jennifer', 'password8' FROM DUAL UNION ALL
SELECT
    9, 'william', 'password9' FROM DUAL UNION ALL
SELECT
    10, 'olivia', 'password10' FROM DUAL UNION ALL
SELECT
    11, 'james', 'password11' FROM DUAL UNION ALL
SELECT
    12, 'sophia', 'password12' FROM DUAL UNION ALL
SELECT
    13, 'daniel', 'password13' FROM DUAL UNION ALL
SELECT
    14, 'ava', 'password14' FROM DUAL UNION ALL
SELECT
    15, 'matthew', 'password15' FROM DUAL UNION ALL
SELECT
    16, 'emma', 'password16' FROM DUAL UNION ALL
SELECT
    17, 'joseph', 'password17' FROM DUAL UNION ALL
SELECT
    18, 'mia', 'password18' FROM DUAL UNION ALL
SELECT
    19, 'david', 'password19' FROM DUAL UNION ALL
SELECT
    20, 'ella', 'password20' FROM DUAL UNION ALL
SELECT
    21, 'alexander', 'password21' FROM DUAL;
*/

--�ڽ��� �̸�/�� ��ġ�� ���̵�/ ��й�ȣ/ ���� ���/ ������� /�̸���
UPDATE id_pw set user_id = 'sun' WHERE mno = 4;
UPDATE id_pw set user_pw = 'light' WHERE mno = 4;
UPDATE HOBBIES set HOBBY = '�Ҽ�,��������' WHERE mno = 4;
UPDATE memberinfo set MEMAIL = 'https://hotsixlover.tistory.com/' WHERE mno = 4;
UPDATE memberinfo set MBIRTH = TO_DATE('97-04-27','YY-MM-DD') WHERE mno = 4;
--JOIN Ȱ���ؼ� ����� ���̵� ��й�ȣ �Բ� ���
SELECT M.MNO,M.Mname,I.User_id, I.User_pw, M.MEmail,M.Mbirth
FROM MEMBERINFO M
JOIN id_pw I ON M.MNO = I.MNO;


--JOIN Ȱ���ؼ� ����� ���̵� ��й�ȣ ��� �Բ� ���
SELECT M.MNO, M.MNAME,h.hobby, I.USER_ID, i.user_pw, m.memail, m.mbirth
FROM MEMBERINFO M
JOIN id_pw I ON M.MNO = I.MNO
JOIN hobbies H ON M.MNO = H.MNO;

--������ ���ϰ� ���� �߰��غ���


SELECT * FROM id_pw;
SELECT * FROM memberinfo;
SELECT * FROM HOBBIES;



--CREATE
/*
CREATE TABLE FridayTABLE (
 id NUMBER(5) PRIMARY KEY,
 name VARCHAR2(50),
 description VARCHAR2(100),
 birthdate DATE
 );
 */
 
 --INSERT ��
 --To Date �Լ� ����ؼ� ��¥ �������� ������ ����
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (1, '��â��', '�ݿ���õ��', TO_DATE('1970-05-25', 'YYYY-MM-DD'));
 
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (2, '������', '8���� ����', TO_DATE('1997-08-16', 'YYYY-MM-DD'));
 
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (3, '�ּ���', '11���� �Ǹ�', TO_DATE('2002-11-29', 'YYYY-MM-DD'));
 
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (4, '��μ�', '2���� ����', TO_DATE('2000-02-07', 'YYYY-MM-DD'));
 
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (5, '�̹���', '2��������', TO_DATE('2001-02-09', 'YYYY-MM-DD'));
 

 --ORDER BY : ��� ����
  SELECT * FROM fridaytable ORDER BY name;           --�̸��� �������� ����
  SELECT * FROM fridaytable ORDER BY birthdate;
  
 --COUNT ���� ���� �����ݴϴ�.
 SELECT COUNT(*) AS row_COUNT FROM fridaytable;      --�� ���� ī��Ʈ
 
 -- ���̺� ���� �����ϱ�
 ALTER TABLE fridaytable MODIFY description VARCHAR2 (200);   -- description ���� ũ�� �ø���
 
 -- SUM ���� ���� ���� ���
 SELECT SUM(id) AS id_sum FROM fridaytable;           -- ��� id�� �ջ�
 
 --TO_CHAR ��¥�� ���ڿ��� ��ȯ
 SELECT name, TO_CHAR(birthdate, 'YYYY-MM-DD') AS birthdate_str FROM fridaytable;       --
 
 --LENGTH : ���ڿ��� ���� ��ȯ
 SELECT name, LENGTH(name) AS name_len FROM fridaytable;        --name�� ���̸� ��ȯ
 
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (6, 'Jane Smith', '��� ��������', TO_DATE('2007-05-05','YYYY-MM-DD'));  --�ܱ��� �߰�
 
 -- UPPER ���ڿ��� �빮�ڷ� ��ȯ
 SELECT name, UPPER(name) AS upper_name FROM fridaytable;       --name ���� �빮�ڷ� ��ȯ�� upper_name ���� �ӽ÷� ���� �� ���� SELECT
 -- LOWER ���ڿ��� �ҹ��ڷ� ��ȯ
 SELECT name, LOWER(name) AS lower_name FROM fridaytable;       --name ���� �ҹ��ڷ� ��ȯ�� lower_name ���� �ӽ÷� ���� �� ���� SELECT
 
 --ROUND ���ڸ� �ݿø�
 --birthdate ���� ������ �ݿø��Ͽ� ���
 --EXTRACT ��¥ ������ ������ ����
 SELECT name, ROUND(EXTRACT(YEAR FROM birthdate)) AS BirthYEAR FROM fridaytable; 