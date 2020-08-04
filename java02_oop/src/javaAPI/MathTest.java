package javaAPI;

public class MathTest {

	public MathTest() {
	}

	public static void main(String[] args) {
		System.out.println("abs="+Math.abs(-9)); //���밪 ���ϴ� ���̶� 9������ �׳� 9.. -�� �־����
							//		����ġ
		
		// ceil() : �ø�  // ������ ū ��
		
		//floor() : ����  // ������ ����
	
		//round() : �ݿø�
		
		System.out.println("ceil="+Math.ceil(10.1)); //11�� ����.. �ø��̴ϱ� �Ǽ��� �־ Ȯ��
		System.out.println("ceil="+Math.ceil(-10.1)); //10�� ����..
		System.out.println("ceil="+Math.ceil(-10.9)); //10�� ����..
		
		
		System.out.println("floor="+Math.floor(10.1)); //10�� ���� .. �Ҽ� ���� ������ ������.
		
		System.out.println("round="+Math.round(10.4)); //10 �ݿø�
		System.out.println("round="+Math.round(10.7)); //11 �ݿø�
		
		///////////////
		int a=90, b=20;
		System.out.println("max="+Math.max(a, b));  //���߿� ū ���� ���ϴ°�.
		System.out.println("min="+Math.min(a, b));  //���߿� �������� ���ϴ°�
		
		
		// pow() : 7�� 9��(7�� 9�� ��)�� ���Ҷ� for���� ������ pow�� �� ����� ����.
		//   	      ���� 2���� �ְ� 7�� �տ� 9�� �ڿ�
		
		System.out.println("pow="+Math.pow(7, 9)); //����� �����ȴ�. 7�� 9�� �ʹ� Ŀ�� �����δ� ǥ���� �ȵǴ� ���̶� �̻��ϰ� ��µ�
												   //���⼭ ������ E�� ����. 4.0~E7�� 4.0~�� 7���̶�¸�
		int powInt = (int)Math.pow(7, 9); //�����̾ ���� �۰Գ����ϱ� ��Ʈ�� ����ȯ�ϸ� ����� ����
		System.out.println("pow="+Math.pow(7, 9)+"-->"+powInt); 
		
		System.out.println("pow="+Math.pow(7, 3)); //7�� 3��
		
		// sqrt() : ��Ʈ
		System.out.println("sqrt="+Math.sqrt(10)); //��Ʈ ���ϴ°�
		
		
	
	}

}
