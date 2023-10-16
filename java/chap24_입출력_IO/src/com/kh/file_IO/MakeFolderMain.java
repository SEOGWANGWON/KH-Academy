package com.kh.file_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {
		// window : \
		// Linux or MacOs : /
		// File.separtor
		
		MakeFolderMain mf = new MakeFolderMain();
		//mf.practice1();
		mf.practice2();
		
	}
	public void practice1() {  // 경로설정해서 파일 만들기
		
		// 폴더를 생성할 경로 지정
				String folderPath = "C:\\Users\\user1\\Desktop\\new_folder"; // 원하는 경로 설정
				
				// 폴더 만들기
				File folder = new File(folderPath);
				folder.mkdir();
				
				// exists 이미 존재하는지 확인
				if(!folder.exists()) {
					folder.mkdir();
					System.out.println("폴더가 성공적으로 생성되었습니다.");
				} else {
					System.out.println("폴더가 이미 존재합니다.");
				}
	}
				/*
				try {
					FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\new_folder");
					w.write("User 정보를 담는 곳입니다.\n");
					w.write("Kh 학생");
					w.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}*/
	
	public void practice2() {	// 폴더를 만들고 폴더 안에 파일을 만들기
								// 파일 안에 내용 작성하기
		String folderFile = "C:\\Users\\user1\\Desktop\\Myfile";
		
		File folfile = new File(folderFile);
		
		if(folfile.exists()) {
			System.out.println("폴더 이미 있는데요?");
		} else {
			folfile.mkdir();
			System.out.println("폴더 생성했슴다~");
		}
		
		try {
			FileWriter t = new FileWriter(folderFile+"\\Mytext.txt");
			t.write("잘 됐냐?\n");
			t.write("잘된거라고 믿을게~");
			t.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
