package chap37_TodoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList {
	private Map<Integer,String> tasks;
	private int list;
	
	public TodoList() {
		tasks = new HashMap<>();
		list = 0;
	}
	
	public void addTask(String task) {
		tasks.put(++list,task);
		
	}
	
	public void removetask(int list) {
		if(tasks.containsKey(list)) {
			tasks.remove(list);
		} else {
			System.out.println("������ ���� �����ϴ�.");
		}
	}
	
	public void displayTasks() {
		System.out.println("���� ���");
		for(Map.Entry<Integer,String> entry : tasks.entrySet()) {
			System.out.println(entry.getKey() + ". " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		TodoList todo = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �߰�: add, ����: remove, ���Ϻ���: list, ����: exit �Է��ϼ���.");
			
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				todo.addTask(task);
			}else if (choice.equals("remove") || choice.equals("REMOVE")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine());
					todo.removetask(index);
				}catch (Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			}else if (choice.equalsIgnoreCase("list")) {
				todo.displayTasks();
			} else if(choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("�߸��� ����Դϴ�.");
			}
			
		}
		System.out.println("���ø����̼� ����");
		sc.close();
		
		
	}

}
