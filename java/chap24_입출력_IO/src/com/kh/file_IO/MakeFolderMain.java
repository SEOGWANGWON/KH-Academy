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
	public void practice1() {  // ��μ����ؼ� ���� �����
		
		// ������ ������ ��� ����
				String folderPath = "C:\\Users\\user1\\Desktop\\new_folder"; // ���ϴ� ��� ����
				
				// ���� �����
				File folder = new File(folderPath);
				folder.mkdir();
				
				// exists �̹� �����ϴ��� Ȯ��
				if(!folder.exists()) {
					folder.mkdir();
					System.out.println("������ ���������� �����Ǿ����ϴ�.");
				} else {
					System.out.println("������ �̹� �����մϴ�.");
				}
	}
				/*
				try {
					FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\new_folder");
					w.write("User ������ ��� ���Դϴ�.\n");
					w.write("Kh �л�");
					w.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}*/
	
	public void practice2() {	// ������ ����� ���� �ȿ� ������ �����
								// ���� �ȿ� ���� �ۼ��ϱ�
		String folderFile = "C:\\Users\\user1\\Desktop\\Myfile";
		
		File folfile = new File(folderFile);
		
		if(folfile.exists()) {
			System.out.println("���� �̹� �ִµ���?");
		} else {
			folfile.mkdir();
			System.out.println("���� �����߽���~");
		}
		
		try {
			FileWriter t = new FileWriter(folderFile+"\\Mytext.txt");
			t.write("�� �Ƴ�?\n");
			t.write("�ߵȰŶ�� ������~");
			t.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
