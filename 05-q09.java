import java.util.Scanner;

public class q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ---------------------------------------------------------------
			1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����
		   ----------------------------------------------------------------
			����> 1
			�л���> 3
		   ----------------------------------------------------------------
			1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����
		   ----------------------------------------------------------------
			����> 2
			scores[0]> 85
			scores[1]> 95
			scores[2]> 93
			\---------------------------------------------------------------
			1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����
			\---------------------------------------------------------------
			����> 3
			scores[0]: 85
			scores[1]: 95
			scores[2]: 93
			\---------------------------------------------------------------
			1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����
			\---------------------------------------------------------------
			����> 4
			�ְ� ���� : 95
			��� ���� : 91.0
			\---------------------------------------------------------------
			1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����
			\---------------------------------------------------------------
			����> 5
			���α׷� ����
		 */
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("----------------------------------------------");
			System.out.println("���� > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("�л� �� > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "] : ");
					int score = scanner.nextInt();
					scores[i] = score;
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
					if (scores[i] > max) {
						max = scores[i];
					}
				}
				avg = (double) sum / studentNum;
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("���α׷� ����");
	}

}
