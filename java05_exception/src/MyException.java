

public class MyException extends Exception{

	public MyException() {
		super("1~100������ ���� �Է��ϼ���..");//����Ŭ������ �ִ� ������super.. �Ű����� ���� ������ ȣ��super();
		
	}
	public MyException(String msg) {  //�ܺο��� msg�� �޾Ƽ� Exception���� ȣ��
		super(msg);
		
	}

}
