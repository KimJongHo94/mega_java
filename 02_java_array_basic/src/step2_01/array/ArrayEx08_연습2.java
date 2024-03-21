package step2_01.array;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드
 * 
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * hgd     = {1, 1, 4, 4, 3}
 * 정오표  = {O, X, O, X, X}
 * 성적    = 40점
 */

class Ex08_연습2 {
	
	Random ran = new Random();
	int cnt = 0;
	
	void setRanNum (int[] hgd) {
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5) + 1; 
		}
	}
	
	void print (int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	void result (int[] answer, int[] hgd) {
		
		char[] view = new char[answer.length];
		
		for (int i = 0; i < view.length; i++) {
			if (answer[i] == hgd[i]) {
				view[i] = 'O';
				cnt += 1;
			}
			else {
				view[i] = 'X';
			}
		}
		System.out.println(Arrays.toString(view));
		
	}
	
	int getTotalScore () {
		int score = 0;
		
		score = cnt * 20;
		
		return score;
	}
	
}

public class ArrayEx08_연습2 {

	public static void main(String[] args) {
		
		Ex08_연습2 e = new Ex08_연습2();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		
		e.setRanNum(hgd);
		System.out.print("answer : ");
		e.print(answer);
		System.out.print("hgd    : ");
		e.print(hgd);
		System.out.print("result : ");
		e.result(answer, hgd);
		System.out.println("총 점수 : " + e.getTotalScore() + "점");
		
		
		
	}
	
}
