package javaAPI;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public StringTokenizerTest() {
		start();
	}
	public void start() {
		String msg = "�����,,,, ������, �����, ::::�ű�����;;;;, 3��";
		StringTokenizer st = new StringTokenizer(msg, ","); //import ������Ѵ�.
		//���б�ȣ�� �������� �Ѳ����� �־��ش�.
		// StringTokenizer st = new StringTokenizer(msg, ":,;");
		
		int cnt = st.countTokens();
		System.out.println("cnt="+cnt);
		//(mag, " ") �� ���ڿ��� �������� ��� �ܾ�(��ū)�� �ִ��� ���Ѵ�.
		//�ܾ� �Ѱ� �Ѱ��� ��ū�̴�.
		
		while(st.hasMoreTokens()) {//���� ��ū�� �ִ��� Ȯ��
			String token = st.nextToken();
			System.out.println("token="+token);
		}
	}
	//��ū �� ���ϱ�
	
	
	
	
	public static void main(String[] args) {
		new StringTokenizerTest();
	}

}
