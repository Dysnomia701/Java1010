
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �޼ҵ�");
		System.out.println("���� ���� Ŭ������ �޼ҵ带 �ҷ� ����");
		TestClass1 tc1 = new TestClass1();
		tc1.method(); // Ŭ���� �ȿ� �޼ҵ� ����
		tc1.hello();
		tc1.hello("���¹�");
		tc1.hello("��ȫ��");
		tc1.hello1();
		
		TestClass2 tc2 = new TestClass2();
		tc2.hello();
		tc2.hello2();
		tc2.name = "�ۿ���";
		tc2.hello2();
		System.out.println("����� �̸���: " + tc2.name + "�Դϴ�.");
		// ��ȭ ��ȣ�� ���� �ϱ� ����
		// Ŭ���� ������ ���� ���� �غ���?
//		tc2.tel = "010-1234-1234"; // �������� NONO
		tc2.setTel("010-1234-1234");
		tc2.printTel(); // ������ �Է��� ��ȭ��ȣ�� ���
		// ���� ���� ��ȭ��ȣ�� ������ �ͼ� ������ �ϰ� �;�
		// �� ���� ��� ��ȭ��ȣ�� �̻ڰ� ����ϰ� �ʹ�.
		String tel = tc2.getTel();
		System.out.println("����� ����ó��? " + tel);
		
		TestClass3 tc3 = new TestClass3();
		// �̸�, ��ȭ��ȣ, ���ϳ����, �̸��� ���� �Է�
		tc3.setName("���¹�");
		tc3.setTel("010-1234-1234");
		tc3.setBirth("1998.02.07");
		tc3.setEmail("xoals8755@gmail.com");
		
		tc3.printAll();
		
		TestClass4 tc4 = new TestClass4();
		tc4.setName("���¹�");
		tc4.setTel("010-1234-1234");
		tc4.setBirth("98.02.07");
		tc4.setEmail("xoals8755@gmail.com");
		tc4.setHakNum(20170996);
		tc4.setJuso("�λ� ��� ���嵿");
		
		tc4.printAll();
	}

}
