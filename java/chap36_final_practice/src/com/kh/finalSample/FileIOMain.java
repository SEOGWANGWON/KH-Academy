package com.kh.finalSample;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOMain {
	
	public static void main(String[] args) {
		
	
	try {
		FileWriter fw = null;
							// 2��° ������ ���� boolean true���� �����Ǹ�
							// �ش� ���Ͽ� �̾�Ⱑ ����
		fw = new FileWriter("file.txt");
		fw.write("�ʿ� ���ڿ����Ǵ°Ŵ� /n �� �ȵǳ� \n");
		fw.write("�Ʒ��� ��������?\n");
		fw.write("�� ��\n");
		fw.close();  // close�� �ݾ���� ���Ͼȿ� ���� �־���
					// �ֳ��ϸ� ��� �Է��� ������ΰ���
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
