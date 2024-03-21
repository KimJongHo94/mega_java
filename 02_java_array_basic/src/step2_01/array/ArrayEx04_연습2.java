package step2_01.array;

import java.util.Arrays;
import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */
class Ex04_연습2 {
	
	Random ran = new Random();
	
	int ranNumGet () {
		
		int rNum = 0;
		
		rNum = ran.nextInt(100) + 1;
		
		return rNum;
		
	}
	
	int totalSum (int[] arr) {
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		
		return result;
	}
	
	double totalAvg (double value, int size) {
		
		double result = 0.0;
		
		result = value / size;
		
		return result;
		
	}
	
	int passCount (int[] arr) {
		
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 60) {
				result += 1;
			}
		}
		
		return result;
		
	}
	
	void print (int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
}

public class ArrayEx04_연습2 {

	public static void main(String[] args) {
		
		Ex04_연습2 e = new Ex04_연습2();
		
		int[] arr = new int[5];
		
		
		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < arr.length; i++) {
			arr[i] = e.ranNumGet();
		}
		e.print(arr);
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int totalScore = e.totalSum(arr);
		System.out.println("총합 : " + totalScore + "점");
		System.out.println("평균 : " + e.totalAvg(totalScore, arr.length) + "점");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int passCnt = e.passCount(arr);
		System.out.println("합격생 수 : " + passCnt);

	}
	
}
