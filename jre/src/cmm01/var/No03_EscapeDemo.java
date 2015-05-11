package cmm01.var;

public class No03_EscapeDemo {
   public static void main(String[] args) {// 클래스, 메소드, 선언 문 
	 int kor = 90 ;  //선언자체에서의 패터은 깨지지 않았다..//이중 배열 에서의 세미콜론의 의미  
	 //int kor;     //선언 Declartion
	 //kor = 90;    // 할당 Allocation 초기화라는 개념
	 //초기화라는 개념으로 따로 할당하는것은! , 초기화 시킨값이라, 나중에 할당한 값 이 좀 틀릴수 있다.
	 
	 int eng = 85 , sum = 0;
	 // 같은 타입들은 동일한 선상에서 선언 을 해줘야한다.. // 생성자 만들때 동일한것은 같은 선상에 해줘야지 가독성이 높아진다?
	 
	 sum = kor + eng;
	 System.out.print("성적처리"+"\n");
	 System.out.println("국어 영어 합계 ");
	 System.out.println("kor"+"\teng"+"\tsum"); //escape 문자는 
	 System.out.println(kor+"\t"+eng+"\t= "+sum); 
	    //문자열 클래스 가 따로 있고 문자 자체가 따로 들어와서 자체적으로 정렬 나오게하는 프로그래밍이 되어있다.. //변수끼리  
	 
	 
	 // 선언 과 할당은 엄연히 할일이 다르다!!
	 
	 // cpu - ram - hdd : 
	 // 값을 할당하면 메모리를 로드한다.. , 초기화 변수 로드 
	  // 초기화 하지 않으면 메모리 에 올라가지 않기 때문에 해주는것이다. 
	 
	 
	 
   
   
   }
}
