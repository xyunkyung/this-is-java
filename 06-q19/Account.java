package q19;

public class Account {

	/*
	 * ���� ���� ��ä�� Account ��ü�� �ܰ�(balance) �ʵ带 ������ �ֽ��ϴ�. 
	 * balance �ʵ�� �������� �� �� ����, �ִ� �鸸 �������� ������ �� �ֽ��ϴ�. 
	 * �ܺο��� balance �ʵ带 ������� �������� ���ϵ��� �ϰ�, 
	 * 0 <= balance <= 1,000,000 ������ ���� ���� �� �ֵ��� Account Ŭ������ �ۼ��غ�����.
	 * 1) Setter�� Getter�� �̿��ϼ���.
	 * 2) 0�� 1,000,000�� MIN_BALANCE�� MAX_BALANCE ����� �����ؼ� �̿��ϼ���.
	 * 3) Setter�� �Ű����� �����̰ų� �鸸 ���� �ʰ��ϸ� ���� balance ���� �����ϼ���.
	 */
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance = 0;
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
		this.balance = balance;
		}
	}
	public int getBalance() {
		return this.balance;
	}
}
