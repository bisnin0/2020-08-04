//package p1.p2.p3; ��Ű���� ��Ű�� ���̴� .���� 
import java.lang.String;
import java.util.Scanner;
import java.io.*; //�ڹ� ��Ű�� �ȿ� io��� ��Ű���� �ְ�, �� �ȿ� Ŭ���� ��ü

public class BasicOOP {
	//��������(�������) Ŭ���� �ȿ� �����ؾ���
	int a=1234; //0
	String name; //null

	//������ �޼ҵ�: ��ü�� �����Ҷ� �ѹ� �����Ѵ�.
	//			 �޼ҵ���� �ݵ�� Ŭ������� ���ƾ� �Ѵ�.
	//������ �޼ҵ�� ��ȯ���� ����. void�� XX	
	public BasicOOP() { //���� BasicOOP�� ���ƾ� �Ѵٴ°�. ������ ���� �� �ִ�.
	
		System.out.println("������="+a);		
	}
	public BasicOOP(int a) {
		
	}
	//�޼ҵ� ��ȯ��
	//	     �޼ҵ�� �ҹ��ڷ� �����Ѵ�. �ռ����� ��� �ι�° �ܾ���� ù ���ڴ� �빮�ڷ�.. 
	//	     ���� ��뵵 ���������� ù��° ���ڴ� ���� �ҹ��ڿ��� �Ѵ�.
	public void sum() {
		//��ɱ���
		int s=0;
		for(int i=1; i<10; i++) {
			s += i;
		}
		System.out.println("s="+s);
		System.out.println("sum->a="+a);		
	}
	public void add(int a, int b) {  
		int c = a + b;
		System.out.println("c="+c);
		class BBB{
			//�޼ҵ� ���� ����Ŭ����	
		}
	}
	public String getName() {
		return "ȫ�浿"; //getName�� ��ȯ���� String�̴�. getName�� ȣ���ϸ� String "ȫ�浿"�� ���ƿ´�. 
	}
	
	class AAAA{ //class ���� �� class�� �����. ����Ŭ����
		
	}
}//class
