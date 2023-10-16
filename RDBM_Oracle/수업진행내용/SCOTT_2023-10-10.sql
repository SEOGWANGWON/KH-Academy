INSERT INTO department (DNO, DNAME, LOC)
VALUES (70, 'JAMES', 'NEW YORK');

INSERT INTO department (DNO, DNAME, LOC)
VALUES (50, 'KIM', 'KOREA');

INSERT INTO department (DNO, DNAME, LOC)
VALUES (60, 'XIAOMING', 'CHINA');

INSERT INTO salgrade (GRADE, LOSAL, HISAL)
VALUES (6, 4001, 9999);

INSERT INTO salgrade (GRADE, LOSAL, HISAL)
VALUES (7, 4701, 9999);

INSERT INTO department (DNO, DNAME, LOC) VALUES (1, 'HR', 'New Yotk');
INSERT INTO department (DNO, DNAME, LOC) VALUES (2, 'IT', 'San Francisco');
INSERT INTO department (DNO, DNAME, LOC) VALUES (3, 'Sales', 'Los Angeles');
INSERT INTO EMPLOYEE (ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, COMMISSION, DNO) VALUES (1, 'John', 'Manager', NULL, TO_DATE('2023-10-10', 'YYYY-MM-DD'), 5000.00, NULL, 1);
INSERT INTO EMPLOYEE (ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, COMMISSION, DNO) VALUES (2, 'Jane', 'Developer', 1, TO_DATE('2023-10-11', 'YYYY-MM-DD'), 4000.00, NULL, 2);
INSERT INTO EMPLOYEE (ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, COMMISSION, DNO) VALUES (3, 'Bob', 'Salesperson', 1, TO_DATE('2023-10-12', 'YYYY-MM-DD'), 3000.00, 500.00, 3);
--���� ���� ���� �ʹ� ŭ (���� : ~~, �ִ밪 : ~~)
ALTER TABLE employee MODIFY (JOB VARCHAR2(20 BYTE));

INSERT INTO SALGRADE (GRADE, LOSAL, HISAL) VALUES (6, 1000, 2000);
INSERT INTO SALGRADE (GRADE, LOSAL, HISAL) VALUES (7, 2001, 3000);
INSERT INTO SALGRADE (GRADE, LOSAL, HISAL) VALUES (8, 3001, 4000);

SELECT DNO, AVG(SALARY) AS AVG_SAL
FROM EMPLOYEE 
GROUP BY DNO
HAVING AVG(SALARY) >= 4000;

--GROUP BY HAVING ���
--�������� 3�� �̻��� �μ��� �μ� ��ȣ�� ������ ã��
SELECT DNO, COUNT(DNO)
FROM EMPLOYEE
GROUP BY DNO
HAVING COUNT(DNO) >= 3;
--�� �μ����� ���� ���� �޿��� �޴� ���� ã��
SELECT DNO, MAX(SALARY) AS AVG_SAL
FROM EMPLOYEE
GROUP BY DNO
HAVING MAX(SALARY) = (SELECT MAX(SALARY) FROM EMPLOYEE);

--HAVING MAX(SALARY) = (SELECT MAX(SALARY) FROM EMPLOYEE)
--�޿� �߰����� 3500 �̻��� �μ� ã�� HAVING MEDIAN(SALARY) >= 3500;
SELECT DNO, MEDIAN(SALARY) AS MED_SAL
FROM employee
GROUP BY DNO
HAVING MEDIAN(SALARY) >= 500;
--�� �״�� �߰��� DNO 10( 5000, 2450, 1300) = 2450
--DNO 20(3000, 3000, 2975, 1100, 800) = 2975
--���� ������ ¦���϶� EX) 1500 1250 �� �߰��� = 1375
SELECT * FROM EMPLOYEE
ORDER BY DNO ASC;  


--�μ��� ��å���� ���� ���� 2�� �̻��� ��� ã�� COUNT GROUP BY 2�� ���� �� ����


--��� �μ��� ��� �޿��� ���ϱ�
--�޿��� 4000 �̻��� ���� ���� ã��
SELECT ENAME, AVG(SALARY) AS AVG_SAL
FROM EMPLOYEE
GROUP BY ENAME
HAVING AVG(SALARY) >= 4000;

