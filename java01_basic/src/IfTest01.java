import java.util.Scanner;
class IfTest01
{
	public static void main(String[] args) 
	{
		// ����� �Է¹޾� 0���� Ŭ���� ����϶�.
			Scanner scan = new Scanner(System.in);
			System.out.print("�����Է�=");
			double inData = scan.nextDouble(); // �ܼ��� ���ڸ� �Է¹޾� �Ǽ��� �������ִ� �޼ҵ�
			
			if(inData>0){ //0���� inData�� Ŭ�� ����
				System.out.println("inData="+inData);

			}
			System.out.println("end......");
			


	}
}


/*
��� : if��
���ǽ� : true, false ����, ���, ���ͷ�
      ---------------
if(���ǽ�){ --> ���ǽ��� ���϶� ����
	���๮;
	���๮;
	....
}
      --------------- ������� �� ����
���๮; <-��ȣ�� ����⿡ if���� ���� ���ο� ������� ����Ǵ� ��ġ


if(a+b�� �߸��� ����. a>b�� ���ǽĿ� �ش�. true, false�� �ش��ؾ���. ����){}
if(false){}

*/