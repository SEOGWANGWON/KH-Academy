package chap30_ThreadMain;

public class StudentThread extends Thread {
					
	private String studentName;
	
	public StudentThread(String name) {
		this.studentName = name;
		
		
	}
	@Override
	public void run() {
		System.out.println(studentName + "��(��) ���θ� �����մϴ�!!");
		for(int i = 1; i <= 300; i++) {
			System.out.println("Thread ���� �� : " + i);
		}
		try {
			Thread.sleep(2000); // �����尡 2�� ���� ���ڱ� ���·� �ֵ��� �մϴ�.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(studentName + "��(��) ���θ� ��Ĩ�ϴ�.");
	}
		
		
		

}
