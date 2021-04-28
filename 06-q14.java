
public class q14 {
/*
 * 위에서 작성한 Member 클래스에 생성자를 추가하려고 합니다. 다음과 같이 Member 객체를 생성할 때 
 * name 필드와  id 필드를 외부에서 받은 값으로 초기화하려면 생성자를 어떻게 선언해야합니까?
 * Member user1 = new Member("홍길동", "hong");
 * Member user2 = new Member("김자바", "java");
 */

	String name;
	String id;
	String password;
	int age;
	
	q14 (String name, String id) {
		this.name = name;
		this.id = id;
	}
}
