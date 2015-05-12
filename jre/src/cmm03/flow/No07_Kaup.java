package cmm03.flow;

import java.util.Scanner;
 
public class No07_Kaup {
	double height; // 멤버 변수 가 private 화 시킨것을 은닉화
	double weight;
	double idx;
	Scanner scan = new Scanner(System.in);

	/*
	 * No07_kaup() { this(0.0);
	 * }
	 */
	No07_Kaup(double i, double j) { // 생성자 오버로딩
		this.height = i; // 다른 지역 파라미터로 온 변수를 멤버 변수로 온다..
		//setHeight(i),setweight(j)
		this.weight = j; // 생성자 호출 과 동시에 값을 입력하게 하기위해서.. //제약을 두기 위해서
		this.idx = (int)weight /( (height * height))*10000;
	}

	public double getHeight() {
		return height;
	}
    /*
	public void setHeight(double height) {
	//	System.out.println("키를 입력하세요 ");
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
		String msg = ""; //nullpointerexception 나올수가 있다.//은닉화
		if(idx>30){msg = "비만";}
		else if(idx>24){msg = "과체중";}
		else if(idx>20){msg = "정상";}
		else if(idx>15){msg = "저체중";}
		else if(idx>13){msg = "마름";}
		else if(idx>30){msg = "영양실조";}
		else{ msg = "소모증" ;}
		return msg;  
	}

	@Override
	public String toString() {
		return "[height=" + height + ", weight=" + weight + ", idx= " + idx + getMsg();
	}

	public static void main(String[] args) {
		//double i =0 , j = 0 ; 해놓고 해도 된다.. 디폴트 생성자 하나만 생성 하고 , 오버로딩된 생성자 없어도됨..
		
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력하세요 ");
		double height = scan.nextDouble();
		System.out.println("몸무게를 입력하세요. ");
		double weight = scan.nextDouble();
		
		No07_Kaup kap = new No07_Kaup(height, weight);
		//No07_Kaup kap = new No07_Kaup();
		//kap.getMsg();
		//System.out.println(kap.getMsg());
		System.out.println(kap.toString());
		
		
		System.out.println("완료");

	}
	
	
	
	
}


