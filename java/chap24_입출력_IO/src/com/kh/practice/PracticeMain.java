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
	
	public void practice1() { //  경로설정해서 파일 만들기
		
		String url = "C:\\Users\\user1\\Desktop\\문제.txt";
		
		try {
				
			
			FileWriter w = new FileWriter(url);
			// 파일 쓰기
			w.write("파일 쓰기를 시도합니다. 쥐엔장~\n");
			
			w.write("추가냐 덮어지냐");
			
			// 어디서 보던지 경로가 확실한 경로 절대경로
			FileReader r = new FileReader(url);
			BufferedReader bferReader = new BufferedReader(r);
			// 파일 닫기
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
			FileWriter fw = new FileWriter(url+"\\안녕하세요.txt");
			fw.write("왜 File 폴더는 생기지 않는걸까\n");
			fw.write("그것이 알고싶다.");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}