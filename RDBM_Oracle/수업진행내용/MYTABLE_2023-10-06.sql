SELECT * FROM employee; 

SELECT * FROM employee WHERE ENAME = 'WARD';

SELECT * FROM employee WHERE SALARY >= 3000;    -- SALARY ���� 3000 �̻��� ���� SELECT

SELECT * FROM employee WHERE HIREDATE = '81/12/03';     -- HIREDATE ���� �ִ� '81/12/03'; �� ���� SELECT

--Ư�� �޿� ��޿� ���ϴ� ��� ���� ��ȸ (�� : �޿� ��� 3�� ���ϴ� ���)
--������� �Ͻ��ڵ�
SELECT * FROM salgrade where SALARY BETWEEN (SELECT losal FROM salgrade WHERE grade = 3) AND (SELECT hisal FROM salgrade WHERE grade = 3);
--������ �ڵ�
--SELECT * FROM salgrade WHERE grade = 3;

--��� ���� ���� (�� : ��� ��ȣ 7369�� �޿��� 1000���� �޿� ������Ʈ
--������Ʈ ���̺� ������Ʈ�� ���� �÷� = �����ҳ��� ��� �÷� = �����ؾߵ� �κ�;
UPDATE employee set salary = 1000 WHERE ENO = 7369;
-- �����ȣ�� 7369 �� ����� �޿��� 2000���� ������Ʈ
UPDATE employee SET salary = 2000 WHERE ENO = 7369;
--�μ���ȣ�� 10�� ������� �޿��� 3000���� ������Ʈ
UPDATE employee SET salary = 3000 WHERE DNO = 10;
/*Ư�� �μ��� ��� ��� ���� ������Ʈ (��:�μ� ��ȣ 30�� ���� ��� ����� ������ 'MANAGER' �� ����)
Ư�� ����� ��� ������Ʈ (��: �����ȣ 7499�� ��縦 �����ȣ 7566���� ����)
Ư�� �μ��� ��� ����� �޿� �λ� (�μ���ȣ 20�� ���� ��� ����Ǳ޿��� 10 % �λ� (����Ǳ޿�*1.10))
Ư�� ����� �޿��� ������ ������Ʈ (�����ȣ 7788 �޿�(salary)�� 3500 ������(commission) 500����)
*/
--Ư�� �μ��� ��� ��� ���� ������Ʈ (��: �μ� ��ȣ 30�� ���� ��� ����� ������ 'MANAGER' �� ����)
UPDATE employee SET JOB = 'MANAGER' WHERE DNO = 30;
--Ư�� ����� ��� ������Ʈ (��: �����ȣ 7499�� ���(MANAGER)�� �����ȣ 7566���� ����)
UPDATE employee SET manager = 7566 WHERE ENO = 7499;
--Ư�� �μ��� ��� ����� �޿� �λ� (�μ���ȣ 20�� ���� ��� ����Ǳ޿��� 10% �λ� (����Ǳ޿�*1.10)) 
UPDATE employee SET SALARY = (SALARY*1.10) WHERE DNO = 20;
--Ư�� ����� �޿��� ������ ������Ʈ (�����ȣ 7788 �޿�(salary)�� 3500 ������(commission) 500����)
UPDATE employee SET SALARY = 3500 , COMMISSION = 500 WHERE ENO = 7788;
/*
Ư�� ����� ������� ���� (��: ��� ��ȣ 7521�� ������ڸ� '2022-01-15'�� ����):
Ư�� �޿� ����� �ּ� �޿� ���� (��: �޿� ��� 1�� �ּ� �޿��� 700���� 750���� ����):
SALGRADE ���̺� Ȱ��
Ư�� �μ��� ������� �ٸ� �μ��� �̵� (��: �μ� ��ȣ 40�� ���� ��� ����� �μ� ��ȣ 10���� �̵�):
*/
--Ư�� ����� ������� ���� (��: ��� ��ȣ 7521�� ������ڸ� '2022-01-15'�� ����):
UPDATE employee SET HIREDATE = TO_DATE('2022-01-15', 'YYYY-MM-DD') WHERE ENO = 7521;
--Ư�� �޿� ����� �ּ� �޿� ���� (��: �޿� ��� 1�� �ּ� �޿��� 700���� 750���� ����):
--SALGRADE ���̺� Ȱ��
UPDATE salgrade SET losal = 750 WHERE grade = 1; 
--Ư�� �μ��� ������� �ٸ� �μ��� �̵� (��: �μ� ��ȣ 40�� ���� ��� ����� �μ� ��ȣ 10���� �̵�):
--employee�� DNO40 �� ���⋚���� INSERT �� ���� �־ ó��.
INSERT INTO employee(ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, COMMISSION, DNO)
VALUES (9158, 'DOCKJA', (null), 8253, TO_DATE('2023-10-06','YYYY-MM-DD'), 4000, 200, 40);
UPDATE employee SET DNO = 10 WHERE DNO = 40; 
/*
Ư�� �޿� ��� ���� (��: �޿� ��� 5 ����):
Ư�� �μ��� ���� ����� ��� ���� ���� (��: �μ� ��ȣ 30�� ���� ��� ��� ����):
���ο� ����� EMPLOYEE ���̺� �߰��ϴ� SQL��:
SMITH�� ������� ã��
��� ����� �̸��� �޿��� �����ϴ� SQL��:
*/
--Ư�� �޿� ��� ���� (��: �޿� ��� 5 ����):
DELETE FROM salgrade WHERE grade = 5;
--Ư�� �μ��� ���� ����� ��� ���� ���� (��: �μ� ��ȣ 30�� ���� ��� ��� ����):
DELETE FROM employee WHERE DNO = 30;
--���ο� ����� EMPLOYEE ���̺� �߰��ϴ� SQL��:
INSERT INTO employee(ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, COMMISSION, DNO)
VALUES (1004, 'ANGEL', (null), (null), TO_DATE('2023-10-06','YYYY-MM-DD'), 0, (null), 30);
--SMITH�� ������� ã��
SELECT * FROM employee WHERE ENAME = 'SMITH';
--��� ����� �̸��� �޿��� �����ϴ� SQL��:
--SELECT * FROM employee WHERE ENAME = employee; // ��� ������ǰ
select ename, salary from employee;

/*
EMPLOYEE ���̺��� �μ� ��ȣ�� 10�̰� ������ 'ANALYST'�� ������� ��� �޿��� ����
SELECT���� AVG(SALARY)���
EMPLOYEE ���̺��� �޿��� 1500���� 2500 ������ ������� �̸��� �޿��� ����
where ���� between ���
EMPLOYEE ���̺��� �����ڰ� ���� ����� �̸��� ����
WHERE ���� IS NULL���
*/
--EMPLOYEE ���̺��� �μ� ��ȣ�� 10�̰� ������ 'ANALYST'�� ������� ��� �޿��� ����
select AVG(Salary) from employee where dno = 10 and job = 'ANALYS';
--EMPLOYEE ���̺��� �޿��� 1500���� 2500 ������ ������� �̸��� �޿��� ����
select ename, salary from employee where between 1500 and 2500;
--EMPLOYEE ���̺��� �����ڰ� ���� ����� �̸��� ����



SELECT * FROM department;
SELECT * FROM salgrade;
SELECT * FROM employee;

