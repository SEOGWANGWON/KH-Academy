SELECT * FROM employee; 

SELECT * FROM employee WHERE ENAME = 'WARD';

SELECT * FROM employee WHERE SALARY >= 3000;    -- SALARY 값중 3000 이상의 값을 SELECT

SELECT * FROM employee WHERE HIREDATE = '81/12/03';     -- HIREDATE 열에 있는 '81/12/03'; 인 값을 SELECT

--특정 급여 등급에 속하는 사원 정보 조회 (예 : 급여 등급 3에 속하는 사원)
--강사님이 하신코드
SELECT * FROM salgrade where SALARY BETWEEN (SELECT losal FROM salgrade WHERE grade = 3) AND (SELECT hisal FROM salgrade WHERE grade = 3);
--내가한 코드
--SELECT * FROM salgrade WHERE grade = 3;

--사원 정보 수정 (예 : 사원 번호 7369의 급여를 1000으로 급여 업데이트
--업데이트 테이블 업데이트할 내용 컬럼 = 수정할내용 어디서 컬럼 = 수정해야될 부분;
UPDATE employee set salary = 1000 WHERE ENO = 7369;
-- 사원번호가 7369 인 사원의 급여를 2000으로 업데이트
UPDATE employee SET salary = 2000 WHERE ENO = 7369;
--부서번호가 10인 사람들의 급여를 3000으로 업데이트
UPDATE employee SET salary = 3000 WHERE DNO = 10;
/*특정 부서의 모든 사원 직무 업데이트 (예:부서 번호 30에 속한 모든 사원의 직무를 'MANAGER' 로 변경)
특정 사원의 상사 업데이트 (예: 사원번호 7499의 상사를 사원번호 7566으로 변경)
특정 부서의 모든 사원의 급여 인상 (부서번호 20에 속한 모든 사원의급여를 10 % 인상 (사원의급여*1.10))
특정 사원의 급여와 수수료 업데이트 (사원번호 7788 급여(salary)를 3500 수수료(commission) 500변경)
*/
--특정 부서의 모든 사원 직무 업데이트 (예: 부서 번호 30에 속한 모든 사원의 직무를 'MANAGER' 로 변경)
UPDATE employee SET JOB = 'MANAGER' WHERE DNO = 30;
--특정 사원의 상사 업데이트 (예: 사원번호 7499의 상사(MANAGER)를 사원번호 7566으로 변경)
UPDATE employee SET manager = 7566 WHERE ENO = 7499;
--특정 부서의 모든 사원의 급여 인상 (부서번호 20에 속한 모든 사원의급여를 10% 인상 (사원의급여*1.10)) 
UPDATE employee SET SALARY = (SALARY*1.10) WHERE DNO = 20;
--특정 사원의 급여와 수수료 업데이트 (사원번호 7788 급여(salary)를 3500 수수료(commission) 500변경)
UPDATE employee SET SALARY = 3500 , COMMISSION = 500 WHERE ENO = 7788;
/*
특정 사원의 고용일자 변경 (예: 사원 번호 7521의 고용일자를 '2022-01-15'로 변경):
특정 급여 등급의 최소 급여 변경 (예: 급여 등급 1의 최소 급여를 700에서 750으로 변경):
SALGRADE 테이블 활용
특정 부서의 사원들을 다른 부서로 이동 (예: 부서 번호 40에 속한 모든 사원을 부서 번호 10으로 이동):
*/
--특정 사원의 고용일자 변경 (예: 사원 번호 7521의 고용일자를 '2022-01-15'로 변경):
UPDATE employee SET HIREDATE = TO_DATE('2022-01-15', 'YYYY-MM-DD') WHERE ENO = 7521;
--특정 급여 등급의 최소 급여 변경 (예: 급여 등급 1의 최소 급여를 700에서 750으로 변경):
--SALGRADE 테이블 활용
UPDATE salgrade SET losal = 750 WHERE grade = 1; 
--특정 부서의 사원들을 다른 부서로 이동 (예: 부서 번호 40에 속한 모든 사원을 부서 번호 10으로 이동):
--employee에 DNO40 이 없기떄문에 INSERT 로 값을 넣어서 처리.
INSERT INTO employee(ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, COMMISSION, DNO)
VALUES (9158, 'DOCKJA', (null), 8253, TO_DATE('2023-10-06','YYYY-MM-DD'), 4000, 200, 40);
UPDATE employee SET DNO = 10 WHERE DNO = 40; 
/*
특정 급여 등급 삭제 (예: 급여 등급 5 삭제):
특정 부서에 속한 사원의 모든 정보 삭제 (예: 부서 번호 30에 속한 모든 사원 삭제):
새로운 사원을 EMPLOYEE 테이블에 추가하는 SQL문:
SMITH의 사원정보 찾기
모든 사원의 이름과 급여를 선택하는 SQL문:
*/
--특정 급여 등급 삭제 (예: 급여 등급 5 삭제):
DELETE FROM salgrade WHERE grade = 5;
--특정 부서에 속한 사원의 모든 정보 삭제 (예: 부서 번호 30에 속한 모든 사원 삭제):
DELETE FROM employee WHERE DNO = 30;
--새로운 사원을 EMPLOYEE 테이블에 추가하는 SQL문:
INSERT INTO employee(ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, COMMISSION, DNO)
VALUES (1004, 'ANGEL', (null), (null), TO_DATE('2023-10-06','YYYY-MM-DD'), 0, (null), 30);
--SMITH의 사원정보 찾기
SELECT * FROM employee WHERE ENAME = 'SMITH';
--모든 사원의 이름과 급여를 선택하는 SQL문:
--SELECT * FROM employee WHERE ENAME = employee; // 대기 아직못품
select ename, salary from employee;

/*
EMPLOYEE 테이블에서 부서 번호가 10이고 직무가 'ANALYST'인 사원들의 평균 급여를 선택
SELECT에서 AVG(SALARY)사용
EMPLOYEE 테이블에서 급여가 1500에서 2500 사이인 사원들의 이름과 급여를 선택
where 에서 between 사용
EMPLOYEE 테이블에서 관리자가 없는 사원의 이름을 선택
WHERE 에서 IS NULL사용
*/
--EMPLOYEE 테이블에서 부서 번호가 10이고 직무가 'ANALYST'인 사원들의 평균 급여를 선택
select AVG(Salary) from employee where dno = 10 and job = 'ANALYS';
--EMPLOYEE 테이블에서 급여가 1500에서 2500 사이인 사원들의 이름과 급여를 선택
select ename, salary from employee where between 1500 and 2500;
--EMPLOYEE 테이블에서 관리자가 없는 사원의 이름을 선택



SELECT * FROM department;
SELECT * FROM salgrade;
SELECT * FROM employee;

