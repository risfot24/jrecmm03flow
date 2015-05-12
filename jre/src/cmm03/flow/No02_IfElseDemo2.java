package cmm03.flow;

public class No02_IfElseDemo2 {

	public static void main(String[] args) {

		int kor = 90, eng = 85, sum = 0;
		double avg = 0.0;
		sum = kor + eng;
		String msg = "메시지";
		avg = sum / 2;
		/*
		 * 조건에 따라 if 처리 평균 100점이 면 "보너스 지급"
		 */
		if (avg == 100) {
			msg = "보너스 지급";
			// System.out.println("재 시험을 보세요 ."); 하드 코딩
		} else if (avg >= 70) {
			msg = "시험 합격";
		} else {
			msg = "재시험을 보세요!";
		}

		System.out.println("국어 : " + kor); // ctrl + 화살표
		System.out.println("영어 : " + eng);
		System.out.println("총점 : " + sum);
		System.out.println(msg);
	 
	 

	}

}
