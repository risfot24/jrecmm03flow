package cmm02.op;

public class No2_DanHangDemo2 {
 
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		            //연산의 우선순위를 부여하는것이다...
		
		//후위형은 변수값을 읽어온 후 연산한다..
		
		//먼저 대입후 에 i 가 증가된것이다. , 초기화가 된이후, 할당 된 에 더하라..
		j = i++ ; // 후위형 후증가 //연산(호출이)이 한번이루어진 후에
		System.out.println("j = i++ 의 결과");
		System.out.println("=============");
		System.out.println("i 의 값 : "+ i);
		System.out.println("j 의 값 : "+ j);
		System.out.println();
		
		
		// 전위형은 1을 먼저 증가시키고 연산한다.
		
		int x = 5 ;
		int y = 0 ;
		y = ++x ;   //전위형 선증가
		System.out.println("y = ++x 의 결과");
		System.out.println("===============");
		System.out.println("x 의 값 : "+x);
		System.out.println("y 의 값 : "+y);
		
		
		
		
	}
	
	
	
}
