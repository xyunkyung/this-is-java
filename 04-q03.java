
public class q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for���� �̿��ؼ� 1���� 100������ ���� �� 3�� ����� ������ ���Ͻÿ�.
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ����� �� : " + sum);
	}

}
