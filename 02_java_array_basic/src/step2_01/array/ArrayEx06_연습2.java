package step2_01.array;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */

class Ex06_연습2 {
	
	int getCheckStu (int[] studentNums, int[] scores, int value) {
		
		int index = -1;
		
		for (int i = 0; i < studentNums.length; i++) {
			if(studentNums[i] == value) {
				index = i;
			}
		}
				
		return index;
		
	}
	
	int setScore (int[] scores, int index) {
		int score = 0;
		
		score = scores[index];
		
		return score;
	}
	
}


public class ArrayEx06_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex06_연습2 e = new Ex06_연습2();
		
		int[] studentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.print("학번 입력 : ");
		int value = scan.nextInt();
		
		int index = e.getCheckStu(studentNums, scores, value);
		
		if (index != -1) {
			int score = e.setScore(scores, index);
			System.out.println("성적 : " + score + "점");
		}
		else {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		
	}
	
}
