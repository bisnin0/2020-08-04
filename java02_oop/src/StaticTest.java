import java.util.Calendar;

public class StaticTest {

	public static void main(String[] args) {
		BBB b = new BBB();
		System.out.println("b.num="+b.num); //b���ִ� num.. ������ ��ü�� �̿� ����

		//static Ű���尡 ��������� ǥ��ɰ�� ��ü�� �������� �ʰ� ������ �� �ִ�. (AAA.java������)
		System.out.println("AAA.num="+AAA.num);
		
		CCC c1 = new CCC();
		CCC c2 = new CCC();
		CCC c3 = new CCC();
		
		//static ������ ��ü�� ������ �� ��ü�� ���뺯���� ����Ѵ�.
//		c1.name = "�������"; 
		c3.print();
		
		//��ü�� 100������ ���� static�� �ϳ��� ���������.
		//��ü���� ���ε��� �����Ǿ�� �ϴ� �����ʹ� static�� ������� �ʴ´�.

		//static�� �޼ҵ忡 ǥ���ϴ°�� ��ü�������� �ʰ� �޼ҵ带 ȣ���Ҽ� �ִ�.
		CCC.print(); //"�������"�� ǥ�õǴ� ���� : ��ü�� ���� ���������� Ŭ�������� ���������ߴ��� �ٲﵥ���Ͱ� ��µǰ��ִ�.
					// static�� ��ü�� ������ ���� �ҷ��ð�� ���� �ٲ���� �ҷ�������.
		
		
		Math.random(); //�޼ҵ�
		Calendar.getInstance(); //�޼ҵ�
		
		
		BBB b2 = BBB.getInstance();
		System.out.println("b2.num="+b2.num);
	}

}
