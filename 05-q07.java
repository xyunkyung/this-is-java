
public class q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �־��� �迭�� �׸񿡼� �ִ밪�� ���غ����� (for���� �̿��ϼ���.)
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}

		System.out.println("max : " + max);
	}

}