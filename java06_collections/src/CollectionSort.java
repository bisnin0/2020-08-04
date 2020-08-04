import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CollectionSort {
	Random ran = new Random();
	public CollectionSort() {
	}

	//treeset�� ���ϰ� ���⿡ �ϴ� ������ �ߺ� �����͸� �츮�� ���ؼ�. treeset�� �ߺ������͸� �볳���� ������ list.sort�� ����Ѵ�. 1, 2, 3, 3, 3 ,4, 5
	//List ����
	public void listSort() {
		List<Integer> lst = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			lst.add(ran.nextInt(100)+1);
			
		}
		System.out.println("������="+lst.toString());
		//����
		Collections.sort(lst); //���� ��������
		System.out.println("������="+lst.toString());
		
		//���� �������� reverse() .. �ݴ�� �����°Ŷ� �������� ���� �� ����ؾ��Ѵ�.
		
		Collections.reverse(lst); //��������
		System.out.println("������="+lst.toString());
		
		
		/////////////////////////////////////////////////////
		String names[] = {"�ڽ���","���","ƫ��","���ƽŽ�","���","������","�عٶ��"};
		List<String> lst2 = new ArrayList<String>();
		for(String name:names) {
			lst2.add(name);
		}
		System.out.println("������="+lst2.toString()); //lst2�� ���ڿ� �������ش�. toString()
		
		Collections.sort(lst2);
		System.out.println("������="+lst2.toString()); //��������
		
		Collections.reverse(lst2);
		System.out.println("������="+lst2.toString());//�ݴ��. ��������
		
		
	}
	
	//�÷��ǿ� ��ü�� ������ �Ϻθ� �����ͷ� ������ ���
	public void objectSort() {
		List<MemberVo> lst = new ArrayList<MemberVo>();
		
		
		
		//lst �ȿ� vo�����Ͱ� 5��. vo������ �ȿ��� ���� �̸� ��ȭ��ȣ �̸���
		lst.add(new MemberVo(50, "ȫ�浹", "010-7899-2121", "abcd@nate.com")); 
		lst.add(new MemberVo(10, "������", "010-9999-4444", "great@naver.com"));
		lst.add(new MemberVo(30, "�������", "010-1212-1212", "best1234@hanmail.net"));
		lst.add(new MemberVo(25, "�̼���", "010-7412-1111", "asdf@nate.com"));
		lst.add(new MemberVo(40, "���", "101-222-5555", "hhhhh@naver.com"));		
		
		
		////��ȣ�� ������������ ����   == �Ʒ� ����Ŭ������ ����
		System.out.println("===================��ȣ�� ������������ ����===================");
		Collections.sort(lst, new CompareNumAsc());
		for(MemberVo vo : lst) {
			vo.print();
		}
		
		////��ȣ�� ������������ ���� == �Ʒ� ����Ŭ������ ����
		System.out.println("===================��ȣ�� ������������ ����===================");
		Collections.sort(lst, new CompareNumDesc());
		for(MemberVo vo : lst) {
			vo.print();
		}
		
		////�̸��� ������������ ����  ==  �Ʒ� ����Ŭ������ ����
		System.out.println("===================�̸��� ������������ ����===================");
		Collections.sort(lst, new CompareNameAsc());
//		for(MemberVo vo : lst ) {
//			vo.print();
		output(lst);  //��� �ݺ��Ǵϱ� �Ʒ� �޼ҵ� ����� �����°�.
		
		
	
		////�̸��� ������������ ����  == �Ʒ� ���� Ŭ������ ����
		System.out.println("===================�̸��� ��ħ�������� ����===================");
		Collections.sort(lst, new CompareNameDesc());
		output(lst);
		}
		public void output(List<MemberVo> lst) {
			for(MemberVo vo : lst) {
				vo.print();
			}
		
	}
	
	//���ı����� comparator interface�� ��ӹ��� �� compare() �޼ҵ带 �������̵� �Ͽ� ���� �������� �����Ѵ�.
	// ===================
	//�̸��� ������������ �����ϴ� Ŭ����    //StringCompareTo �κ� ���� ���� ������  ���� ��� ���� 0
	class CompareNameAsc implements Comparator<MemberVo>{
		public int compare(MemberVo v1, MemberVo v2) {
			return v1.getName().compareTo(v2.getName());//���, ����, 0
		}
	}
	
	// ===================
	//�̸��� ������������ �����ϴ� Ŭ����
	class CompareNameDesc implements Comparator<MemberVo>{
		public int compare(MemberVo v1, MemberVo v2) {
			return v2.getName().compareTo(v1.getName()); //�¿� ���� �ٲ۴�.
		}
	}	
	
	
	// ===================
	//��ȣ�� ������������ �����ϴ� ���� Ŭ������ �����
	class CompareNumAsc implements Comparator<MemberVo>{
		public int compare(MemberVo v1, MemberVo v2) { //�������̵�
			//v1�� ������ -1�� ����, v2�� ������ 1�� ����, v1�� v2�� ���� ������ 0�� �����Ѵ�.
//			int r = (v1.getNum()  <  v2.getNum())? -1 : (v1.getNum() > v2.getNum())? 1 : 0;   //v1�� ��ȣ�� �˷��� MemberVoŬ������ getNum()�� �̿��ؾ��Ѵ�. num�� private�� �ٷ� ������.
//			return r;
			
			return (v1.getNum()  <  v2.getNum())? -1 : (v1.getNum() > v2.getNum())? 1 : 0;   
						
		} 
	}
	
	// ===================
	//====================
	//��ȣ�� ������������ �����ϴ� ���� Ŭ������ �����
	class CompareNumDesc implements Comparator<MemberVo>{
		public int compare(MemberVo v1, MemberVo v2) {
			//v1�� ������ 1�� ����, v2�� ������ -1�� ����, v1�� v2�� ���� ������ 0�� �����Ѵ�.
			return (v1.getNum() < v2.getNum())? 1 : (v1.getNum() > v2.getNum())? -1: 0;
		}
	}
	//=========================
	
	
	
	
	
	public void start() {
		listSort();
		System.out.println("===============================================================");
		objectSort();
	}
	
	public static void main(String[] args) {
		CollectionSort cs = new CollectionSort();
		cs.start();
	}

}
