
public class MethodTest2 {
	public MethodTest2(){}
	//1~100���� ���� ���ϴ� �޼ҵ�
	public void sum() {
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+= i;
			
		}
		System.out.println("1~100������ ����"+sum);
	}
	//1~������� ���� ���ϴ� �޼ҵ�
	public void total(int max) {
		int total=0;
		for(int i=1; i<=max; i++) {
			total+=i;
		}
		System.out.println("1~"+max+"������ ����"+total);
	}
	//1~������� ¦���� ���� ���ϴ� �޼ҵ�
	public void evenSum(int max) {
		int sum=0;
		for(int i=2; i<=max; i+=2) {
			sum+=i;
		}
		System.out.println("1~"+max+"������ ¦���� ����"+sum);
	}
	//1~������� Ȧ���� ���� ���ϴ� �޼ҵ�
	public void oddSum(int max) {
		int sum=0;
		for(int i=1; i<=max; i+=2) {
			sum+=i;
		}
		System.out.println("1~"+max+"������ Ȧ���� ����"+sum);
	}

	
	//
	public void getsum(int start, int max, int step) {
		int sum=0;
		for(int i=start; i<=max; i+=step) {
			sum+=i;
		}
		System.out.println("1~"+max+"������ ���� "+sum);
	} 
	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		//mt.sum();
		//mt.total(200);

//		mt.getsum(1, 100, 1); //1�� start�� 100�� max�� 1�� step����
//		mt.getsum(1, 100, 2);
		MethodTest_2 mt2 = new MethodTest_2(); 
		int max= mt2.getDan("����");	//test_2���� getDan�� �����ðŴ�.
		mt.getsum(1, max, 1); //1�� start�� 100�� max�� 1�� step����
		mt.getsum(1, max, 2);		
	}
}