SELECT * FROM EMPLOYEE WHERE SALARY >= 4000;

--�μ����� ���� ���� �޿� ã��\
SELECT DNO, MAX(SALARY) AS SAL_MAX
FROM EMPLOYEE
GROUP BY DNO
HAVING MAX(SALARY) = (SELECT MAX(SALARY) FROM EMPLOYEE);

--�μ����� ���� ���� 3�� �̻��� �μ� ã��
--�μ����� ���� ���� 0�� �μ� ã��
--�޿� �������� ���� �� ����
--�μ����� �޿� �հ踦 ���ϰ�, �հ谡 20000 �̻��� �μ� ã��
--�� �μ����� ���� ������ ���� ã��
--�μ����� ������ ���� �� ã��
SELECT DNO, JOB, COUNT(*) AS JOB_COUNT
FROM EMPLOYEE
GROUP BY DNO, JOB;
--�޿��� ��� �޿����� ���� ���� ã��
SELECT ENAME, SALARY
FROM EMPLOYEE
GROUP BY ENAME, SALARY
HAVING SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEE);
--�μ����� �޿� ��պ��� ���� ���� �� ã��
SELECT DNO,SALARY, COUNT(*) AS COUNT
FROM EMPLOYEE
GROUP BY DNO, SALARY
HAVING SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEE);

--�μ����� �ּ� �޿��� 3000 �̻��� ���� ã��
SELECT GRADE, LOSAL
FROM SALGRADE
GROUP BY GRADE, LOSAL
HAVING LOSAL >= 3000;
--�μ����� �޿� �հ谡 10000 �̻��̰� ���� ���� 2�� �̻��� �μ� ã��
--�μ����� ������ �Ի����ڰ� 2023-01-01 ������ ���� �� ã��
SELECT DNO, HIREDATE AS NEW_HIREDATE
FROM EMPLOYEE
GROUP BY DNO, HIREDATE
HAVING HIREDATE >= TO_DATE('2023-01-01',('YYYY-MM-DD'));

--�޿��� 5000 �̻��̰� Ŀ�̼��� ���� �ʴ� ���� ã��
SELECT ENAME, SALARY, COMMISSION
FROM EMPLOYEE
GROUP BY ENAME, SALARY, COMMISSION
HAVING SALARY >= 5000 and commission = (NULL);
--�޿��� ���� ���� ���� ã��
SELECT ENAME, MAX(SALARY) AS SAL_MAX
FROM EMPLOYEE
GROUP BY ENAME, SALARY
HAVING SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE);

--���� ���� ���� ���� �μ� ã��
SELECT DNO , MAX(COUNT(*)) AS MAX_COT
FROM EMPLOYEE
GROUP BY DNO
HAVING MAX_COT = COUNT(*);
--�޿��� �� ��°�� ���� ���� ã��
SELECT ENAME, SALARY
FROM EMPLOYEE
WHERE SALARY = (SELECT DISTINCT SALARY FROM (SELECT SALARY FROM EMPLOYEE ORDER BY SALARY DESC)WHERE ROWNUM = 2);
--�޿��� ��� �޿����� ���� �μ��� ���� �� ã��
SELECT DNO, COUNT(*)
FROM EMPLOYEE
WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEE) -- ��������
GROUP BY DNO;
--�޿��� ���� ���� ���� ã��
SELECT JOP, MAX(SALARY) AS MAX_SAL
FROM EMPLOYEE
GROUP BY JOP
HAVING MAX(SALARY) = (SELECT MAX(SALARY FROM EMPLOYEE)); --��������

--JOIN (= INNER JOIN) : ��ġ�ϴ� �ุ ��ȯ
--�μ��� ���� ���̺��� JOIN�Ͽ� �� ������ �μ� ������ ������
-- EMPLOYEE e
--SELECT e.eno, e.

