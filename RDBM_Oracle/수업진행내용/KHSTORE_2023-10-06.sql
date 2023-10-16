/*
--취미 테이블 생성
CREATE TABLE Hobbies (
MNO NUMBER PRIMARY KEY,
Hobby VARCHAR(100)
);
// NUMBER 소수점 이하 까지 허용
// INT 소수점 이하 허용X

--멤버들의 취미 데이터 삽입
INSERT INTO Hobbies (MNO, Hobby)
--VALUES (1, '책읽기')
SELECT 1, '책읽기' FROM DUAL UNION ALL --// 단일값 조회
SELECT 2, '수영' FROM DUAL UNION ALL
SELECT 3, '독서' FROM DUAL UNION ALL
SELECT 4, '코딩' FROM DUAL UNION ALL
SELECT 5, '여행' FROM DUAL UNION ALL
SELECT 6, '블로그' FROM DUAL UNION ALL
SELECT 7, '코테' FROM DUAL UNION ALL
SELECT 8, '쇼핑' FROM DUAL UNION ALL
SELECT 9, '춤추기' FROM DUAL UNION ALL
SELECT 10, '하이킹' FROM DUAL UNION ALL
SELECT 11, '등산' FROM DUAL UNION ALL
SELECT 12, '격투기' FROM DUAL UNION ALL
SELECT 13, '게임' FROM DUAL UNION ALL
SELECT 14, '스포츠관람' FROM DUAL UNION ALL
SELECT 15, '축구' FROM DUAL UNION ALL
SELECT 16, '요가' FROM DUAL UNION ALL
SELECT 17, '낚시' FROM DUAL UNION ALL
SELECT 18, '쇼핑' FROM DUAL UNION ALL
SELECT 19, '테니스' FROM DUAL UNION ALL
SELECT 20, '골프' FROM DUAL UNION ALL
SELECT 21, '여행' FROM DUAL;

GRANT DBA TO khstore;
*/

--멤버의 이름, 이메일 주소 및 취미 검색
SELECT M.MName, M.MEmail, H.Hobby
FROM MEMBERINFO M
JOIN Hobbies H ON M.MNO = H.MNO;

--멤버의 아이디 비밀번호
CREATE TABLE ID_PW (
MNO INT PRIMARY KEY, 
USER_ID VARCHAR(50),
USER_PW VARCHAR(50)
);

-- 멤버들의 아이디와 비밀번호 데이터 삽입 (임의로 생성)
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

--자신의 이름/에 위치한 아이디/ 비밀번호/ 변경 취미/ 생년월일 /이메일
UPDATE id_pw set user_id = 'sun' WHERE mno = 4;
UPDATE id_pw set user_pw = 'light' WHERE mno = 4;
UPDATE HOBBIES set HOBBY = '소설,웹툰보기' WHERE mno = 4;
UPDATE memberinfo set MEMAIL = 'https://hotsixlover.tistory.com/' WHERE mno = 4;
UPDATE memberinfo set MBIRTH = TO_DATE('97-04-27','YY-MM-DD') WHERE mno = 4;
--JOIN 활용해서 멤버의 아이디 비밀번호 함께 출력
SELECT M.MNO,M.Mname,I.User_id, I.User_pw, M.MEmail,M.Mbirth
FROM MEMBERINFO M
JOIN id_pw I ON M.MNO = I.MNO;


--JOIN 활용해서 멤버의 아이디 비밀번호 취미 함께 출력
SELECT M.MNO, M.MNAME,h.hobby, I.USER_ID, i.user_pw, m.memail, m.mbirth
FROM MEMBERINFO M
JOIN id_pw I ON M.MNO = I.MNO
JOIN hobbies H ON M.MNO = H.MNO;

--위에거 다하고 나서 추가해보기


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
 
 --INSERT 문
 --To Date 함수 사용해서 날짜 형식으로 데이터 삽입
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (1, '박창규', '금요일천사', TO_DATE('1970-05-25', 'YYYY-MM-DD'));
 
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (2, '나세희', '8월의 요정', TO_DATE('1997-08-16', 'YYYY-MM-DD'));
 
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (3, '주서경', '11월의 악마', TO_DATE('2002-11-29', 'YYYY-MM-DD'));
 
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (4, '김민수', '2월의 요정', TO_DATE('2000-02-07', 'YYYY-MM-DD'));
 
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (5, '이미혜', '2월의전사', TO_DATE('2001-02-09', 'YYYY-MM-DD'));
 

 --ORDER BY : 결과 정렬
  SELECT * FROM fridaytable ORDER BY name;           --이름을 오름차순 정렬
  SELECT * FROM fridaytable ORDER BY birthdate;
  
 --COUNT 행의 수를 세어줍니다.
 SELECT COUNT(*) AS row_COUNT FROM fridaytable;      --행 갯수 카운트
 
 -- 테이블 구조 변경하기
 ALTER TABLE fridaytable MODIFY description VARCHAR2 (200);   -- description 열의 크기 늘리기
 
 -- SUM 숫자 열의 합을 계산
 SELECT SUM(id) AS id_sum FROM fridaytable;           -- 모든 id값 합산
 
 --TO_CHAR 날짜를 문자열로 변환
 SELECT name, TO_CHAR(birthdate, 'YYYY-MM-DD') AS birthdate_str FROM fridaytable;       --
 
 --LENGTH : 문자열의 길이 반환
 SELECT name, LENGTH(name) AS name_len FROM fridaytable;        --name의 길이를 반환
 
 INSERT INTO fridaytable (id, name, description, birthdate)
 VALUES (6, 'Jane Smith', '한쿡말 어려워요우', TO_DATE('2007-05-05','YYYY-MM-DD'));  --외국인 추가
 
 -- UPPER 문자열을 대문자로 변환
 SELECT name, UPPER(name) AS upper_name FROM fridaytable;       --name 열을 대문자로 변환후 upper_name 열을 임시로 생성 후 같이 SELECT
 -- LOWER 문자열을 소문자로 변환
 SELECT name, LOWER(name) AS lower_name FROM fridaytable;       --name 열을 소문자로 변환후 lower_name 열을 임시로 생성 후 같이 SELECT
 
 --ROUND 숫자를 반올림
 --birthdate 열의 연도를 반올림하여 출력
 --EXTRACT 날짜 값에서 연도를 추출
 SELECT name, ROUND(EXTRACT(YEAR FROM birthdate)) AS BirthYEAR FROM fridaytable; 