package javaAPI;

public class StringTest {
	public StringTest() { //�Ʒ� new StringTest(); ���� ����Ǵ� ������ �޼ҵ�
		start(); // �ؿ� start����
	}  //�����ڸ޼ҵ�
	public void start() { //�׳� �޼ҵ�
		//String�� ���ڿ��� ���õ� ���
		String name;
		String name2 = new String();
		String name3 = new String("ȫ�浿");
		String name4 = new String("ȫ�浿");
		
		if(name3 == name4){
			System.out.println("name3�� name4�� ����.");
		}else{
			System.out.println("name3�� name4�� �ٸ���.");
						
		} // ��ü�� ==�� ������ Ȯ�� �Ҷ� ����Ǿ��ִ� �ּҰ� �ٸ��⶧���� ������ �ٸ��ٰ��´�/ 
		
		//��ü�� ������ Ȯ���ϱ� ���ؼ��� ==�� �ƴ϶� uquals()��� �޼ҵ带 ����ؾ��Ѵ�.
		if(name3.equals(name4)) { //name3�� ���Ұ�ü name4 
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		
		char c[] = {'J', 'A', 'B', 'A'};
		//�̰� �Ѱ��� ���ڿ��� �������
		String cStr = new String(c); // cStr�� �ϳ��� ���ڿ��̴�.
		System.out.println("cStr="+cStr);
		
		String valueStr = String.valueOf(c); //�̷��Ե� �ȴ�.
		System.out.println("valueStr="+valueStr);
		
		int num = 1234;
		String numStr=String.valueOf(num);
		System.out.println("numStr="+numStr+100); //+100�� ����Ǿ� ������ ���ڿ��̶���
		
		String numStr2 = num+""; //�̷����ص� ����ȭ�� ������
		System.out.println("numStr2="+numStr2+100);//�̷��� �ϴ°� �ٶ����ϴ�.
		
		//���� �̸��� �������ִ� �޼ҵ尡 �������ΰ� : *�����ε�*�� �޼ҵ� ex)valueof�޼ҵ�
		//�ڹٰ���ӽ��� �̸� �Ȱ����� ��� �ε� �ؾ� �ϴϱ�
		
		
		//			   0123456789012345678901234 index
		String data = "Java Programing Test.....";
		char at = data.charAt(5); //5��° index P�� at�� 
		System.out.println("charAt="+ at);
		
		
		//���ڿ��� ����Ʈ �迭�� �����Ͽ� �������ش�. data(java Pro....)�� ������ �����
		byte dataArr[] = data.getBytes();
		for(int i=0; i<dataArr.length; i++) {
			System.out.println("dataArr["+i+"]="+dataArr[i]);
		}
		
		
		
		//Ư�� ������ index ��ġ�� ���ϴ°�. �տ�������
		int idx = data.indexOf("g");
		System.out.println("indexOf="+idx);
		
		int idxLast = data.lastIndexOf("g"); //�ڿ�������
		System.out.println("lastIndexOf="+idxLast);
			
		//���ڼ�
		int size = data.length();
		System.out.println("length="+size);
		
		
//		//			   0123456789012345678901234 index
//		String data = "Java Programing Test.....";
		data = data.replaceAll("Java", "�ڹ�"); //Ư���� ���ڸ� �ٸ����ڷ� �ٲ��ش�. ��ҹ��� �Ȱ��� �ؾ��� �տ��� ��������, �ڴ� �ٲܹ���
		System.out.println("replaceAll="+data); // replaceAll�� �ٲٸ� ���ķ� data�� ���ڴ� "�ڹ� Programing Test....."�� ����ȴ�.
		
		String tel = "010-1234--5678";
		String telSplit[] = tel.split("-"); // ("")���� ���ڸ� �������� �ɰ���. -�� �������� �ϴ� --���� ����ִ°͵� ��������. 
		for(int i=0; i<telSplit.length; i++) {
			System.out.println("telSplit["+i+"]="+telSplit[i]);
		}
			
		//				012345678901234
		String email = "abcdef@nate.com"; //���̵� ���ϰ�ʹٸ� @��ġ�� ���� ���Ѵ�.
		int atMark = email.indexOf("@");// 6�� ��������.
		//							   index 6 ���ڸ����� ���Ѵ�.
		String id = email.substring(0, atMark);
		System.out.println("id="+id);
		
		String domain = email.substring(atMark+1); //@�������� ������ ���Ҷ��� ������ġ�� �����ָ� �ȴ�. @�����̴� +1
		System.out.println("domain="+domain);
		
		//toLowerCase() : �ҹ��ڷ� ����
		//toUpperCase() : �빮�ڷ� ����
		String lower = data.toLowerCase();
		String upper = data.toUpperCase();
		System.out.println("toLowerCase="+lower);
		System.out.println("toUppwerCase="+upper);
		
		//
		String data2 = "      Java Spring Mybatis      "; //trim�� ���� �� �ڷ� �ִ� ������ �������ش�.
		String trim = data2.trim();
		System.out.println("trim="+trim+"------");
		
		
		//equals() : ��ҹ��� �����Ͽ� ������ ����� true, false�� �������ش�.
		//equalsIgnoreCase():��ҹ��ڸ� �������� �ʰ� ������ ����� ���Ѵ�.
		
		String d1 = "Test Program";
		String d2 = "test program";
		if(d1.equals(d2)) {
			System.out.println("equals()=>d1�� d2�� ���� ���ڿ� �Դϴ�.");
		}else {
			System.out.println("equals()=d1�� d2�� �ٸ� ���ڿ��Դϴ�.");
		}
		
		if(d1.equalsIgnoreCase(d2)) {
			System.out.println("equalsIgnoreCase()->d1�� d2�� ���� ���ڿ��Դϴ�.");
		}else {
			System.out.println("equalsIgnoreCase()=>d1�� 2d�� �ٸ� ���ڿ��Դϴ�.");
		}
		
	}

	public static void main(String[] args) { //���θ޼ҵ�
		new StringTest(); //StringTest(); �� �Ȱ��� �����ڰ� ���� ������ 4��
				
		
		
	}

}
