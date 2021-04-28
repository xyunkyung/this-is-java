package q20;

import java.util.Scanner;

public class BankApplication {

	
		private static Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String [] args) {
			boolean run = true;
			
			while(run) {
				System.out.println("--------------------------------------------");
				System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
				System.out.println("--------------------------------------------");
				System.out.print("���� > ");
				
				int selectNo = scanner.nextInt();
				
				if(selectNo == 1) {
					createAccount();
				} else if(selectNo == 2) {
					accountList();
				} else if(selectNo == 3) {
					deposit();
				} else if(selectNo == 4) {
					withdraw();
				} else if(selectNo == 5) {
					run = false;
				}
			}
			System.out.println("���α׷� ����");
	}

		// ���� �����ϱ�
		private static void createAccount() {
			System.out.println("------");
			System.out.println("���»���");
			System.out.println("------");
			
			System.out.print("���¹�ȣ : ");
			String accountNum = scanner.next();
			
			System.out.print("������ : ");
			String accountOwner = scanner.next();
			
			System.out.print("�ʱ��Աݾ� : ");
			int accountBal = scanner.nextInt();
			
			Account newAccount = new Account(accountNum, accountOwner, accountBal);
			
			for(int i = 0; i < accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = newAccount;
					break;
				}
			}
			System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		}
		
		// ���� ��� ����
		private static void accountList() {
			System.out.println("------");
			System.out.println("���¸��");
			System.out.println("------");
			
			for(int i = 0; i < accountArray.length; i++) {
				Account account = accountArray[i];
				if(accountArray[i] != null) {
					System.out.println(account.toString());
				}
			}
		}
		
		// �����ϱ�
		private static void deposit() {
			System.out.println("------");
			System.out.println("����");
			System.out.println("------");
			
			System.out.print("���¹�ȣ : ");
			String accountNum = scanner.next();
			
			System.out.print("���ݾ� : ");
			int accountBal = scanner.nextInt();
			
			Account account = findAccount(accountNum);
			
			account.setBalance(account.getBalance() + accountBal);
			System.out.println("��� : ������ �����Ǿ����ϴ�.");
		}
		
		// ����ϱ�
		private static void withdraw() {
			System.out.println("------");
			System.out.println("���");
			System.out.println("------");
			
			System.out.print("���¹�ȣ : ");
			String accountNum = scanner.next();
			System.out.print("��ݾ� : ");
			int accountBal = scanner.nextInt();
			
			Account account = findAccount(accountNum);
			
			account.setBalance(account.getBalance() - accountBal);
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
		}
		
		// Account �迭���� ano�� ������ Account ��ü ã��
		private static Account findAccount(String ano) {
			Account account = null;
			
			for(int i = 0; i < accountArray.length; i++) {
				if(accountArray[i] != null) {
					String accountNum = accountArray[i].getAno();
					if(accountNum.equals(ano)) {
						account = accountArray[i];
						break;
					}
				}
			}
			return account;
		}
}
