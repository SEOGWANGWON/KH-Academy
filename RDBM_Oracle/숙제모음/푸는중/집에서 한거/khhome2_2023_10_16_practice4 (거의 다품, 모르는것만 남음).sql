--1번 문제
CREATE TABLE TB_CATEGORY(
    NAME VARCHAR2(10),
    USE_YN CHAR(1) NOT NULL
    );
    
--2번 문제   
CREATE TABLE TB_CLASS_TYPE(
    NO VARCHAR(5) PRIMARY KEY NOT NULL,
    NAME VARCHAR2(10) 
    );
    
    
--3번 문제
ALTER TABLE TB_CATEGORY MODIFY NAME VARCHAR2(10) PRIMARY KEY;

--4번 문제
ALTER TABLE TB_CLASS_TYPE MODIFY NAME VARCHAR2(10) NOT NULL;

--5번 문제
ALTER TABLE TB_CATEGORY MODIFY NAME VARCHAR2(20);

ALTER TABLE TB_CLASS_TYPE MODIFY NAME VARCHAR2(20);

ALTER TABLE TB_CLASS_TYPE MODIFY NO VARCHAR(10);

--6번 문제
ALTER TABLE TB_CLASS_TYPE
RENAME COLUMN NAME TO CLASS_TYPE_NAME;

ALTER TABLE TB_CLASS_TYPE
RENAME COLUMN NO TO CLASS_TYPE_NO;

ALTER TABLE TB_CATEGORY
RENAME COLUMN NAME TO CATEGORY_NAME;

--7번 문제
ALTER TABLE TB_CATEGORY
RENAME COLUMN CATEGORY_NAME TO PK_CATEGORY_NAME;

ALTER TABLE TB_CLASS_TYPE
RENAME COLUMN CLASS_TYPE_NO TO PK_CLASS_TYPE_NO;

--8번 문제
INSERT INTO TB_CATEGORY VALUES ('공학','Y');
INSERT INTO TB_CATEGORY VALUES ('자연과학','Y');
INSERT INTO TB_CATEGORY VALUES ('의학','Y');
INSERT INTO TB_CATEGORY VALUES ('예체능','Y');
INSERT INTO TB_CATEGORY VALUES ('인문사회','Y');
COMMIT;

--9번 문제 ( 못 풀었음 )


--10번 문제
CREATE VIEW VW_학생일반정보 AS 
    SELECT 
        STUDENT_NO,
        STUDENT_NAME,
        STUDENT_ADDRESS
    FROM TB_STUDENT;

SELECT * FROM VW_학생일반정보;

--11번 문제
CREATE VIEW VW_지도면담 AS
    SELECT
        S.STUDENT_NAME AS "학생이름",
        D.DEPARTMENT_NAME AS "학과이름",
        P.PROFESSOR_NAME AS "지도교수이름"
    FROM TB_STUDENT S
JOIN TB_DEPARTMENT D ON S.DEPARTMENT_NO = d.department_no
JOIN TB_PROFESSOR P ON s.coach_professor_no = p.professor_no;

DROP VIEW VW_지도면담;

SELECT * FROM VW_지도면담;


--12번 문제
CREATE VIEW VW_학과별학생수 AS
    SELECT 
        D.DEPARTMENT_NAME,
        COUNT(S.STUDENT_NAME) AS "학생수"
    FROM tb_department D
JOIN tb_student S ON d.department_no = s.department_no
GROUP BY d.department_name;

SELECT * FROM VW_학과별학생수;

--13번 문제
SELECT * FROM VW_학생일반정보
WHERE STUDENT_NO = 'A213046';

UPDATE VW_학생일반정보
SET STUDENT_NAME = '서광원'
WHERE STUDENT_NO = 'A213046';

--14번 문제 ( WITH CHECK OPTION 이 떠오르는데 원천차단 방법이 없나?)

--15번 문제
SELECT C.CLASS_NO AS "과목번호", C.CLASS_NAME AS "과목이름" , COUNT(G.CLASS_NO) AS "누적 수강생명"
FROM TB_CLASS C
JOIN TB_GRADE G ON C.CLASS_NO = g.class_no
WHERE G.TERM_NO BETWEEN '200501' AND '200903'
GROUP BY C.CLASS_NO, C.CLASS_NAME
ORDER BY "누적 수강생명" DESC;

SELECT MAX(TERM_NO) FROM TB_GRADE;