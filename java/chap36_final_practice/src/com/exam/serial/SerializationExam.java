package com.exam.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) throws Exception {
		Person p = new Person("���ؽ�",30);
		
		try {
			FileOutputStream fileOut = new FileOutputStream("Person.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
			System.out.println("Person ��ü�� ����ȭ�Ǿ� Person.txt ���Ͽ� �����");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ���Ͽ��� ��ü�� ������ȭ�Ͽ� �о��
		FileInputStream fileIn = new FileInputStream("Person.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		Person deSerialPerson = (Person)in.readObject();
		in.close();
		fileIn.close();
		System.out.println("Person.txt ���Ͽ��� ��ü�� ������ȭ �޽��ϴ�.");
		System.out.println("������ȭ�� ��ü ���� : " + deSerialPerson );
		
	}

}
