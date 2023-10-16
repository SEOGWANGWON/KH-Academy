package com.kh.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		// 이미지파일 jpg 또는 png 파일을 바탕하면에 저장한 후
		// 바탕화면에다가 폴더를 만들어서 폴더 안에 복사한 이미지 저장하기;
		
		String copypng = "C:\\Users\\user1\\Desktop\\copy.png";
		String copysjpg = "C:\\Users\\user1\\Desktop\\copys.png";
		
		
		try (FileInputStream fis = new FileInputStream(copypng);
				FileOutputStream fos = new FileOutputStream(copysjpg)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("성공 했어요!!");
		} catch (IOException e) { 
			
			e.printStackTrace();
		}
		
	}

}
