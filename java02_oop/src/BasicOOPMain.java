import java.lang.String;  // import ���ص� ������ �׳� �ẽ
public class BasicOOPMain { //�������� ���� �ִ°� import ���ص� �ȴ�.

	public static void main(String[] args) {
		String name = new String();
		
		
		//��ü ����               �����ڴ� ��ü�����Ҷ� �� �ѹ� ���� : ��ü�� �ʱ�ȭ
		BasicOOP oop1 = new BasicOOP();
		BasicOOP oop2 = new BasicOOP();
		
		//��ü ���� �޼ҵ� ȣ���� : ��ü��.�޼ҵ��
		oop1.sum();
		
		String name2 = oop1.getName(); //BasicOOP�� �޼ҵ忡�� ���ϵ� �����޾Ƽ� ������ �ִ´�.
		System.out.println("name="+name2);
		
		//��ü���� ��������� �����͸� �����ų� �����ϱ�
		// ��ü��.������
		oop1.a = 2500;
		
		System.out.println("oop.a = "+ oop1.a);
		System.out.println("oop2.a = "+ oop2.a);
		
	}

}
