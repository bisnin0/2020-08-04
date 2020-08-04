import java.util.Arrays;
class ArraysTest 
{
	public static void main(String[] args) 
	{
		//Arrays : �迭���� Ŭ����
		//					2			6
		int data[] = {90,49,20,40,50,20,40,91,5};

//		Arrays.sort(data); //�迭�� ���� �����Ѵ�.

		Arrays.sort(data, 2, 6);//index�������� ���Ĺ����� �����Ѵ�. 6�ձ���. 40�� ���� �ȵ�
								//2���� 6�� index���� ����

		System.out.println(Arrays.toString(data));
	                         //toString�� �迭�� ���� ���ڿ��� �����.

		
		//�迭�� ����
		int dataCopy[] = Arrays.copyOfRange(data, 2, 6);
		System.out.println(Arrays.toString(dataCopy));

		String name[] = {"ȫ�浿","�̼���","�������","������","���"};
		Arrays.sort(name);
		String nameStr = Arrays.toString(name);
		System.out.println(nameStr);

		int data2[] = {90,49,20,40,50,20,40,91,5};
		int data3[] = data;
		boolean boo = Arrays.equals(data, data2);//�� ������ ��
		boolean boo2 = Arrays.equals(data, data3); // ��ü�� �ּҸ� ���Ͽ� ������ Ȯ�����ش�.
		System.out.println(boo);
		System.out.println(boo2);
		//data�� �ּҰ� �ٸ��⶧���� �迭 ���� ���ڰ� ������ false�� ���´�.
		//data�� �ٸ� data�� �־��ָ� �ּҵ� ���� ���簡 �Ǳ� ������ ���غ��� true�� ���´�.

		
	}
}
