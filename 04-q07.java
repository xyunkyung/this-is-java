import java.util.Scanner;

public class q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * while���� Scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ带 �ۼ��غ�����. 
		 * �� ���α׷��� �����Ű�� ������ ���� ���� ����� ���;� �մϴ�.
		 */
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("------------------------------");
			System.out.print("���� > ");
			
			int num = scanner.nextInt();
			int money = 0;
			
			if(num == 1) {
				System.out.print("���ݾ� > ");
				money = scanner.nextInt();
				balance += money;
			} else if(num == 2) {
				System.out.print("��ݾ� > ");
				money = scanner.nextInt();
				balance -= money;
			} else if(num == 3) {
				System.out.println("�ܰ� > " + balance);
			} else {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
