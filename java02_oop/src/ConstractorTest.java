
public class ConstractorTest {
	int num=10;  //��������
	String name;
	String tel="010-1111-2222";
	  //�����ڴ� ������ �ʿ��Ѹ�ŭ ���� �� ������ �Ȱ��� ������ ������ �Ȱ��� ������Ÿ���̸� �ȵȴ�.	
	public ConstractorTest() { // �Ű������� �ִ� �ٸ� �����ڰ� �������� �����Ϸ��� �������ش�.
		
	}
	public ConstractorTest(int num) {  //�������� num
		System.out.println("ConstractorTest(int num) ������");
		num = num; //�̷��� �ϸ� ����� ����������
		this.num = num; //this�� ���� Ŭ����. �̷��� �ϸ� ����������
		//���� �̸��� �Ȱ��� ������ ���ص� �ȴ�. ex) num1
	}
	public ConstractorTest(String name) {
		
	}
	public ConstractorTest(int num, String name, String tel) {
		//�����ڿ��� �ٸ� �����ڸ� ȣ���ϱ� ���ؼ��� �ݵ�� ù��° ���๮���� ó���ؾ� �Ѵ�.
//		ConstractorTest(num); //�����ڿ��� �ٸ������ڸ� ȣ���ϱ����� ������ �޼ҵ带 ������ ����. �״�� this�� ����.
		this(num); //�ٸ������� ȣ��
		
		
		System.out.println("public ConstractorTest(int num, String name, String tel) ������");
		//this.num = num; �ٸ� ������ ȣ�⿹�� ���� �ּ�ó����
		this.name = name;
		this.tel = tel;
	} // �� �Ʒ� �����ڴ� ������ ������ ���� ������ ������ ������ �ٸ���. ������ �ٸ��� ����� �� �ִ�.
	public ConstractorTest(String name, String tel, int num) {
		this(num,name,tel);
	}
	public void prn() { //ct1, ct2, ct3�� ���� �ٸ� �ڷᰡ �ִµ� �̰� �����ؼ� ����ϰԲ� �����
		System.out.println("��ȣ = " + num);
		System.out.println("�̸� = " + name);
		System.out.println("����ó = " + tel);
		
	}
}
