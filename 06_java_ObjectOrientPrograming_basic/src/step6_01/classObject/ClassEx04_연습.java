package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
class Ex04 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}
*/
class Ex04_연습 {
	
	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}

public class ClassEx04_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex04_연습 e = new Ex04_연습();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < e.scores.length; i++) {
			
			e.scores[i] = ran.nextInt(100) + 1;
			
		}
		
		System.out.println(Arrays.toString(e.scores));
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int totalScore = 0;
		double avg = 0.0;
		
		for (int i = 0; i < e.scores.length; i++) {
			totalScore += e.scores[i];
		}
		
		avg = (double)totalScore / e.scores.length;
		System.out.println("총점 : " + totalScore + "점");
		System.out.println("평균 : " + avg + "점");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int passCnt = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.scores[i] >= 60) {
				passCnt += 1;
			}
		}
		System.out.println("합격생 : " + passCnt + "명");
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		
		if (0 > idx || idx > e.scores.length) {
			System.out.println("해당 인덱스 존재하지 않습니다.");
		}
		else {
			System.out.println("성적 : " + e.scores[idx] + "점");
		}
		
		
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.print("성적 입력 : ");
		int data = scan.nextInt();
		
		idx = -1;
		
		for (int i = 0; i < e.scores.length; i++) {
			if (data == e.scores[i]) {
				idx = i;
			}
		}
		
		if (idx != -1) {
			System.out.println("인덱스 : " + idx + " 입니다.");
		}
		else {
			System.out.println("해당 성적은 존재하지 않습니다.");
		}
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.print("학번 입력 : ");
		int getHakbun = scan.nextInt();
		
		idx = -1;
		
		for (int i = 0; i < e.hakbuns.length; i++) {
			if (getHakbun == e.hakbuns[i]) {
				idx = i;
			}
		}
		
		if (idx != -1) {
			System.out.println("성적 : " + e.scores[idx] + "점");
		}
		else {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.print("학번 입력 : ");
		getHakbun = scan.nextInt();
		
		idx = -1;
		
		for (int i = 0; i < e.hakbuns.length; i++) {
			if (getHakbun == e.hakbuns[i]) {
				idx = i;
			}
		}
		
		if (idx != -1) {
			System.out.println("성적 : " + e.scores[idx] + "점");
		}
		else {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
 		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int maxScore = 0;
		int maxHakbun = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			
			if (maxScore < e.scores[i]) {
				maxScore = e.scores[i];
				maxHakbun = i;
			}
		}
		System.out.print("1등학생 : ");
		System.out.println(e.hakbuns[maxHakbun] + "(" + maxScore + ")");
		
		
		
	}

}
