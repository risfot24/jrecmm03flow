package cmm03.flow;

import java.util.Scanner;

//���� ���߱� ����

public class No08_NuberMatch {
   public static void main(String[] args) {
	No08_NuberMatchVO vo = new No08_NuberMatchVO();
	System.out.println("�� 3ȸ�� �Է°����մϴ�. ");
	Scanner scan = new Scanner(System.in);
	int result = 0 ;
   
	for(int i= 0 ; i <3 ; i++){
	
		System.out.println("1���� 5���� ������ �Է��ϼ���.");
		
		
		try {
			int input = scan.nextInt();
			vo.setPlayer(input);
           
		}catch(Exception e) {// ����� ���ִ� ��Ȱ!
           System.out.println("���ڴ� �ȵ˴ϴ�. "); 
			
		}

		if(vo.getPlayer() == 0){
			System.out.println("�ٽ� �Է��� �ֽʽÿ�");
		}else{
			vo.setCom();
			result = vo.game(vo.getCom(), vo.getPlayer());
		}
		if(result == 1){
			System.out.println("���ƽ��ϴ�. " 
					+ "������ ��ȿ �մϴ�. ");
			break;
		}else if( i == 2){
			System.out.println("3ȸ ��� �����߽��ϴ�. "
					+"\n ���ӿ��� �й��ؽ��ϴ�. "
					+"\n ������ �����մϴ�. "
					);
		}
			
		
	}
		
   
	}
}
