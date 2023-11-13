package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_연습 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2); // [0 ~ 1]
		
		System.out.print("동전 앞면일까요? 뒷면일까요?");
		int answer = scan.nextInt();
		
		if (coin == 0) {
			System.out.println(coin);
			if (answer == 0) {
				System.out.println("앞면입니다. 정답을 맞추셨습니다.");
			} else if (answer == 1) {
				System.out.println("뒷면을 고르셨군요. 틀리셨습니다.");
			} else {
				System.out.println("앞면 또는 뒷면 둘 중 하나만 선택하셔야합니다.");
			}
		} else {
			
			System.out.println(coin);
			if (answer == 0) {
				System.out.println("앞면입니다. 틀리셨습니다");
			} else if (answer == 1) {
				System.out.println("뒷면을 고르셨군요. 정답입니다.");
			} else {
				System.out.println("앞면 또는 뒷면 둘 중 하나만 선택하셔야합니다.");
			}
		}


	}

}
