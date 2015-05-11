package cmm02.op;

import java.util.Scanner;

public class No02_IfElseDemo {
   
	int big;
	public void getBig(int a, int b, int c ){ //static  과 일반의 차이..
		if(a > b && a > c){
			System.out.println("가장 큰 수는 A값인 "+a+"입니다. ");
		}else if(b > a && b > c){
			System.out.println("가장 큰 수는 B값인 "+b+"입니다 . ");
		}else{
			System.out.println("가장 큰 수는 c값인 "+c+"입니다 . ");
		}
}
	
	
	public static void main(String[] args) {  //프로그램의 끝
		No02_IfElseDemo instance = new No02_IfElseDemo();
		  // static에서 객체 생성 왜 다시 해야하냐??
		  // static 의 하는 순간 다른 메소드이며 먼저 전치리 의 로딩 순서의 따라서 객체가 생성이 되느냐 ? 마느냐?
		  // static 이 먼저 메모리에 올라간다..
		String s = new String("sssss") ;
		String k = s.substring(0, 2);
		System.out.println(k);
		
		
		Scanner scan = new Scanner(System.in);
		                            
		                             //System(장치)  (in) 키보드
	                                 //System(장치) out 모니터	                               
	
		                            //System //어떤것을 객체화 시켯을까요?
		                            //실제로 존재하는 사물에 대해서        
		System.out.println("A 값을 입력하세요 .");
		int a = scan.nextInt();
		System.out.println("b 값을 입력하세요 . ");
		int b = scan.nextInt();
		System.out.println("C 값을 입력하세요 . ");
		int c = scan.nextInt();
		instance.getBig(a , b , c); 
		
		
		//메인이 터미네이터 
		//void 가 setter
		//리턴값 getter 
		

	}

}
