package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {
	public static void main(String[] agrs) throws IOException {
		// ������ �����ϱ� ���� ���� ����
		Socket socket = new Socket("localhost",9999);
		
		// ������ �����͸� ������ ���� ��� ��Ʈ�� ����
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		// �����κ��� �����͸� �ޱ� ���� �Է� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		// Ű����κ��� �Է¹ޱ� ���� ����
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		String userInputString;
		while((userInputString = userInput.readLine()) != null) {
			// ����� �Է��� ������ �����ϰڽ��ϴ�.
			out.println(userInputString);
			
			// ������ ���� ���� ���� ���
			String serverResponse = in.readLine();
			System.out.println("���� ���� ������ : " + serverResponse);
			
		}
		// ���� �� �Է� ��Ʈ�� �ݱ�
		socket.close();
		userInput.close();
		
	}

}
