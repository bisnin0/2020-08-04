//���ʸ� Ŭ����
public class GenericTest<V> { //���ʸ�
	private V name; //�Ʒ� ���� ����
	public GenericTest() {

	}
	
	
	public void setName(V name){
		this.name = name;
	}
	
	public V getName() {  //V�� �����ϴ°�. ������ String�������
		return name;
	}
		
		
}

//new GenericTest<String>()�ϸ� V�� String�� �ȴ�.
//new GenericTest<Calendar>() �ϸ� V�� Calendar�� �ȴ�.
//V�� �� �����Ŀ� ���� �޶���