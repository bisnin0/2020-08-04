
//����ó�� �ι�°���
public class ExceptionTest4 {
	int n1;
	int n2;
	
	public ExceptionTest4() {
//		plus();
//		minus();
//		multiple();
//		devide(); �ȵǴ� ������ �Ʒ� ���� int int �� �Ʒ� �����ڰ� ����ȴ�.
		
	}
	public ExceptionTest4(int n1, int n2) throws ArithmeticException, NumberFormatException{
		this.n1 = n1;
		this.n2 = n2;
		plus();
		
		
	}
	public void plus() throws ArithmeticException, NumberFormatException{
		System.out.println("n1+n2="+(n1+n2));
		minus();
	}
	public void minus() throws ArithmeticException, NumberFormatException{
		System.out.println("n1-n2="+(n1-n2));
		int data = Integer.valueOf("õ�̹�"); //���ھƴ� ���ڶ� ����->����ó��(integer) �ȵ�.
		multiple();
	}
	public void multiple() throws ArithmeticException{
		System.out.println("n1*n2="+(n1*n2));
		devide();
	}
	public void devide() throws ArithmeticException{  //���⼭ ������ �߻������� �̰� ����ϴ� �޼ҵ�->�޼ҵ�->�޼ҵ� ������ throws�� �� ����ϰ� ������ ���ο��� try catch 
		System.out.println("n1/n2="+(n1/n2));  //ArithmeticException
	}
	public static void main(String[] args) {
		try { //�츮�� ������ �̰� ���°� �����ϴ�. throws����.
			new ExceptionTest4(100,0); //int int�����ڰ� ����
		}catch(ArithmeticException e) {
			System.out.println("���ܰ� �߻� �Ͽ����ϴ�.");
		}catch(NumberFormatException n) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}
	}

}
