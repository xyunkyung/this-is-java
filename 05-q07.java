
public class q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주어진 배열의 항목에서 최대값을 구해보세요 (for문을 이용하세요.)
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
