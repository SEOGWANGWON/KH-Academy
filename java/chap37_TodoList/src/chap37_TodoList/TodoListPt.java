package chap37_TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoListPt {
	private ArrayList<String> tasks;
	
	public TodoListPt() {
		tasks = new ArrayList<>();
	}
	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	public void removetask(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("�߸��� �ε����Դϴ�.");
		}
	}
	
	public void displayTasks() {
		System.out.println("my TodoList");
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + ". " + tasks.get(i));
		}
	}

	public static void main(String[] args) {
		TodoListPt todo = new TodoListPt();
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
					int index = Integer.parseInt(sc.nextLine()) -1;
					todo.removetask(index);
				}catch(Exception e) {
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


