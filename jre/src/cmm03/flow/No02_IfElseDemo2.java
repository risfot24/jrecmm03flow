package cmm03.flow;

public class No02_IfElseDemo2 {

	public static void main(String[] args) {

		int kor = 90, eng = 85, sum = 0;
		double avg = 0.0;
		sum = kor + eng;
		String msg = "�޽���";
		avg = sum / 2;
		/*
		 * ���ǿ� ���� if ó�� ��� 100���� �� "���ʽ� ����"
		 */
		if (avg == 100) {
			msg = "���ʽ� ����";
			// System.out.println("�� ������ ������ ."); �ϵ� �ڵ�
		} else if (avg >= 70) {
			msg = "���� �հ�";
		} else {
			msg = "������� ������!";
		}

		System.out.println("���� : " + kor); // ctrl + ȭ��ǥ
		System.out.println("���� : " + eng);
		System.out.println("���� : " + sum);
		System.out.println(msg);
	 
	 

	}

}
