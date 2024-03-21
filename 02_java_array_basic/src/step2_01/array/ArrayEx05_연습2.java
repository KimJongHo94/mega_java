package step2_01.array;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

class Ex05_연습2 {
	
	int getScore (int[] arr, int index) {
		
		int score = 0;
		
		if (0 > index || index > arr.length) {
			score = -1;
		}
		else {
			score = arr[index];
		}
		
		return score;
		
	}
	
	int getIndex (int[] arr, int value) {
		
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index = i;
			}
		}
		
		return index;
		
	}
	
	int getScore2 (int[] hakbuns, int[] scores, int value) {
		
		int score = 0;
		int index = 0;
		
		for (int i = 0; i < hakbuns.length; i++) {
			
			if (hakbuns[i] == value) {
				index = i;
			}
			
		}
		
		score = scores[index];
		
		return score;
		
	}
	
}

public class ArrayEx05_연습2 {

	public static void main(String[] args) {
		
		Ex05_연습2 e = new Ex05_연습2();
		
		Scanner scan = new Scanner(System.in);
		
		
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		int score = e.getScore(arr, idx);
		
		if (score == -1) {
			System.out.println("해당 인덱스는 존재하지 않습니다.");
		}
		else {
			System.out.println("성적 : " + score + "점");
		}
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		System.out.print("성적 입력 : ");
		int data = scan.nextInt();
		
		int index = e.getIndex(arr, data);
		
		if (index == -1) {
			System.out.println("해당 성적은 존재하지 않습니다.");
		}
		else {
			System.out.println("인덱스 : " + index);
		}
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		
		System.out.println("성적 : " + e.getScore2(hakbuns, scores, hakbun));
		
	}
	
}
