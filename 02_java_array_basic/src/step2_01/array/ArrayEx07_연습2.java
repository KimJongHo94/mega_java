package step2_01.array;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */
class Ex07_연습2 {
	
	int getMaxScore (int[] scores) {
		
		int index = -1;
		int maxNum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (maxNum < scores[i]) {
				maxNum = scores[i];
				index = i;
			}
		}
		
		return index;
		
	}
	
}

public class ArrayEx07_연습2 {

	public static void main(String[] args) {
		
		Ex07_연습2 e = new Ex07_연습2();
		
		int[] stduentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		int index = e.getMaxScore(scores);
		
		System.out.println(stduentNums[index] + "(" + scores[index] + "점)");
		
	}
	
}
