package cmm02.op;

public class No04_ConditionDemo {
    //op코드 끝(operate code 끝)
	
	// 익명 함수(이건 아닌거 같다) 상태값에 대한
	public static void main(String[] args) {
		int val01 = 1 ;
		int val02 = 2 ;
		
		//프로그래머의 생각에는 상태값에 대한 분기라고 생각한다.,,
		//주체는 엔진이다 , () condition 이  이 상태에 따라서 바뀌게 된다..
		//() 안에 있는 값이 상태값 
		 
		if((val01 == 1 ) && (val02 == 2 )){
			System.out.println("1번값 과 2번값은 맞습니다.");
		
		}    //c언어는 한줄일때에 () 생략해도 되지만, 자바는 그렇게 하지마라..

	    if((val01 != 1 ) || (val02 != 2)){// == || ==  처음이 맞는 경우
	    	System.out.println("1번값 과 2번값은 다릅니다 .");
	    }
	
	
	}
	
}
