package step1_06.loop;

import java.util.Scanner;

/*
 * # 베스킨라빈스31
 * 
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */


public class LoopEx11_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		String user = "";
		
		int br = 0;
		int turn = 0;
		
		boolean isRunning = true;
		
		while (isRunning) {
			
			turn += 1;
			
			if (turn % 2 == 1) {
				System.out.print(turn + "턴 : p1(" + p1 + ")  br(" + br + ") : " );
				p1 = scan.nextInt();
				br += p1;
				user = "p2";
			} else {
				System.out.print(turn + "턴 : p2(" + p2 + ")  br(" + br + ") : " );
				p2 = scan.nextInt();
				br += p2;
				user = "p1";
			}
			
			if (br >= 31) {
				System.out.println(user + "가 승리했습니다.");
				isRunning = false;
			} 
			
			
			
		}
		
	}

}
