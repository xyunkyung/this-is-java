package q15;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}
