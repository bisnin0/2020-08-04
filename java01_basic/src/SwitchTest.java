class SwitchTest
{
	public static void main(String[] args) 
	{
		//
		int data = 5;
		//data ���� 1:����, 2:���, 3:�Ķ�, 4:����, 5or6:�ϴû�, ������:���
		String color; // null(�������� ���� ������) ""�ʹ� �ٸ���. �̰� ���鹮�ڰ� �ִ°�
		switch(data){
			case 1:
				color="����";
				break;
			case 2:
				color="���";
				break;
			case 3:
				color="�Ķ�";
				break;
			case 4:
				color="����";
				break;
			case 5:
			case 6:
				color="�ϴû�";
				break;
			default:
				color="���";
			
		}//switch���� �����°�
		System.out.println(color);

		


	}
}


/*
������ �������� ���� ���ǹ�

�⺻������ Ÿ���� int�� ���� ���� Ÿ��(byte, short, int)
			 char, String:���ڿ�
a+b   a/3   50   'A'   "ȫ�浿" 


switch(����, ���){

	case ���: ���๮;
			  ���๮;
			  [break;]//�ʿ������ ���� ����
	
	case ���: ���๮;
			  ���๮;
			  [break;]
	[default: ���๮;
			 ���๮;]


}


*/