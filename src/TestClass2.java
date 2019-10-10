
public class TestClass2 {
	// 이름이 계속 사용이 되어서 변수로 따로 만듬
	// 클래스 안에 선언 되어 지는 변수를 멤버 변수
	String name; // 초기값이 null
	int num; 	 // 초기값이 0
	// 접근 제어 위 변수들 처럼 클래스 밖에서 접근 못하게
	// 막아야 한다!! 이건 법이 아니고 우리들의 약속!!
	private String tel;
	
	// 위 처럼 비공개된 변수를 사용 할려면
	// public 의 메소드를 통해 사용
	public void setTel(String tel) {
		// tel = tel; // 지역 변수와 멤버 변수가 이름이 같을때 어떤건지? 모호!!
		this.tel = tel;
	}
	
	// public 메소드를 통해 tel 변수의 값을 클래스 외부로 전달
	public String getTel() {
		return tel;
	}
	
	// tel변수를 화면 출력
	public void printTel() {
		System.out.println(tel);
	}
	
	public void hello() {
		//여기(메소드)에 선언 되어 지는 변수를 지역 변수
		String name;
		System.out.println("안녕!! 나는 TestClass2 야");
	}
	
	// 멤버 변수 name을 출력 해주는 메소드
	public void hello2() {
		System.out.println(name);
	}
}
