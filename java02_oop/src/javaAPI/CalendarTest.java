package javaAPI;
import java.util.Calendar;
class CalendarTest 
{
	public static void main(String[] args) 
	{
		//CalendarŬ������ ���� �ý��� ��¥, �ð��� ���õ� ��� ������ ó���� �� �ִ�.
		//Calendar�� ��ü�� (new) �� �������.
		Calendar now = Calendar.getInstance();
//		System.out.println(now); ����â�� ��� �ð������� �������� ǥ��
//      �̰ɷ� Ȯ���Ͽ� ���� ã�� �Է��Ѵ�.
//      ����ã������ API���� calendar�˻��ؼ� Ȯ��
		
		// ������ 2020-07-16(��) 03:48 PM
		int year = now.get(Calendar.YEAR);//�⵵
		int month = now.get(Calendar.MONTH)+1; //0->1��.. MONTH�� 0���� 1����ģ��.
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);//���� 0->�Ͽ��� 1->������
		int hour = now.get(Calendar.HOUR); //12�ð�����
		int minute = now.get(Calendar.MINUTE);
		int amPm = now.get(Calendar.AM);

		String monthStr = "";
		if(month<10){
			monthStr = "0"+month;
		}else{
			monthStr = month+""; //���ڿ� ���ڸ� ���̸� ����ȭ
		}

		
		String weekStr = "";
		switch(week){
			case 1: weekStr = "��";break;
			case 2: weekStr = "��";break;
			case 3: weekStr = "ȭ";break;
			case 4: weekStr = "��";break;
			case 5: weekStr = "��";break;
			case 6: weekStr = "��";break;
			case 7: weekStr = "��";break;
			}

		String amStr="";
		if(amPm==0){
			amStr = "����";
		}else{
			amStr = "����";
		}

		System.out.printf("������ %d-%s-%d(%s) %d:%d %s\n", year, monthStr, day, weekStr, hour, minute, amStr);




	}
}
