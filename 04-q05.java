
public class q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ��ø for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ� (x, y) ���·� ����غ�����. 
		 * ��, x�� y�� 10 ������ �ڿ����Դϴ�.
		 */
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if((4 * i) + (5 * j) == 60) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}

}
