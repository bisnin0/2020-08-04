import java.util.Scanner;

public class MethodTest {
	int dan; //��������� �⺻ �ʱⰪ�� �ִ�. ���� = 0 �Ǽ� = 0.0 ���� = false char���� = ����.
			 //��� Ŭ���� ��ü�� �ʱⰪ�� null�̴�.
	
	
	//���۷��� ���� : Ŭ������ ����
	Scanner s;
	String name;
	
	public MethodTest() {} //�Ű������� ���� �����ڴ� �⺻���� �������ִ°��� ����.
	
	
	//���Է� �޼ҵ�
	public void getDan() { //����������
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� = ");
		dan = scan.nextInt(); //���⿡ �Է� �޾Ƽ� �� �� dan�� �־��.
		
	}   
	
	
	//�Է¹��� ������ ������ ���
	public void danOutput() {
		for(int i=2; i<=9; i++) {
//			int result = dan * i;
//			System.out.println(dan+"*"+i+"="+result);
//����ϴ� �޼ҵ� �����ϸ鼭  �ű�
			calcurator(i);//�޼ҵ� ȣ�� : ���� Ŭ������ �޼ҵ�� �׳� �޼ҵ������ ȣ��ȴ�.
			//�̰� ������ �Ʒ��� ����Ǵ°� ���⼭ i�� ���������⶧���� i�� �־��ش�.
		}
	}
	//����ϴ� �޼ҵ�
	public void calcurator(int i) { 
		int result = dan * i;
		System.out.println(dan+"*"+i+"="+result);		
	}
	public void startDan() { //���� �Է¹ް� �� �����ͷ� �������� ����ϴ� �޼ҵ带 �ϳ��� ���°�
		getDan();
		danOutput();
	}
}
