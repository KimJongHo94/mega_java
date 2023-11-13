package step2_01.array;

import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */


public class ArrayEx04_연습 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = ran.nextInt(101);
			
			System.out.println(i + "번째 학생 점수 : " + arr[i] + "점");
			
		}
		System.out.println("=====================");
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int totalScore = 0;
		double totalAvg = 0.0;
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = ran.nextInt(101);
			System.out.println(i + "번째 학생 점수 : " + arr[i] + "점");
			totalScore += arr[i];
			
		}
		
		totalAvg = totalScore / arr.length;
		System.out.println("총 점 : " + totalScore + "점");
		System.out.println("평 균 : " + totalAvg + "점");
		System.out.println("=====================");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int passCnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = ran.nextInt(101);
			System.out.println(i + "번째 학생 점수 : " + arr[i] + "점");
			if (arr[i] >= 60) {
				passCnt += 1;
			}
			
		}
		
		System.out.println("합격생 수 : " + passCnt + "명");
		
		
	}
	
}
