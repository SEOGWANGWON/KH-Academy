package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
 	���� : �������� ������� �� 
 */
public class RandomMain {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������
		RandomMain rm = new RandomMain();
		rm.Lotto();

	}
	public void Lotto() {
		Random rd = new Random(); // ���� ��ü ����
		// ArrayList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();
		// �ߺ��� ���ϱ� ���� set�� ����� �� ����
		// 6 ���� �� �� ��
		int six = 6;
		while(lottoNum.size() < six) {
			// 1 ~ 45 ������ �����ؼ� ���� ����
			int ranNumber = rd.nextInt(45)+1;
			lottoNum.add(ranNumber);
			
			// �ߺ��� ���� list�� ����� �� ����
			if(!lottoNum.contains(ranNumber)) { 
				// !�� ������� ���� ������ ���� �Ǵ� ���̱� ������ ���ѷ���
				lottoNum.add(ranNumber);
			}
		}
		System.out.println("�ζ� ��ȣ : " + lottoNum);
		
		// �����ϴ��� ���� �ߺ�x
		
		
		
	}
	
	public void RandomExam() {
		Random rd = new Random(); // ���� ��ü ����
		
		// 1. ���� ���� ������ ������ ������ ������ �ڵ�.
		int ranInt = rd.nextInt(100); // 0 ~ 99���̿��� 1��
		System.out.println(ranInt);
		
		// 2. �Ǽ� ���� ������ ������ ������ ������ �ٵ�.
		double ranD = rd.nextDouble(); // 0.0 ~ 1.0
		System.out.println(ranD);
		
		// 3. �Ҹ��� �� �������� ����
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}

}
