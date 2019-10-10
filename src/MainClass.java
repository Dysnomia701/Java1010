
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 메소드");
		System.out.println("내가 만든 클래스에 메소드를 불러 보자");
		TestClass1 tc1 = new TestClass1();
		tc1.method(); // 클래스 안에 메소드 접근
		tc1.hello();
	}

}