--LEFT JOIN : ���� ���̺��� ��� ���� ��ȯ
--��� �μ��� �μ��� ���� ������ ��������
-- ���࿡ �μ��� ���� ������ ���� ��쿡�� �μ� ���� �����ϱ�
SELECT d.dno, d.dname, e.eno, e.ename
FROM department d
left join employee e on d.dno = e.eno;

--RIGHT JOIN : ������ ���̺��� ��� �� ��ȯ
--��� ������ ������ ���� �μ� ���� ��������
-- �μ��� ������ ���� ��쵵 ���� ���� ����
SELECT e.eno, e.ename, d.dno, d.dname
FROM EMPLOYEE e
right join Department d on e.dno = d.dno;

--FULL JOIN : ���� ���̺��� ��� ���� ��ȯ
SELECT d.dno, d.dname, e.eno, e.ename
FROM department d
FULL JOIN employee e on d.dno = e.dno;

-- NVL (Null Value) : null ���� �ٸ� ������ ��ü
SELECT ename, nvl(commission, 0) as commission
FROM employee;

--NEXT DAY ���� �־��� ���� ��¥ ã��
SELECT ename, next_day(sysdate, 'FRIDAY') as next_day
FROM dual;

--TRUNC  : ��¥ �Ǵ� ������ �Ҽ��� ����
 SELECT ENAME, TRUNC(SALARY) AS TRUNC_SALARY FROM EMPLOYEE;

--Floor, CEIL, ROUND : ���� �ݿø� �� ����
SELECT enmae, FLOOR(salary) as Floor_Salary From employee;
SELECT Ename, CEIL(SALARY) AS CEIL_SALARY FROM EMPLOYEE;
SELECT ENAME, ROUND(SALARY, 2) AS ROUND_SALARY FROM EMPLOYEE;

-- ABS : ���밪 ��� -�� ����
SELECT ENAME, ABS(COMMISSION) AS ABS_COMMITION FROM EMPLOYEE;

CREATE TABLE SALARY_INFO (
employee_id NUMBER PRIMARY KEY,
employee_name VARCHAR2(50),
salary NUMBER(10,2) -- �Ҽ��� 2�ڸ����� �����ϴ� �޿��÷� EX(6000.00)
);

INSERT INTO SALARY_INFO (EMPLOYEE_ID,employee_name, SALARY)
VALUES (1, '�ɸӵ�', 50000.50); -- ù��° ���� ������

INSERT INTO SALARY_INFO (EMPLOYEE_ID,employee_name, SALARY)
VALUES (2, '�ٳ���', 60000.75); -- �ι�° ���� ������

INSERT INTO SALARY_INFO (EMPLOYEE_ID,employee_name, SALARY)
VALUES (3, '������', 47555.75);-- ����° ���� ������

INSERT INTO SALARY_INFO (EMPLOYEE_ID,employee_name, SALARY)
VALUES (4, 'ȣ����',80000.44); -- �׹�° ���� ������

INSERT INTO SALARY_INFO (EMPLOYEE_ID,employee_name, SALARY)
VALUES (5, '�⸰', 37500.22); -- �ټ���° ���� ������

--ID�� 1�� ������ �޿��� FLOOR �Լ� ����Ͽ� ����
SELECT EMPLOYEE_ID, EMPLOYEE_NAME, FLOOR(SALARY) AS F_SALARY 
FROM SALARY_INFO
WHERE EMPLOYEE_ID = 1;

--EMPLOYEE_ID �� 2�� ������ �޿�CEIL �Լ��� ����ؼ� �ø�
SELECT EMPLOYEE_ID, EMPLOYEE_NAME, CEIL(SALARY) AS C_SALARY
FROM SALARY_INFO
WHERE EMPLOYEE_ID = 2;

--EMPLOYEE_ID �� 3�� ������ �޿��� ROUND �Լ��� ����ؼ� �ݿø�
SELECT EMPLOYEE_ID, EMPLOYEE_NAME, ROUND(SALARY) AS R_SALARY
FROM SALARY_INFO
WHERE EMPLOYEE_ID = 3;

--EMPLOYEE_ID�� 4�� ������ �޿� FLOOR �Լ��� ����ؼ� ����
SELECT EMPLOYEE_ID, EMPLOYEE_NAME, FLOOR(SALARY) AS F_SALARY
FROM SALARY_INFO
WHERE EMPLOYEE_ID = 4;

