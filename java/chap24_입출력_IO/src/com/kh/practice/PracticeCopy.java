package com.kh.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		// �̹������� jpg �Ǵ� png ������ �����ϸ鿡 ������ ��
		// ����ȭ�鿡�ٰ� ������ ���� ���� �ȿ� ������ �̹��� �����ϱ�;
		
		String copypng = "C:\\Users\\user1\\Desktop\\copy.png";
		String copysjpg = "C:\\Users\\user1\\Desktop\\copys.png";
		
		
		try (FileInputStream fis = new FileInputStream(copypng);
				FileOutputStream fos = new FileOutputStream(copysjpg)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("���� �߾��!!");
		} catch (IOException e) { 
			
			e.printStackTrace();
		}
		
	}

}
