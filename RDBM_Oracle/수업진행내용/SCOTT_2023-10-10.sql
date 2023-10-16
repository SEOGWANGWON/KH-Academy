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
--열에 대한 값이 너무 큼 (실제 : ~~, 최대값 : ~~)
ALTER TABLE employee MODIFY (JOB VARCHAR2(20 BYTE));

INSERT INTO SALGRADE (GRADE, LOSAL, HISAL) VALUES (6, 1000, 2000);
INSERT INTO SALGRADE (GRADE, LOSAL, HISAL) VALUES (7, 2001, 3000);
INSERT INTO SALGRADE (GRADE, LOSAL, HISAL) VALUES (8, 3001, 4000);

SELECT DNO, AVG(SALARY) AS AVG_SAL
FROM EMPLOYEE 
GROUP BY DNO
HAVING AVG(SALARY) >= 4000;

--GROUP BY HAVING 사용
--직원수가 3명 이상인 부서의 부서 번호와 직원수 찾기
SELECT DNO, COUNT(DNO)
FROM EMPLOYEE
GROUP BY DNO
HAVING COUNT(DNO) >= 3;
--각 부서에서 가장 높은 급여를 받는 직원 찾기
SELECT DNO, MAX(SALARY) AS AVG_SAL
FROM EMPLOYEE
GROUP BY DNO
HAVING MAX(SALARY) = (SELECT MAX(SALARY) FROM EMPLOYEE);

--HAVING MAX(SALARY) = (SELECT MAX(SALARY) FROM EMPLOYEE)
--급여 중간값이 3500 이상인 부서 찾기 HAVING MEDIAN(SALARY) >= 3500;
SELECT DNO, MEDIAN(SALARY) AS MED_SAL
FROM employee
GROUP BY DNO
HAVING MEDIAN(SALARY) >= 500;
--말 그대로 중간값 DNO 10( 5000, 2450, 1300) = 2450
--DNO 20(3000, 3000, 2975, 1100, 800) = 2975
--만약 갯수가 짝수일때 EX) 1500 1250 의 중간값 = 1375
SELECT * FROM EMPLOYEE
ORDER BY DNO ASC;  


--부서와 직책별로 직원 수가 2명 이상인 경우 찾기 COUNT GROUP BY 2개 나올 수 있음


--모든 부서의 평균 급여를 구하기
--급여가 4000 이상인 직원 수를 찾기
SELECT ENAME, AVG(SALARY) AS AVG_SAL
FROM EMPLOYEE
GROUP BY ENAME
HAVING AVG(SALARY) >= 4000;

SELECT * FROM EMPLOYEE WHERE SALARY >= 4000;

--부서별로 가장 높은 급여 찾기\
SELECT DNO, MAX(SALARY) AS SAL_MAX
FROM EMPLOYEE
GROUP BY DNO
HAVING MAX(SALARY) = (SELECT MAX(SALARY) FROM EMPLOYEE);

--부서별로 직원 수가 3명 이상인 부서 찾기
--부서별로 직원 수가 0인 부서 찾기
--급여 범위별로 직원 수 세기
--부서별로 급여 합계를 구하고, 합계가 20000 이상인 부서 찾기
--각 부서에서 가장 오래된 직원 찾기
--부서별로 직원의 직무 수 찾기
SELECT DNO, JOB, COUNT(*) AS JOB_COUNT
FROM EMPLOYEE
GROUP BY DNO, JOB;
--급여가 평균 급여보다 높은 직원 찾기
SELECT ENAME, SALARY
FROM EMPLOYEE
GROUP BY ENAME, SALARY
HAVING SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEE);
--부서별로 급여 평균보다 높은 직원 수 찾기
SELECT DNO,SALARY, COUNT(*) AS COUNT
FROM EMPLOYEE
GROUP BY DNO, SALARY
HAVING SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEE);

--부서별로 최소 급여가 3000 이상인 직원 찾기
SELECT GRADE, LOSAL
FROM SALGRADE
GROUP BY GRADE, LOSAL
HAVING LOSAL >= 3000;
--부서별로 급여 합계가 10000 이상이고 직원 수가 2명 이상인 부서 찾기
--부서별로 직원의 입사일자가 2023-01-01 이후인 직원 수 찾기
SELECT DNO, HIREDATE AS NEW_HIREDATE
FROM EMPLOYEE
GROUP BY DNO, HIREDATE
HAVING HIREDATE >= TO_DATE('2023-01-01',('YYYY-MM-DD'));

