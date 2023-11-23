package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */


class Ex09_연습 {
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}


public class ClassEx09_연습 {

	public static void main(String[] args) {		
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		Ex09_연습 e = new Ex09_연습();
		
		int cnt = 0;
		
		while (cnt < 1000) {
			
			int rNum = ran.nextInt(10);
			
			int temp = e.front[0];
			e.front[0] = e.front[rNum]; // 1 ~ 5
			e.front[rNum] = temp;
			
			cnt++;
		}
		
		while (e.answerCnt < 5) {
			
			System.out.println("front : " + Arrays.toString(e.front));
			System.out.println("back  : " + Arrays.toString(e.back));
			
			System.out.print("인덱스1 입력 : ");
			int getIdx01 = scan.nextInt();
			System.out.print("인덱스2 입력 : ");
			int getIdx02 = scan.nextInt();
			
			if (e.front[getIdx01] == e.front[getIdx02]) {
				e.back[getIdx01] = e.front[getIdx01];
				e.back[getIdx02] = e.front[getIdx02];
				e.answerCnt++;
			}
			else {
				System.out.println("일치하지 않습니다.");
				continue;
			}
			
			
			
		}
		
	}

	
}
