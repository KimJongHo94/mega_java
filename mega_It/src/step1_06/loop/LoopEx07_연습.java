package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(100) + 1;
		int myLife = 100;
		boolean isRunning = true;
		
		System.out.println("Up & Down 게임");
		while (isRunning) {
			
			System.out.println(rNum);
			
			System.out.print("숫자를 입력하세요 : ");
			int answer = scan.nextInt();
			
			if (answer == rNum) {
				System.out.println("정답을 맞추셨습니다.");
				isRunning = false;
			} else if (answer < rNum) {
				System.out.println("Up!");
				myLife -= 5;
			}else if (answer > rNum) {
				System.out.println("Down!");
				myLife -= 5;
			}
			
		}
		
		System.out.println("점수 : " + myLife + "점 입니다.");
		
	}

}
