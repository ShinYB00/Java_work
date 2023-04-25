package kosa.mission;

public class Mission02 {

	public static void main(String[] args) {
		// 여러 명의 성적을 관리할 수 있는 프로그램을 구현해 보자.
		// 점수를 선언해서 각 과목별로 총점과 평균을 구현하자.
		// 번호   국어    영어    수학    총점    평균
		//   1  90   98   91   290   95
		//   2  21   45   43   180   45
		// ==============================
		//      281  260  330
		//      50    60   70

		int num[] = {1, 2};
		int score[][] = {{90, 98, 91}, {21, 45, 43}};
		
		int total[] = new int[2];
		double average[] = new double[2];
		
		System.out.println("번호   국어    영어    수학    총점    평균");
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				total[i] += score[i][j];
			}
			System.out.println(num[i] + "번 학생 전체 총점 : " + total[i]);
			average[i] = (double)total[i] / score[i].length; 
			System.out.println(num[i] + "번 학생 전체 평균 : " + average[i]);
		}
		
		
		
		
	}

}
