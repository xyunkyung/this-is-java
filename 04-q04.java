
public class q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * while���� Math.random()�޼ҵ带 �̿��ؼ� �� ���� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·� ����ϰ�,
		 * ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����. 
		 * ���� ���� 5�� �Ǵ� ������ (1, 4), (4, 1), (2, 3), (3, 2)�Դϴ�.
		 */
		
		int num1 = 0;
		int num2 = 0;

		while((num1 + num2) != 5) {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
		}
	}

}
