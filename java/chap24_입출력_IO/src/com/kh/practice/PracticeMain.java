package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();
		
		
		
		
	}
	
	public void practice1() { //  ��μ����ؼ� ���� �����
		
		String url = "C:\\Users\\user1\\Desktop\\����.txt";
		
		try {
				
			
			FileWriter w = new FileWriter(url);
			// ���� ����
			w.write("���� ���⸦ �õ��մϴ�. �㿣��~\n");
			
			w.write("�߰��� ��������");
			
			// ��� ������ ��ΰ� Ȯ���� ��� ������
			FileReader r = new FileReader(url);
			BufferedReader bferReader = new BufferedReader(r);
			// ���� �ݱ�
			w.close();
			
			String myfile;
			while((myfile = bferReader.readLine()) != null) {
				System.out.println(myfile);
			}
			bferReader.close();
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public void practice2() {
	
		String url = "C:\\Users\\user1\\Desktop";
		File f = new File(url);
		
		try {
			FileWriter fw = new FileWriter(url+"\\�ȳ��ϼ���.txt");
			fw.write("�� File ������ ������ �ʴ°ɱ�\n");
			fw.write("�װ��� �˰�ʹ�.");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}