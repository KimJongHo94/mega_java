package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx22_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int myLift = 100;
		boolean run = true;
		
		do {
			
			int rNum = ran.nextInt(100) + 1;
			
			System.out.print("숫자를 입력하세요 : ");
			int myAnswer = scan.nextInt();
			
			if (myAnswer < rNum) {
				System.out.println("Up!");
				myLift -= 5;
			} else if (myAnswer > rNum) {
				System.out.println("Down!");
				myLift -= 5;
			} else {
				System.out.println("Bingo!");
				run = false;
			}
			
			if (myLift == 0) {
				System.out.println("정답을 맞추지 못 했습니다.");
				run = false;
			}
			
		} while (run);
		
		System.out.println("게임이 종료되었습니다.");
		System.out.println("최종 점수는 " + myLift + "입니다.");
		
	}

}
