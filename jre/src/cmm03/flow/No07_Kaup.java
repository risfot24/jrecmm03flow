package cmm03.flow;

import java.util.Scanner;
 
public class No07_Kaup {
	double height; // ��� ���� �� private ȭ ��Ų���� ����ȭ
	double weight;
	double idx;
	Scanner scan = new Scanner(System.in);

	/*
	 * No07_kaup() { this(0.0);
	 * }
	 */
	No07_Kaup(double i, double j) { // ������ �����ε�
		this.height = i; // �ٸ� ���� �Ķ���ͷ� �� ������ ��� ������ �´�..
		//setHeight(i),setweight(j)
		this.weight = j; // ������ ȣ�� �� ���ÿ� ���� �Է��ϰ� �ϱ����ؼ�.. //������ �α� ���ؼ�
		this.idx = (int)weight /( (height * height))*10000;
	}

	public double getHeight() {
		return height;
	}
    /*
	public void setHeight(double height) {
	//	System.out.println("Ű�� �Է��ϼ��� ");
		this.height = scan.nextDouble();
	}
   */
	public double getWeight() {
		return weight;
	}
/*
	public void setWeight(double weight) {
		this.weight = scan.nextDouble();
	}
*/
	String getMsg() {
		String msg = ""; //nullpointerexception ���ü��� �ִ�.//����ȭ
		if(idx>30){msg = "��";}
		else if(idx>24){msg = "��ü��";}
		else if(idx>20){msg = "����";}
		else if(idx>15){msg = "��ü��";}
		else if(idx>13){msg = "����";}
		else if(idx>30){msg = "�������";}
		else{ msg = "�Ҹ���" ;}
		return msg;  
	}

	@Override
	public String toString() {
		return "[height=" + height + ", weight=" + weight + ", idx= " + idx + getMsg();
	}

	public static void main(String[] args) {
		//double i =0 , j = 0 ; �س��� �ص� �ȴ�.. ����Ʈ ������ �ϳ��� ���� �ϰ� , �����ε��� ������ �����..
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ��� ");
		double height = scan.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���. ");
		double weight = scan.nextDouble();
		
		No07_Kaup kap = new No07_Kaup(height, weight);
		//No07_Kaup kap = new No07_Kaup();
		//kap.getMsg();
		//System.out.println(kap.getMsg());
		System.out.println(kap.toString());
		
		
		System.out.println("�Ϸ�");

	}
	
	
	
	
}


