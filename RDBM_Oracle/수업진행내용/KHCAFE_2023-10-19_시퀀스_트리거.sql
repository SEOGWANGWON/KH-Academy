CREATE TABLE cafes (
    cafe_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    phone_number VARCHAR(15),
    operating_hours VARCHAR(255)
);

CREATE SEQUENCE cafe_seqs
  START WITH 1
  INCREMENT BY 1
  NOCACHE -- 기본 사이즈가 20인 캐시
  NOCYCLE; -- max까지 생성햇을때 1로 다시 돌아가서 사이클을 돌리는지에 대한 여부
  -- NOCYCLE = 사이클을 돌리지않음 (결과는 MAX도달시 에러)
  
  
CREATE OR REPLACE TRIGGER cafes_trigger
BEFORE INSERT ON cafes
FOR EACH ROW
BEGIN
  SELECT cafe_seqs.NEXTVAL
  INTO :NEW.cafe_id
  FROM dual;
END;
/


CREATE TABLE menu (
    menu_id INT PRIMARY KEY,
    cafe_id INT,
    menu_name VARCHAR2(255) NOT NULL,
    price NUMBER(8, 2) NOT NULL,
    description VARCHAR2(500),
    CONSTRAINT fk_cafes         --제약조건
        FOREIGN KEY (cafe_id)   -- 외래키 생성 (참조 키)
        REFERENCES cafes(cafe_id) -- 외래키 정의 또는 관계 형성(FROM 같은 역할)
        ON DELETE CASCADE         -- CASCADE 는 종속이다 쉽게말하면 
        --고유키를 참조한 포링키 포링키
);




INSERT INTO cafes (name, address, phone_number, operating_hours)
VALUES ('카페 서울', '서울시 강남구 역삼로 123', '02-555-1234', '월-금: 07:00-21:00, 주말: 08:00-20:00');

-- 2
INSERT INTO cafes (name, address, phone_number, operating_hours)
VALUES ('종로 그 집', '서울시 종로구 인사동 45', '02-777-4567', '매일: 09:00-22:00');

-- 3
INSERT INTO cafes (name, address, phone_number, operating_hours)
VALUES ('in 바다', '부산시 해운대구 해운대로 67', '051-888-7890', '월-금: 08:30-20:30, 주말: 09:00-19:00');

-- menu 1
INSERT INTO menu (menu_id, cafe_id, menu_name, price)
VALUES (1, 1, '에스프레소', 3.50);

UPDATE menu
SET description = '강렬한 에스프레소 커피 영국을 느낄 수 있음'
WHERE menu_id = 1 AND cafe_id = 1;

-- menu 2
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (2, 1, '아메리카노', 4.00, '매끈한 아메리카노 커피');

-- menu 3
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (3, 2, '카페 라떼', 4.50, '부드러운 카페 라떼');




