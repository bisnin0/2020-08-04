import java.util.Scanner;

public class MethodTest_2 {
	//int dan; //��������� �⺻ �ʱⰪ�� �ִ�. ���� = 0 �Ǽ� = 0.0 ���� = false char���� = ����.
			 //��� Ŭ���� ��ü�� �ʱⰪ�� null�̴�.
	//������� ����� ������ �����������ִ�.
	
			//���� ���⼭ �������� ������ �ؿ� scan�� �����ϰ�
	

	//���۷��� ���� : Ŭ������ ����
	Scanner s;
	String name;
	
	public MethodTest_2() {} //�Ű������� ���� �����ڴ� �⺻���� �������ִ°��� ����.
	
	
	//���Է� �޼ҵ�
/*	public void getDan() { //����������
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� = ");
		dan = scan.nextInt(); //���⿡ �Է� �޾Ƽ� �� �� dan�� �־��.
		
	}   
*/	
/*	//���Է� �޼ҵ�     test2������ �ּ�
	public int getDan() { //����������
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� = ");
		int dan = scan.nextInt(); //���⿡ �Է� �޾Ƽ� �� �� dan�� �־��.
		return dan; //return�� dan�� ������ �����ִ°� -> �� int�� ���� �Ʒ� 
	}   	
*/	
	public int getDan(String msg) { //����������
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+ " = ");
		int dan = scan.nextInt(); //���⿡ �Է� �޾Ƽ� �� �� dan�� �־��.
		return dan; //return�� dan�� ������ �����ִ°� -> �� int�� ���� �Ʒ� 
	} 
	
	//�Է¹��� ������ ������ ���
	public void danOutput(int dan) {
		for(int i=2; i<=9; i++) {
//			int result = dan * i;
//			System.out.println(dan+"*"+i+"="+result);
//����ϴ� �޼ҵ� �����ϸ鼭  �ű�
			calcurator(i, dan);//�޼ҵ� ȣ�� : ���� Ŭ������ �޼ҵ�� �׳� �޼ҵ������ ȣ��ȴ�.
			//�̰� ������ �Ʒ��� ����Ǵ°� ���⼭ i�� ���������⶧���� i�� �־��ش�.
		}
	}
	//����ϴ� �޼ҵ�
	public void calcurator(int i, int dan) { 
		int result = dan * i;
		System.out.println(dan+"*"+i+"="+result);		
	}
	public void startDan() { //���� �Է¹ް� �� �����ͷ� �������� ����ϴ� �޼ҵ带 �ϳ��� ���°�
//		getDan();
//		int dan = getDan();  test2������ �ּ�
		int dan = getDan("���Է�");		
		danOutput(dan);
	}
}
