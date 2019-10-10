
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 메소드");
		System.out.println("내가 만든 클래스에 메소드를 불러 보자");
		TestClass1 tc1 = new TestClass1();
		tc1.method(); // 클래스 안에 메소드 접근
		tc1.hello();
		tc1.hello("송태민");
		tc1.hello("박홍준");
		tc1.hello1();
		
		TestClass2 tc2 = new TestClass2();
		tc2.hello();
		tc2.hello2();
		tc2.name = "밖에서";
		tc2.hello2();
		System.out.println("당신의 이름은: " + tc2.name + "입니다.");
		// 전화 번호를 셋팅 하기 위해
		// 클래스 변수에 직접 접근 해볼까?
//		tc2.tel = "010-1234-1234"; // 직접접근 NONO
		tc2.setTel("010-1234-1234");
		tc2.printTel(); // 위에서 입력한 전화번호를 출력
		// 내가 위에 전화번호를 가지고 와서 가공을 하고 싶어
		// 내 마음 대로 전화번호를 이쁘게 출력하고 싶다.
		String tel = tc2.getTel();
		System.out.println("당신의 연락처는? " + tel);
		
		TestClass3 tc3 = new TestClass3();
		// 이름, 전화번호, 생일년월일, 이메일 값을 입력
		tc3.setName("송태민");
		tc3.setTel("010-1234-1234");
		tc3.setBirth("1998.02.07");
		tc3.setEmail("xoals8755@gmail.com");
		
		tc3.printAll();
		
		TestClass4 tc4 = new TestClass4();
		tc4.setName("송태민");
		tc4.setTel("010-1234-1234");
		tc4.setBirth("98.02.07");
		tc4.setEmail("xoals8755@gmail.com");
		tc4.setHakNum(20170996);
		tc4.setJuso("부산 사상구 학장동");
		
		tc4.printAll();
	}

}
