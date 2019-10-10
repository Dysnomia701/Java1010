
/*
 * 이 클래스를 불러서 사용 하는 방법
 * 클래스를 선언 하고 클래스 변수를 통해 메소드 접근
 * 예) TestClass tc1 = new TestClass1();
 *    tc1.method();
 */
public class TestClass1 {
	// 클래스 안에는
	// 생성자
	public TestClass1() {}
	// 변수
	int a;
	String str;
	// 메소드
	// 만 작성 가능
	// 명령은 모두 메소드 안에서 작성
	// System.out.println(); // 오류!! 메소드 안에!
	
	// 메소드(함수)
	public void method() {
		System.out.println("TestClass1의 메소드");
	}
	
	public void hello() {
		System.out.println("Hello World!!");
	}

}
