package com.exam.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) throws Exception {
		Person p = new Person("엄준식",30);
		
		try {
			FileOutputStream fileOut = new FileOutputStream("Person.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
			System.out.println("Person 객체가 직렬화되어 Person.txt 파일에 저장됨");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 파일에서 객체를 역직렬화하여 읽어옴
		FileInputStream fileIn = new FileInputStream("Person.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		Person deSerialPerson = (Person)in.readObject();
		in.close();
		fileIn.close();
		System.out.println("Person.txt 파일에서 객체를 역직렬화 햇습니다.");
		System.out.println("역직렬화된 객체 정보 : " + deSerialPerson );
		
	}

}
