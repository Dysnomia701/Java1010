
/*
 * �л��� �� ����
 */
public class TestClass4 extends TestClass3{
	// �̸�
	// ��ȭ��ȣ
	// ����
	// �̸���
	// ---------- TestClass3�� ��� ������ ��������� ����
	
	// ---------- ���⼭ ���� ����
	// �й�
	// �ּ�
	// ���...
//	private String name;
//	private String tel;
	// ... ��... �ʹ� �ʹ� ����� �� ��ߵ� �̤�
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
		System.out.println("�̸�: " + getName());
		System.out.println("��ȭ��ȣ: " + getTel());
		System.out.println("����: " + getBirth());
		System.out.println("�̸���: " + getEmail());
		System.out.println("�й�: " + getHakNum());
		System.out.println("�ּ�: " + getJuso());
	}
	
}
