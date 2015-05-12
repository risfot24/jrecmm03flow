package cmm03.flow;
/*★★★★★
 *★★★★
 *★★★ 
 *★★
 *★
 */

public class No01_Star2 {
	
	

	public static void main(String[] args) {
		
		int a = 5;
		
		for (int i = 0; i < a; i++) {
			for (int j = a; i < j; j--) {   // j > i
				System.out.print("★");      // 첫번째 0 ; i<6 ; i++
			}                               // 두번째 j =1 ; j <(6-i) ; j++
			System.out.println("");
		}

		System.out.println("-------------");
		 for(int x = 0 ; x < 5 ; x++){
			 for(int y =5; y>x ; y--){
				 System.out.println("★");
			 }
		    System.out.println("");
		 
		 }
	
		
	
	
	}

}
