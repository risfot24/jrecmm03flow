package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchCaseDemo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int avg =  0;
		
		do{	
			System.out.println("��� ������ �Է��ϼ���.");
		// System.out.println("�ٽ� ��� ������ �Է��ϼ��� : ");
			avg = scan.nextInt();	
        
		} while(avg > 100 || avg < 0);
			
			String result = "" ;    //= ""; //�������� �� 
            //�ʱ�ȭ�� ����������
			if(avg >=70){
				result = "�հ�";
			}else{
				result = "���հ�";
			}
			// ��������� ���� �� �������ϱ�
			char grade = 'F';
			/*
			if(avg>=90){grade='A';}
			else if(avg>=80){grade='B';}
			else if(avg>=70){grade='C';}
			else{grade='F';}
			*/
			//�� IF ELSE �� Switch �� �ٲٽÿ�
			switch(avg){  //avg/10
			case 100: case 90:grade = 'A';break;
			case 80:grade  = 'B';break;
			case 70:grade = 'C';break;
			case 60:grade = 'F'; break;
			default : break;
			}
			System.out.println("���ϴ� "+result+"�̸�, ����"+grade+"�Դϴ�.");
		
		
	
	}

}
