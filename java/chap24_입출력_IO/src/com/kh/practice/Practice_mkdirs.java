package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		
		pm.Practice1();
		
		
	}
	public void Practice1() {
		// 폴더 연속으로 2개 만들기	C:\\Users\\user1\\Desktop\\이름1\\이름2
		String my = "C:\\Users\\user1\\Desktop\\knock";
		
		try {
			FileWriter fw = new FileWriter(my+"hi.txt");
			fw.write("왜안되냐고\n");
			fw.write("잘되네;;");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f = new File(my);
		boolean bf = f.mkdir();
		if(bf) {
			File doublef = new File(my+"\\knock");
			
		} else {
			
		}
		
		
	
	
		
		
	
	
	
	
	
	}
	
	public void Practice2() { // 폴더 연속으로 3개 만들기  C:\\Users\\user1\\java_Workspace\\chap25_
		
		
		
		
	}
	
	public void Practice3() {
// 폴더 연속으로 5개 만들기	C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\KPop\\Group‪
		
	}

}
