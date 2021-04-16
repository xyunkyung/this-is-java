import java.util.Scanner;

public class q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요. 
		 * 이 프로그램을 실행시키면 다음과 같은 실행 결과가 나와야 합니다.
		 */
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			
			int num = scanner.nextInt();
			int money = 0;
			
			if(num == 1) {
				System.out.print("예금액 > ");
				money = scanner.nextInt();
				balance += money;
			} else if(num == 2) {
				System.out.print("출금액 > ");
				money = scanner.nextInt();
				balance -= money;
			} else if(num == 3) {
				System.out.println("잔고 > " + balance);
			} else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
