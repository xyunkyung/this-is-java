package q07;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("White", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws Exception {

		// id�� "blue"�� �ƴ϶�� NotExistIDException �߻���Ŵ
		if (!id.equals("blue")) {
			throw new NotExistIDExcapetion("���̵� �������� �ʽ��ϴ�.");
		}

		// password�� "12345"�� �ƴ϶�� WrongPasswordException �߻���Ŵ
		if (!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}

}
