package q15;

public class MemberService {

	/*
	 * MemberService 클래스에 login() 메소드와 logout() 메소드를 선언하려고 합니다. 
	 * login() 메소드를 호출할 때에는 매개값으로 id와 password를 제공하고, logout() 메소드는 id만 매개값으로 제공합니다. 
	 * MemberService 클래스와 login(), logout() 메소드를 선언해보세요.
	 * 1) login() 메소드는 매개값 id가 "hong", 매개값 password가 "12345"일 경우에만 true로 리턴하고 
	 * 그 이외의 값일 경우에는 false를 리턴하도록 하세요.
	 * 2) logout() 메소드의 내용은 "로그아웃 되었습니다."가 출력되도록 하세요.
	 * 리턴 타입 / 메소드 이름 / 매개 변수(타입)
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
		System.out.println("로그아웃 되었습니다.");
	}
}
