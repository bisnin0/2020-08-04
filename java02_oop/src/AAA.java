
public class AAA {
	static int num = 100;
}//class

class BBB{
	int num = 200;
	BBB(){}  //�ڱ��ڽ��� Ŭ������ ��ü�� ���� �������ִ°�
	static BBB getInstance() { //���� BBB�� �����϶�¶�
		return new BBB();
	}
}//class

class CCC{
	static int num = 300;
	static String name = "ȫ�浿";
	static String addr ="����� ������";
	
	
	//��� �����
	static final int MAX = 100; //�빮�ڷ� �� �������� ����� ����ڴٴ� ���
	static final int MIN = 1; //����� �ȰŴ�.(�빮�ڷ� �Ⱦֵ��� �츮�� ��븸 �� ������ �ٸ������� ���ٲ۴�.)
	
	CCC(){}
	static void print() {  //public�� �ǹ̾�� ����
		System.out.println("��ȣ="+num);
		System.out.println("�̸�="+name);
		System.out.println("�ּ�="+addr);
		//final ������ ���� �����Ұ�
		// MAX = 200;
		System.out.println("MIN="+MIN+", MAX="+MAX);
		
	}
}//class
