package com.kh.finalSample;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOMain {
	
	public static void main(String[] args) {
		
	
	try {
		FileWriter fw = null;
							// 2번째 인자의 값이 boolean true값이 지정되면
							// 해당 파일에 이어쓰기가 가능
		fw = new FileWriter("file.txt");
		fw.write("너왜 문자열만되는거니 /n 은 안되네 \n");
		fw.write("아래로 내려갔나?\n");
		fw.write("흠 어떨까나\n");
		fw.close();  // close로 닫아줘야 파일안에 값이 넣어짐
					// 왜냐하면 계속 입력을 대기중인거임
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
