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

public class LoopEx15_연습2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int i = 1;
		int studentScore = 0;
		int passStudentCnt = 0;
		int totalScore = 0;
		double totalAvg = 0;
		int maxStudent = 0;
		int maxScore = 0;
		
		while (i <= 10) {
			
			studentScore = ran.nextInt(100) + 1; // 학생의 성적
			
			if (studentScore >= 60) {
				passStudentCnt += 1;
			}
			
			totalScore += studentScore;
			
			if (maxScore < studentScore) {
				maxScore = studentScore;
				maxStudent = i;
			}
			
			System.out.println(i + "번째 성적 : " + studentScore + "점");
			
			i++;
		}
		totalAvg = totalScore / 10.0;
		System.out.println("총 점 : " + totalScore + "점");
		System.out.println("평 균 : " + totalAvg + "점");
		System.out.println("1등 학생 : " + maxStudent + "번째 학생");
		System.out.println("1등 학생 점수 : " + maxScore + "점");
		
	}

}
