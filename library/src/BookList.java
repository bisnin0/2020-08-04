import java.util.HashMap;
import java.util.Hashtable;

public class BookList {
	
	public BookList() {
		
	}

	public static HashMap<String, BookListVO> setBook(){
		HashMap<String, BookListVO> hm = new HashMap<String, BookListVO>();
		hm.put("�츮 ��ȭ �̾߱�", new BookListVO(101, "�츮 ��ȭ �̾߱�", "������", 2002, "����", "��ġ��"));
		hm.put("��ſ� �ѱ���", new BookListVO(105, "��ſ� �ѱ���", "���ϸ�", 2001, "����", "��ġ��"));
		hm.put("�������Ű� �ȵ�����", new BookListVO(210, "�������Ű� �ȵ�����", "��ȸ", 2002, "����", "��ġ��"));
		hm.put("�ѱ����빮�л�", new BookListVO(250, "�ѱ����빮�л�", "������", 2005, "����", "��ġ��"));
		hm.put("�������� �� �ҽ�", new BookListVO(331, "�������� �� �ҽ�", "�����", 2012, "����", "�뿩��"));
		hm.put("�̼����� ���� ���� ���ؿ� Ȱ��", new BookListVO(375, "�̼����� ���� ���� ���ؿ� Ȱ��", "��ó�� ��Ʈ", 2014, "����", "��ġ��"));
		hm.put("�ѱ������", new BookListVO(455, "�ѱ������", "���л�", 2004, "���", "�뿩��"));
		hm.put("���� ���� ���� �̷¼�", new BookListVO(489, "���� ���� ���� �̷¼�", "��ν�", 2008, "���", "��ġ��"));
		hm.put("��������", new BookListVO(522, "��������", "�ּ���", 2002, "����", "��ġ��"));
		hm.put("�ΰ��� ���б���� ����", new BookListVO(590, "�ΰ��� ���б���� ����", "�ڴ�ö", 2016, "����", "�뿩��"));
		hm.put("���̻��а� Ż���̻���", new BookListVO(652, "���̻��а� Ż���̻���", "�Ž�ȯ", 2018, "ö��", "��ġ��"));
		hm.put("�츮�� ���̴�", new BookListVO(673, "�츮�� ���̴�", "���׸� ������", 1998, "ö��", "��ġ��"));
		return hm;
	}

}
