package com.kh.file_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("abcde.txt");	// 생성
			writer.write("파일을 덮어써볼까나.");  // 파일 쓰기
			writer.close(); // 파일 안에 내용을 다 쓰면 닫기
			
			
			 
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) !=null) {
				System.out.println(line);
			}
			bufferedReader.close(); // 파일을 다 읽으면 닫아주기(종료).
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
	/*
	String filePath = "설명 적는 란/입출력_IO(InputOutput).txt";
	System.out.println("생성");
	//FileWriter fWriter = new FileWriter(filePath, true);
	// ture : 파일 끝에 이어쓰기
	// false : 파일 덮어쓰기
	//File f = new File("경로설정","NewFile.txt");
	
	
	
	// 만약에 날짜가 오늘 날짜인 폴더가 없을때
	// 폴더를 만들고 mk (make)
	File f = new File("new.txt");
	try {
		
		if(f.createNewFile()) {
			System.out.println("파일을 생성했습니다.");
		} else {
			System.out.println("이미 존재하는 파일입니다.");
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	//FileWriter fw = new FileWriter(f);
	
	String fileName = f.getName();
	
	// FileReader fReader = new FileReader(f,true);
	 * 
	 */


