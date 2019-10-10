
/*
 * 학생의 상세 정보
 */
public class TestClass4 extends TestClass3{
	// 이름
	// 전화번호
	// 생일
	// 이메일
	// ---------- TestClass3이 들고 있으니 여기까지는 생략
	
	// ---------- 여기서 부터 시작
	// 학번
	// 주소
	// 등등...
//	private String name;
//	private String tel;
	// ... 등... 너무 너무 힘들어 또 써야되 ㅜㅜ
	private int hakNum;
	private String juso;
	
	public int getHakNum() {
		return hakNum;
	}
	public void setHakNum(int hakNum) {
		this.hakNum = hakNum;
	}
	public String getJuso() {
		return juso;
	}
	public void setJuso(String juso) {
		this.juso = juso;
	}
	
	@Override
	public void printAll() {
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getTel());
		System.out.println("생일: " + getBirth());
		System.out.println("이메일: " + getEmail());
		System.out.println("학번: " + getHakNum());
		System.out.println("주소: " + getJuso());
	}
	
}