--급여가 5000 이상이고 커미션을 받지 않는 직원 찾기
SELECT ENAME, SALARY, COMMISSION
FROM EMPLOYEE
GROUP BY ENAME, SALARY, COMMISSION
HAVING SALARY >= 5000 and commission = (NULL);
--급여가 가장 높은 직원 찾기
SELECT ENAME, MAX(SALARY) AS SAL_MAX
FROM EMPLOYEE
GROUP BY ENAME, SALARY
HAVING SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE);

--직원 수가 가장 많은 부서 찾기
SELECT DNO , MAX(COUNT(*)) AS MAX_COT
FROM EMPLOYEE
GROUP BY DNO
HAVING MAX_COT = COUNT(*);
--급여가 두 번째로 높은 직원 찾기
SELECT ENAME, SALARY
FROM EMPLOYEE
WHERE SALARY = (SELECT DISTINCT SALARY FROM (SELECT SALARY FROM EMPLOYEE ORDER BY SALARY DESC)WHERE ROWNUM = 2);
--급여가 평균 급여보다 높은 부서의 직원 수 찾기
SELECT DNO, COUNT(*)
FROM EMPLOYEE
WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEE) -- 서브쿼리
GROUP BY DNO;
--급여가 가장 높은 직무 찾기
SELECT JOP, MAX(SALARY) AS MAX_SAL
FROM EMPLOYEE
GROUP BY JOP
HAVING MAX(SALARY) = (SELECT MAX(SALARY FROM EMPLOYEE)); --서브쿼리

--JOIN (= INNER JOIN) : 일치하는 행만 반환
--부서와 직원 테이블을 JOIN하여 각 직원의 부서 정보를 가져옴
-- EMPLOYEE e
--SELECT e.eno, e.

--LEFT JOIN : 왼쪽 테이블의 모든 행을 반환
--모든 부서와 부서에 속한 직원을 가져오기
-- 만약에 부서에 속한 직원이 없는 경우에는 부서 정보 포함하기
SELECT d.dno, d.dname, e.eno, e.ename
FROM department d
left join employee e on d.dno = e.eno;

--RIGHT JOIN : 오른쪽 테이블의 모든 행 반환
--모든 직원과 직원이 속한 부서 정보 가져오기
-- 부서에 속하지 않은 경우도 직원 정보 포함
SELECT e.eno, e.ename, d.dno, d.dname
FROM EMPLOYEE e
right join Department d on e.dno = d.dno;

--FULL JOIN : 양쪽 테이블의 모든 행을 반환
SELECT d.dno, d.dname, e.eno, e.ename
FROM department d
FULL JOIN employee e on d.dno = e.dno;

-- NVL (Null Value) : null 값을 다른 값으로 대체
SELECT ename, nvl(commission, 0) as commission
FROM employee;

--NEXT DAY 다음 주어진 요일 날짜 찾기
SELECT ename, next_day(sysdate, 'FRIDAY') as next_day
FROM dual;

--TRUNC  : 날짜 또는 숫자의 소수부 제거
 SELECT ENAME, TRUNC(SALARY) AS TRUNC_SALARY FROM EMPLOYEE;

--Floor, CEIL, ROUND : 숫자 반올림 및 내림
SELECT enmae, FLOOR(salary) as Floor_Salary From employee;
SELECT Ename, CEIL(SALARY) AS CEIL_SALARY FROM EMPLOYEE;
SELECT ENAME, ROUND(SALARY, 2) AS ROUND_SALARY FROM EMPLOYEE;

-- ABS : 절대값 계산 -를 없앰
SELECT ENAME, ABS(COMMISSION) AS ABS_COMMITION FROM EMPLOYEE;

CREATE TABLE SALARY_INFO (
employee_id NUMBER PRIMARY KEY,
employee_name VARCHAR2(50),
salary NUMBER(10,2) -- 소수점 2자리까지 저장하는 급여컬럼 EX(6000.00)
);

INSERT INTO SALARY_INFO (EMPLOYEE_ID,employee_name, SALARY)
VALUES (1, '맴머드', 50000.50); -- 첫번째 직원 데이터

INSERT INTO SALARY_INFO (EMPLOYEE_ID,employee_name, SALARY)
VALUES (2, '바나스', 60000.75); -- 두번째 직원 데이터

INSERT INTO SALARY_INFO (EMPLOYEE_ID,employee_name, SALARY)
VALUES (3, '원숭이', 47555.75);-- 세번째 직원 데이터

INSERT INTO SALARY_INFO (EMPLOYEE_ID,employee_name, SALARY)
VALUES (4, '호랑이',80000.44); -- 네번째 직원 데이터

INSERT INTO SALARY_INFO (EMPLOYEE_ID,employee_name, SALARY)
VALUES (5, '기린', 37500.22); -- 다섯번째 직원 데이터

