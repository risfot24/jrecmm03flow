package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchCaseDemo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int avg =  0;
		
		do{	
			System.out.println("평균 점수를 입력하세요.");
		// System.out.println("다시 평균 점수를 입력하세요 : ");
			avg = scan.nextInt();	
        
		} while(avg > 100 || avg < 0);
			
			String result = "" ;    //= ""; //지역변수 에 
            //초기화를 하지않으면
			if(avg >=70){
				result = "합격";
			}else{
				result = "불합격";
			}
			// 평균점수에 따라서 비교 학점구하기
			char grade = 'F';
			/*
			if(avg>=90){grade='A';}
			else if(avg>=80){grade='B';}
			else if(avg>=70){grade='C';}
			else{grade='F';}
			*/
			//위 IF ELSE 를 Switch 로 바꾸시오
			switch(avg){  //avg/10
			case 100: case 90:grade = 'A';break;
			case 80:grade  = 'B';break;
			case 70:grade = 'C';break;
			case 60:grade = 'F'; break;
			default : break;
			}
			System.out.println("귀하는 "+result+"이며, 학점"+grade+"입니다.");
		
		
	
	}

}
