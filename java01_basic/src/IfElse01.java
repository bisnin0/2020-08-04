import java.util.Scanner;
class IfElse01
{
	public static void main(String[] args) 
	{
		// ������ �Է¹޾� ����϶��� ����� 100�� ���Ͽ� ����ϰ�
		// �����϶��� �Է¹��� ���� ����� �����Ѵ��� 200�� ���Ͽ� ����϶�
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է�=");
		int inData = scan.nextInt();
		

		int result = 0;
		if(inData<0){
			result = -inData*200;  //���׿����� - Ȯ��
			//int result = -inData*200;
			//if�� �ȿ��� ����� result�� if�� �ȿ����� ��밡���ϴ�.
			//��Ȳ���� �ٸ����� �ܺο��� �����ϰ� �����°� ����� ����ϱ� ����.
			
		}else{//0, +
			result = inData*100;
						
		}
			System.out.print("result="+result);


		// result�� if���� ���� ����⶧���� ���⼭���ʹ� ������.
		// result�� ����Ϸ��� if�� ���� �����ؾ��Ѵ�.
/*
		int result=0;
		if(inData<0){
			int a=1234;
			result = -inData*200;  //���׿����� - Ȯ��
			System.out.print("result="+result);
			//if�� �ȿ��� ����� result�� if�� �ȿ����� ��밡���ϴ�.
			
		}else{//0, +
			int a=5678;
			//if���� else���� ���� �ٸ��⶧���� int a�� �ι� �����ص� ���� �ȳ���.
			
		}
		int result = 1234;
		//���� �� ���� �̹� result�� ����Ǿ��⶧���� ������ �߻��Ѵ�.
*/
	}
}


/*
if(���ǽ�){

	��

	���ο� if���� �� �� �� �ִ�.
	}
	else{

	����

		}
	}
*/

/*
if(���ǽ�){ //���϶�
���๮;
....
}else{// �����϶�
���๮;
....
}

*/