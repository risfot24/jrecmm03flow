package cmm01.var;
/*
 Upcasting
 = 변환(Conversion)
 = promotion
 = 묵시적(implict) 자동변환

: 자바가 제공하는 자동변환으로 묵시적인 동작
데이터 타입의 표현범위가 작은쪽에서 많은 쪽으로 변환 될때만
가능하다. 
 
 */
public class No02_CastingDemo {
 public static void main(String[] args) {
   
   byte varByte = 1;
   int i = 123;
   double varDou = 123.456;
   
   int upByte = (int)varByte; // 생략 해도 무방하다..
  // double upInt = varInt;
   /*
 Down-Casting
  = 캐스팅(Casting)
  강제 형 변환
  : 프로그램에서 명시적으로 지정하는 타입 변환.
  축소변환이 되는 경우는 반드시 명시적으로 캐스팅하여야 함.
  주의 !!!! 데이터 손실이 발생할 수 있다. 
    * */
   float varFlo = 123.456f;
   int downFlo = (int)varFlo ;
  // int downFlo2 = (int) varFlo ;
   // 에러를 이클립스가 자동적으로 고칠수 있게 하여라... //코딩 습관 //레퍼런스 형변환 나오긴하지만 그래도 알아는 놔라..
   
    System.out.println("다운 캐스팅 결과 값 : "+ downFlo);
   
	
 }
   
   
   
}
