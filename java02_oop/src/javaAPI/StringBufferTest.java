package javaAPI;

public class StringBufferTest {
	public StringBufferTest() { //�����ڸ޼ҵ�
		//�����ڸ޼ҵ�� ��ü�����Ҷ� ����ȴ�. ��ü�ȸ���� ����ȵ�
		//���ڿ��� ó��, �����ͼ����Ǵ��� �ּҸ� �ű��� �ʴ´�.
		//StringBufferŬ����
		//StringBuilderŬ����
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(50);
		StringBuffer sb3 = new StringBuffer("�ڹ�");
		//�޸� ũ�⸦ ���ϴ� �޼ҵ��.
		
		
		StringBuffer sb4 = new StringBuffer();
		
		sb4.append("StringBuffer"); //���ڿ� �߰�
		sb4.append("��ü �׽�Ʈ ���Դϴ�.");  
		//���ڿ� ���� ���ϱ�
		System.out.println("length="+sb4.length()); //���� �� = "StringBuffer(12) + ��ü �׽�Ʈ ���Դϴ�.(12  ����� ������)"
		
		
		//���ڿ� ���� : index��ġ�� ���ڿ� ����
		sb4.insert(8, "�������̽�");
		System.out.println("sb="+sb4);
		//012345678 90
		//StringBu�������̽�ffer��ü �׽�Ʈ ���Դϴ�.
		sb4.delete(3, 7);
		System.out.println("sb4="+ sb4);
		//Stru�������̽�ffer��ü �׽�Ʈ ���Դϴ�.
		//0127890 (3���� 7�ձ��� ����)
		
		sb4.reverse();//���ڿ� �յ� �ٲٱ�
		System.out.println("sb4="+sb4); //���ڿ��� ��������.
		
		String str = "test replace";
		StringBuffer st4 = new StringBuffer("test replace");
		
		str =str.replaceAll("test", "�׽�Ʈ");
		//String�� �����Ͱ� ����Ǹ� �ٽ� �������־�� �Ѵ�.
		//str.replaceAll("test", "�׽�Ʈ"); �̷��� ���� ������� �ʴ´�.
		st4.replace(0, 4, "�׽�Ʈ");
		
		System.out.println("str = " + str);
		System.out.println("st4 = " + st4);
		
		
		System.out.println("capacity = "+sb.capacity()+","+sb2.capacity()+","+sb3.capacity()+","+sb4.capacity());
		//capacity = 16(sb), 50(sb2), 18(sb3) (�⺻ 16����Ʈ�� Ȯ���� �س�ٴ� ��. 16���ڸ� ������ �� �ִ� ������ Ȯ���Ǿ��ִ�.)
		//sb2�� ���Ӱ������� 50���ڰ� ���ִ� ������ Ȯ���Ѵ�.
		//sb3�� 2���� + 16 �ؼ� 18����Ʈ.
		//sb4�� 34�� ���´�. ���� ���� �ƴ϶� Ȯ���� ����Ʈ ���ڰ� 34��¶�.		
		
		
	}
	
	public static void main(String[] args) {
		new StringBufferTest(); //��ü����. ���� �����ڸ޼ҵ带 ����
	}

}
