package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList_Case {
	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNum = 1;
		
		
		Scanner sc = new Scanner(System.in);
		// �� �� ����� ����
		
		while (true) {
			System.out.println("�ȳ��ϼ���. �� ���� �������ּ��� : ");
			System.out.println("�� �� �߰��� ���� 1�� �־��ּ���.");
			System.out.println("�� �� ���Ŵ� ���� 2�� �־��ּ���.");
			System.out.println("�����Ͻ÷��� ���� 3�� �־��ּ���");
			System.out.println("�� �� ����� ���÷��� ���� 4�� �־��ּ���");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("�߰��Ͻ� �� ���� �����ּ���.");
				String todoItem = sc.nextLine();
				todoMap.put(taskNum++, todoItem);
				System.out.println("�� ���� �߰��߽��ϴ�.");
				break;
			case 2:
				System.out.println("�����ϰ���� ���� ��ȣ�� �����ּ���.");
				int removeNum = sc.nextInt();
				if(todoMap.containsKey(removeNum)) {
					todoMap.remove(removeNum);
					System.out.println("�� ���� �����߽��ϴ�.");
				}else {
					System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");
					
				}
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				System.exit(0);
				break;
			case 4:
				System.out.println("���� ��� �Դϴ�.");
				for(Map.Entry<Integer,String> list : todoMap.entrySet()) {
					System.out.println(list);
				}
				break;
			default:
				System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");
				
			}
			
			
		}
		
		
		
	}
}
