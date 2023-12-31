package step2_01.array;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */


public class ArrayEx07_연습 {

	public static void main(String[] args) {
		
		int[] stduentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		int maxHakbun = 0;
		int maxScore = 0;
		
		for (int i = 0; i < scores.length; i++) {
			
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				maxHakbun = stduentNums[i]; 
			}
			
		}
		
		System.out.println("1등학생 : " + maxHakbun + " 학생");
		System.out.println("1등점수 : " + maxScore + "점");
		
	}
	
}
