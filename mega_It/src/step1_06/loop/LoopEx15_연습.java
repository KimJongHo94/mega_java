package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_연습 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int i = 1;
		int maxScore = 0;
		int maxNum = 0;
		int totalSum = 0;
		double totalAvg = 0.0; 
		int passStudentCnt = 0;
		
		while (i <= 10) {
			
			int score = ran.nextInt(100) + 1;
			System.out.println(i + "번째 점수 = " + score + "점");
			
			if (score >= 60) { // 합격자 수
				passStudentCnt += 1;
			}
			
			if (maxScore < score) { // 최고점수
				maxScore = score;
				maxNum = i;
			}
			
			totalSum += score; // 총점
			
			i++;
		}
		
		totalAvg = totalSum / 10.0;
		
		System.out.println("전교생 총점 : " + totalSum + ", 평균 : " + totalAvg);
		System.out.println("합격자 수 : " + passStudentCnt + "명");
		System.out.println("최고 점수 : " + maxScore + "점");
		System.out.println("최고 점수 학생 : " + maxNum + "번째 학생");
		
	}

}