--ID가 1인 직원의 급여를 FLOOR 함수 사용하여 내림
SELECT EMPLOYEE_ID, EMPLOYEE_NAME, FLOOR(SALARY) AS F_SALARY 
FROM SALARY_INFO
WHERE EMPLOYEE_ID = 1;

--EMPLOYEE_ID 가 2인 직원의 급여CEIL 함수를 사용해서 올림
SELECT EMPLOYEE_ID, EMPLOYEE_NAME, CEIL(SALARY) AS C_SALARY
FROM SALARY_INFO
WHERE EMPLOYEE_ID = 2;

--EMPLOYEE_ID 가 3인 직원의 급여를 ROUND 함수를 사용해서 반올림
SELECT EMPLOYEE_ID, EMPLOYEE_NAME, ROUND(SALARY) AS R_SALARY
FROM SALARY_INFO
WHERE EMPLOYEE_ID = 3;

--EMPLOYEE_ID가 4인 직원의 급여 FLOOR 함수를 사용해서 내림
SELECT EMPLOYEE_ID, EMPLOYEE_NAME, FLOOR(SALARY) AS F_SALARY
FROM SALARY_INFO
WHERE EMPLOYEE_ID = 4;

--직원의 급여가 5000 이상인 경우 "고액" 으로 표시
--그 외는 "보통"으로 표시
SELECT ename, salary,
    case -- 여러 조건을 비교할 수 있고, 조건을 만족하는 경우 달느 결과 반환
        when salary >= 5000 then '고액' --급여가 5000 이상인 경우 고액 반환
        else '보통'          --위 조건에 해당하지 않는 경우 보통으로 반환
        end as salary_info --end는 case 문의 끝을 나타내는 키워드 (닫아준다)
                            --as salary_info 새로 생성된 열에 별칭 부여 (조건부의 컬럼)
    from employee;  --출처는 employee 테이블;

--직급에 따라 보너스 계산
SELECT ENAME, JOB, SALARY,
    case job
        when 'Manager' then salary * 0.15
        when 'Developer' THEN SALARY * 0.1
        WHEN 'SALESMAN' THEN SALARY * 0.05
        ELSE 0
    END AS BONUS
FROM EMPLOYEE;

-- 급여 범위 지정 5000이상 고액 3000이상 중간
SELECT ENAME, SALARY,
    CASE 
        WHEN SALARY >=5000 THEN '고액'
        WHEN SALARY >=3000 THEN '중간'
        ELSE '보통'
    END AS SALARY_INFO
FROM EMPLOYEE;

-- 직원의 입사한 연도에 따른 경력 계산
-- 활용 : WHEN EXTRACT(YEAR FROM HIREDATE) = 2021 THEN '1년 미만'
-- 2022년은 1년으로 표기하기
SELECT ENAME, HIREDATE,
    CASE
        WHEN EXTRACT(YEAR FROM HIREDATE) = 2023 THEN '1년 미만'
        WHEN EXTRACT(YEAR FROM HIREDATE) = 2022 THEN '1년'
        ELSE '30년이상 경력자'
    END AS RE_HIREDATE
FROM EMPLOYEE;

--직원의 급여를 천 단위로 반올림 -- 이거 어렵네 안풀렸따
SELECT ENAME, SALARY, ROUND(SALARY)
FROM EMPLOYEE
GROUP BY ENAME, SALARY;

--직원의 급여에 따른 등급 지정
SELECT ENAME, SALARY,
    CASE
        WHEN SALARY >= 4000 THEN '1등급'
        WHEN SALARY >= 3000 THEN '2등급'
        ELSE '3등급'
    END AS SAL_GRADE
FROM EMPLOYEE;

--부서별 직원 수 계산 및 부서 유형 지정
--3명 일 경우 중규모 5명 일 경우 대규모
SELECT DNO , COUNT(DNO),
    CASE 
        WHEN COUNT(DNO) >= 5 THEN '대규모'
        WHEN COUNT(DNO) >= 3 THEN '중규모'
        ELSE '소규모'
    END AS DNO_SCALE
FROM EMPLOYEE;

--직원의 입사 월에 따른 경력 계산(*10월 1개월 9월은 2개월 나머지는 3개월이상)
SELECT ENAME, HIREDATE,
    CASE
        WHEN EXTRACT(MONTH FROM HIREDATE) = 10 AND EXTRACT(YEAR FROM HIREDATE) = 2023 THEN '1개월'
        WHEN EXTRACT(MONTH FROM HIREDATE) = 9 AND EXTRACT(YEAR FROM HIREDATE) = 2023 THEN '2개월'
        ELSE '3개월이상'
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



