package q15;

public class MemberService {

	/*
	 * MemberService Ŭ������ login() �޼ҵ�� logout() �޼ҵ带 �����Ϸ��� �մϴ�. 
	 * login() �޼ҵ带 ȣ���� ������ �Ű������� id�� password�� �����ϰ�, logout() �޼ҵ�� id�� �Ű������� �����մϴ�. 
	 * MemberService Ŭ������ login(), logout() �޼ҵ带 �����غ�����.
	 * 1) login() �޼ҵ�� �Ű��� id�� "hong", �Ű��� password�� "12345"�� ��쿡�� true�� �����ϰ� 
	 * �� �̿��� ���� ��쿡�� false�� �����ϵ��� �ϼ���.
	 * 2) logout() �޼ҵ��� ������ "�α׾ƿ� �Ǿ����ϴ�."�� ��µǵ��� �ϼ���.
	 * ���� Ÿ�� / �޼ҵ� �̸� / �Ű� ����(Ÿ��)
	 * boolean / login / id(String), password(String)
	 * void / logout / id(String)
	 */

	boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
