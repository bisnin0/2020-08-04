class Array3 
{
	public static void main(String[] args) 
	{
		System.out.println(args);
		//args : arguments - �Ű�����, �Ķ���� (args :�׳� ���� �̸�)
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);

	
// ���̵� admin�̰� ��й�ȣ 1234 �ƴϸ� ���� �ȵǰ� ����¹�
//	
		
		//id:admin, password:1234
//	 XXXif(args[0]=="admin"){ // ==�񱳿����ڴ� �⺻������ Ÿ���� ���Ҷ� ���. Ŭ������ �񱳸� ����� ���Ѵ�.
		if("admin".equals(args[0]) && "1234".equals(args[1])){ 
			//admin�� args[0]�� ���ؼ� ������ true �ٸ��� false
			//������ �ٲ㼭 args[0].equals("admin") && args[1].equals("1234")�ص� ������
			int sum = 0;
			for(int i=1; i<=100; i++){
				sum += i;
			}
			System.out.println("1~100����������"+sum);

		}else{//�α��� ���н� �����ϴ� ���๮
			System.out.println("���̵�� ��й�ȣ�� �߸� �Է��Ͽ����ϴ�.");
		}
			
	
	}
}
 