--������ �޿��� 5000 �̻��� ��� "���" ���� ǥ��
--�� �ܴ� "����"���� ǥ��
SELECT ename, salary,
    case -- ���� ������ ���� �� �ְ�, ������ �����ϴ� ��� �޴� ��� ��ȯ
        when salary >= 5000 then '���' --�޿��� 5000 �̻��� ��� ��� ��ȯ
        else '����'          --�� ���ǿ� �ش����� �ʴ� ��� �������� ��ȯ
        end as salary_info --end�� case ���� ���� ��Ÿ���� Ű���� (�ݾ��ش�)
                            --as salary_info ���� ������ ���� ��Ī �ο� (���Ǻ��� �÷�)
    from employee;  --��ó�� employee ���̺�;

--���޿� ���� ���ʽ� ���
SELECT ENAME, JOB, SALARY,
    case job
        when 'Manager' then salary * 0.15
        when 'Developer' THEN SALARY * 0.1
        WHEN 'SALESMAN' THEN SALARY * 0.05
        ELSE 0
    END AS BONUS
FROM EMPLOYEE;

-- �޿� ���� ���� 5000�̻� ��� 3000�̻� �߰�
SELECT ENAME, SALARY,
    CASE 
        WHEN SALARY >=5000 THEN '���'
        WHEN SALARY >=3000 THEN '�߰�'
        ELSE '����'
    END AS SALARY_INFO
FROM EMPLOYEE;

-- ������ �Ի��� ������ ���� ��� ���
-- Ȱ�� : WHEN EXTRACT(YEAR FROM HIREDATE) = 2021 THEN '1�� �̸�'
-- 2022���� 1������ ǥ���ϱ�
SELECT ENAME, HIREDATE,
    CASE
        WHEN EXTRACT(YEAR FROM HIREDATE) = 2023 THEN '1�� �̸�'
        WHEN EXTRACT(YEAR FROM HIREDATE) = 2022 THEN '1��'
        ELSE '30���̻� �����'
    END AS RE_HIREDATE
FROM EMPLOYEE;

--������ �޿��� õ ������ �ݿø� -- �̰� ��Ƴ� ��Ǯ�ȵ�
SELECT ENAME, SALARY, ROUND(SALARY)
FROM EMPLOYEE
GROUP BY ENAME, SALARY;

--������ �޿��� ���� ��� ����
SELECT ENAME, SALARY,
    CASE
        WHEN SALARY >= 4000 THEN '1���'
        WHEN SALARY >= 3000 THEN '2���'
        ELSE '3���'
    END AS SAL_GRADE
FROM EMPLOYEE;

--�μ��� ���� �� ��� �� �μ� ���� ����
--3�� �� ��� �߱Ը� 5�� �� ��� ��Ը�
SELECT DNO , COUNT(DNO),
    CASE 
        WHEN COUNT(DNO) >= 5 THEN '��Ը�'
        WHEN COUNT(DNO) >= 3 THEN '�߱Ը�'
        ELSE '�ұԸ�'
    END AS DNO_SCALE
FROM EMPLOYEE;

--������ �Ի� ���� ���� ��� ���(*10�� 1���� 9���� 2���� �������� 3�����̻�)
SELECT ENAME, HIREDATE,
    CASE
        WHEN EXTRACT(MONTH FROM HIREDATE) = 10 AND EXTRACT(YEAR FROM HIREDATE) = 2023 THEN '1����'
        WHEN EXTRACT(MONTH FROM HIREDATE) = 9 AND EXTRACT(YEAR FROM HIREDATE) = 2023 THEN '2����'
        ELSE '3�����̻�'
    END AS RE_HIREDATE
FROM EMPLOYEE;

    
    
CREATE TABLE cafes(
    cafe_id int primary key,
    name VARCHAR2(255) NOT NULL,
    address VARCHAR2(255),
    phone_number VARCHAR2(15),
    operation_hour VARCHAR2(255)
    );
CREATE SEQUENCE cafe_seq(



