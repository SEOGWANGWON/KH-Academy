package com.kh.file_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("abcde.txt");	// ����
			writer.write("������ ����Ẽ�.");  // ���� ����
			writer.close(); // ���� �ȿ� ������ �� ���� �ݱ�
			
			
			 
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) !=null) {
				System.out.println(line);
			}
			bufferedReader.close(); // ������ �� ������ �ݾ��ֱ�(����).
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
	/*
	String filePath = "���� ���� ��/�����_IO(InputOutput).txt";
	System.out.println("����");
	//FileWriter fWriter = new FileWriter(filePath, true);
	// ture : ���� ���� �̾��
	// false : ���� �����
	//File f = new File("��μ���","NewFile.txt");
	
	
	
	// ���࿡ ��¥�� ���� ��¥�� ������ ������
	// ������ ����� mk (make)
	File f = new File("new.txt");
	try {
		
		if(f.createNewFile()) {
			System.out.println("������ �����߽��ϴ�.");
		} else {
			System.out.println("�̹� �����ϴ� �����Դϴ�.");
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	//FileWriter fw = new FileWriter(f);
	
	String fileName = f.getName();
	
	// FileReader fReader = new FileReader(f,true);
	 * 
	 */


