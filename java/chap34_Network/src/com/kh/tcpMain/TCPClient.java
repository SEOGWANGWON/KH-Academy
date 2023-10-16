package com.kh.tcpMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	
	public static void main(String[] args) throws Exception {
		
			// 서버 주소와 포트번호로 소켓 생성
			// 서버 주소와 포트번호는 내가 연결하고자 하는 포트와 동일해야함
			Socket socket = new Socket("localhost", 1004);
			System.out.println("[ Server Connect ]");
			
			// 보낼 때 코드
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			printStream.print("HI SERVER");
			printStream.flush();
			
			// 서버로부터 읽어옴
			InputStream InStream = socket.getInputStream();
			Scanner sc = new Scanner(InStream);
			System.out.println("[ Clinet ] server" + sc.nextLine());
			
			socket.close();
			System.out.println("Byte Server See you later~!");
	}

}
