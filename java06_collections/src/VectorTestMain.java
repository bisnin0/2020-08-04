


import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTestMain {

	public VectorTestMain() {
		
	}
	
	public void start() {
		VectorTest vt = new VectorTest(); //�����Ͱ� �ִ� Ŭ������ ��ü�� ����
		Vector v = vt.getData(); // getData�� ȣ���ϸ� ���ϵȰ� ���� �� �ִ� ��ü�� �ʿ� v�� ����(Vector import�ʿ�)
		int num = (Integer)v.get(0); //500  ���� ���� data�� int�ϱ� int�� ������ ����ִ´�.
		////�� �ȿ� �ִ� �����͵��� object���� ���Ŵ�.
		////�̰� ��������� ���������ʹϱ� ������ ����ȯ �ؾ��Ѵ�. ���� ������ Ÿ������.
		double ave = (Double)v.get(1);  //80.5
		String name = (String)v.get(2); //ȫ�浿
		Calendar date = (Calendar)v.get(3); //2022,10,10
		Random ran = (Random)v.get(4);
		
		
		System.out.println("num="+num);
		System.out.println("ave="+ave);
		System.out.println("name="+name);
		System.out.println("date="+date);
		System.out.println(ran.nextInt());
		
		
		//���� �̹� ��ü�� �����Ǿ�����//MemverVo, VectorTest
		//�л�����
		Vector member = vt.getMember();  //MemberVo��ü�� 5���� ����ִ�.
		//VectorTest�� ���Ϲ��� v�� member�� �Ѱ��ִ°�. �����ʹ� ���� �ּҸ� �ٸ���.
		//size() : ������ ��ü���� ���Ѵ�.
		member.remove(3); //�̷��� �ϸ� 3��° �����Ͱ� ��������. 0,1,2,<3>,4
		for(int i=0; i<member.size(); i++) {
			MemberVo vo = (MemberVo)member.elementAt(i);
			vo.print();
		}
		
	}

	public static void main(String[] args) {
		new VectorTestMain().start();
	}

}
