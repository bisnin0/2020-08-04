

public class ExceptionTest2 {

	public ExceptionTest2() {
		try {
			int a=10;
			int b=20;
			String c="test";
//			String c="123"; //��������			
			int d = Integer.valueOf(c);  //����-------------c�� ����. ���ڸ� integer�� �ٲܼ�������.(���ڹ��ڰ� �ƴ϶� test��.) NumberFormatException
			
			int arr[] = {100, 200, 300};
			arr[3] = 500;  //--------------
//			arr[2] = 500;
			
			int e = a / 0; //----------------
			
		}catch(ArithmeticException a) {
			System.out.println("0���� ���� �� �����ϴ�...");
			
			
		}catch(Exception e){  //����Ŭ����. ��� ������ ���ܵ� e�� ���´�. �� Exception�� �׻� ������ catch������ ���;��Ѵ�.
			System.out.println(e.getMessage());
			
			
		}
	
	
	}

	public static void main(String[] args) {
		new ExceptionTest2();
	}

}
