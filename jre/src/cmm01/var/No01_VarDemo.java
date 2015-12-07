package cmm01.var;
/*
 변수의 작성 규칙
 1. 알파벳 대소문자, 숫자, _(Underscore), $만 사용가능
 2. 첫 문자가 숫자이면 안됨
 3. 키워드(예약어)와 같으면 안됨
 
 */
//띄워 주는것이 매너

//아래 형식이 기본 형태!! 모양을 갖춘다음에 하자
class No01_VarDemo { //클래스 바디 (블레이스) ||| [],{} 브레이스 ,()  
   int a;
	//(키워드 , 식별자, 바디 )!! 기본이고 당분간은  public 같은거 안쓴다..
   No01_VarDemo(){}  
   //생성자는 변수가 생략된것이지 있고 패턴은 메소드 와 똑같다.. , 바디와 세미콜론은 공존 하지 않는다. (배열 예외?)
   void main() {//메인으로서의 역활을 지웠다.	
	
	//논리형, 1바이트, 초기값 : false
	  boolean result = true;
	//문자형, 2바이트, 초기값 = \u0000
	char capitalC = 'C';
	//정수형
	 byte varByte = 100; // 8비트 , -128 ~ 127
	 short varShort = 10000 ; // 16비트 , 초기값 0
	 int varInt = 1000000; // 32비트, 초기값 0
	 long varLong = 100L ; //64비트, 초기값 0
	                        //long double? 원시형? 
	  //부동소수점 타입
	  float varFloat = 100.0f; //32 비트
	  double varDouble = 100.00d ;// 64비트
  }	
	
   //원시형 변수
   //ddddddd

   
}