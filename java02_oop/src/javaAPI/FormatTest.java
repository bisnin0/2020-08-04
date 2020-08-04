package javaAPI;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public FormatTest() {  //format = ǥ������  format�� �ٲ۴� = ǥ�������� �ٲ۴�.
		//ȭ����� ǥ��
		try { //����ó��. ���� �ȹ���
		int money = 5127428; //51,274,284��
		DecimalFormat fmt = new DecimalFormat("#,###��"); //3�ڸ����� �ϳ����̴ϱ� �������� �˾Ƽ� ���ش�.
		String moneyStr = fmt.format(money);  //���ڸ� ȭ������� ������ָ鼭 ���ڷ� �ٲ��.
		System.out.println("Money="+moneyStr);
		
		int money2 = 5127; //5,127��
		DecimalFormat fmt2 = new DecimalFormat("#,###,###��"); 
		String moneyStr2 = fmt2.format(money2);
		System.out.println("Money="+moneyStr2);
		
		int money3 = 5127428; //51,274,284��
		DecimalFormat fmt3 = new DecimalFormat("0,000,000��"); 
		String moneyStr3 = fmt.format(money3);
		System.out.println("Money="+moneyStr3);
		
		
		//ȭ����� ���ڸ� ���ڷ� ��ȯ
		NumberFormat fmt4 = NumberFormat.getNumberInstance();		
		Number num = fmt4.parse(moneyStr);
		
		int numInt = num.intValue();
		System.out.println("numInt="+numInt); //5127428
		
		}catch(Exception e) {} ////����ó�� ���� �ȹ���.try~catch
		
		
		//��¥�� �̿��� format
		Calendar now = Calendar.getInstance();
		SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss"); //API �����ϸ� �� �ǹ��ϴ��� ���´�.
		String dateStr = dateFmt.format(now.getTime());
		System.out.println("dateStr="+dateStr);
		
		
		
		
	}

	public static void main(String[] args) {
		new FormatTest();

	}

}
