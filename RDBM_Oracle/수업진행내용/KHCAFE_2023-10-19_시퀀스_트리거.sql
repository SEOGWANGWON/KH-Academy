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
  NOCACHE -- �⺻ ����� 20�� ĳ��
  NOCYCLE; -- max���� ���������� 1�� �ٽ� ���ư��� ����Ŭ�� ���������� ���� ����
  -- NOCYCLE = ����Ŭ�� ���������� (����� MAX���޽� ����)
  
  
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
    CONSTRAINT fk_cafes         --��������
        FOREIGN KEY (cafe_id)   -- �ܷ�Ű ���� (���� Ű)
        REFERENCES cafes(cafe_id) -- �ܷ�Ű ���� �Ǵ� ���� ����(FROM ���� ����)
        ON DELETE CASCADE         -- CASCADE �� �����̴� ���Ը��ϸ� 
        --����Ű�� ������ ����Ű ����Ű
);




INSERT INTO cafes (name, address, phone_number, operating_hours)
VALUES ('ī�� ����', '����� ������ ����� 123', '02-555-1234', '��-��: 07:00-21:00, �ָ�: 08:00-20:00');

-- 2
INSERT INTO cafes (name, address, phone_number, operating_hours)
VALUES ('���� �� ��', '����� ���α� �λ絿 45', '02-777-4567', '����: 09:00-22:00');

-- 3
INSERT INTO cafes (name, address, phone_number, operating_hours)
VALUES ('in �ٴ�', '�λ�� �ؿ�뱸 �ؿ��� 67', '051-888-7890', '��-��: 08:30-20:30, �ָ�: 09:00-19:00');

-- menu 1
INSERT INTO menu (menu_id, cafe_id, menu_name, price)
VALUES (1, 1, '����������', 3.50);

UPDATE menu
SET description = '������ ���������� Ŀ�� ������ ���� �� ����'
WHERE menu_id = 1 AND cafe_id = 1;

-- menu 2
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (2, 1, '�Ƹ޸�ī��', 4.00, '�Ų��� �Ƹ޸�ī�� Ŀ��');

-- menu 3
INSERT INTO menu (menu_id, cafe_id, menu_name, price, description)
VALUES (3, 2, 'ī�� ��', 4.50, '�ε巯�� ī�� ��');




