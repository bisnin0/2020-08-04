package javaAPI;

public class WrapperTest {

	public WrapperTest() {
		
	}
	
	public void start() {
		//Wrapper Ŭ����:�⺻���������� ���� ��ü�� ������ �� �ִ� Ŭ�������� ���Ѵ�.
		//Byte, Short, Integer, Long, Florat, Double, Boolean, Character
		
		int num = 15;
		// Integer numObj = new Integer(num); //15�� ��ü�� �����... �� �׾����� ���� ����� ���ϴ°�.(������ ��������������) �׷��� �Ʒ���
		Integer numObj = Integer.valueOf(num); // Int�� Integer�� �ٲ��. 
		System.out.println("numObj="+numObj);
		
		Integer numObj2 = Integer.valueOf("1234")+2000; //������ �ٲٴ¹���� Integer.valueOf("1234") ��°�.  ���ڸ� ���ڷ� �ٲٴ� �۾�.
		Integer numObj3 = Integer.parseInt("5555")+ 100;; // ���ڸ� ���ڷ� �ٲ㼭 numObj3�� �ִ� �۾�. ����ȭ�� ���ڸ� �����ϴ�. "����" 
		System.out.println("numObj2="+numObj2);
		System.out.println("numObj3="+numObj3);
		
		Double numDb1 = Double.valueOf("52.36") + 10;  //�Ǽ��� �ٲٴ� Warpper Ŭ���� 62.36
		System.out.println("numDb1="+numDb1);
		
												// JDK 1.5���� �������� �����ϴ�.
		Integer i =5; //�Ϲݵ�����Ÿ���� ��ü������ ������ �Ȱ�. autoboxing ����ڽ� : �⺻������Ÿ���� ��ü�� �ڵ����� �ٲ�°�
						//�ȵǸ� ������ �ٸ��Ŵϱ� Integer numObj = Integer.valueOf(num); �̷������� �־���� �Ѵٴ°�.
						// ���� Integer numObj3 = Integer.parseInt("5555") �̰� ���� ����.
						//���ڷ� �ٲٴ°� �Ȱ����� ������ ����
		
		int ii= i; //i�� Integer, ii�� Int = �����ڽ� : ��ü�� �⺻������������ �ڵ����� �ٲ�°�
		System.out.println(i+"=>"+ii);
	
		System.out.println("byte="+ numObj.BYTES); //4
		System.out.println("max+value="+Integer.MAX_VALUE);  //21��
		System.out.println("min_value="+Integer.MIN_VALUE);  //-21��
		System.out.println("size="+Integer.SIZE); //32
		
		System.out.println("hex="+Double.toHexString(235.3658)); //16���� .. a=0x1 16����
		
		System.out.println("intHex="+ Integer.toHexString(15));  //16���� f= 15
		System.out.println("intOct="+ Integer.toOctalString(15)); // 8���� 17�� 10������ 15��.
		
		
		
	}
	
	
	public static void main(String[] args) {
		new WrapperTest().start();
	}

} //http://tcpschool.com/java/java_api_wrapper
