package com.kh.file_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamMain {
	/*
	 FileOutputStream
	  이진 데이터를 파일에 쓰기 위해 사용
	  입출력 작업을 처리하기 위한 클래스
	  
	  
	 */
	
	

	public static void main(String[] args) {
		// 파일에 쓸 경로를 지정
		String filePath = "ex.txt";
		try {
			// 지정된 파일을 대상으로 FileOutputStream 생성
			FileOutputStream fos = new FileOutputStream(filePath);
			
			// 파일에 쓰일 데이터
			String data = "곤니찌와~";
			
			// 문자열을 바이트 배열로 변환하고 파일에 쓰자
			byte[] bArray = data.getBytes(); // getBytes() 메서드를 사용해서 바이트로 변환
			try {
				fos.write(bArray);
				
				//FileOutputStream 닫아 해제
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
