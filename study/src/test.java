import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;

public class test {

	public test() {
	}
	
//	public int lotto(int num1, );


	
	public static void main(String[] args) {
		
		
		Random ran = new Random();	
		Vector<Integer> vector = new Vector<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		
		do{  //�� ����. �ߺ��˻�.			
		vector.clear();
		set1.clear();
		for(int i=0; i<7; i++) {
			vector.addElement(ran.nextInt(45)+1);
		}

		for(int i=0; i<7; i++) {
			set1.add(vector.elementAt(i));	
		}
		}while(set1.size()<7); 
		
		//Ʈ���¿� 6�� �ֱ�
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0; i<6; i++) {
		ts.add(vector.elementAt(i));
		}
				
		
		//��� 6�� + ���ʽ�1�� ���
		Iterator<Integer> result = ts.iterator();
		System.out.print("Lotto = ");
		while(result.hasNext()) {
			System.out.print(result.next()+" ");
		}
			
		System.out.print("bonus = " + vector.elementAt(6));
		
		
//		set1.add(vector.elementAt(0));
		
//		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(ran.nextInt(45)+1,ran.nextInt(45)+1,ran.nextInt(45)+1,ran.nextInt(45)+1,ran.nextInt(45)+1,ran.nextInt(45)+1,ran.nextInt(45)+1));//�ʱⰪ ����
//		do {
//		set.clear();
//		for(int i=0; i<7; i++) {
//		set.add(ran.nextInt(45)+1);
//		}					
//			
//		}while(set.size() < 7);
//		System.out.println(set1);

		

//		

//		
//		
//		
//		
//		
//			System.out.println();
//		
//			
//			
//			
//		for(int i=0; i<=5; i++) {
//		System.out.print(vector.elementAt(i)+" ");
//		}
//		System.out.print("bonus = " + vector.elementAt(6));
		
		

			
		
		
	
	}
//	public Vector lottoCheck(int i) {//i�� ���޹޴´�. i�� 4���
//		for(int j=0; j<i; j++) {               //j��0~3
//			if(vector.addElement(j) ==  vector.addElement(i)) {
//				return --i; //�ϸ� �Ǵµ� �̰� ������ ������Ѵ�.
//			}
//		}
//		return i; //�Ȱ������� ������ �ϳ� �ٿ��� i�� �������ְ� �ƴϸ� �׳� i�� �������ش�.
//	}

}
