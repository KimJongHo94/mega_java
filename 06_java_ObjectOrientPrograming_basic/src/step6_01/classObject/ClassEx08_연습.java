package step6_01.classObject;

import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */


class Ex08_연습 {
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}

public class ClassEx08_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex08_연습 e = new Ex08_연습();
		
		int player = 0;
		
		while (true) {
			
			System.out.println("=== 숫자 이동 게임 ===");
			for (int i = 0; i < e.game.length; i++) {
				if      (e.game[i] == 0) System.out.print("_");
				else if (e.game[i] == 1) System.out.print("|");
				else if (e.game[i] == 2) System.out.print("옷");
			}
			System.out.println();
			
			System.out.println("왼쪽(1) 오른쪽(2)");
			System.out.print("선택 : ");
			int choice = scan.nextInt();
			
			if (choice == 1) {		// 왼쪽 이동
				
				for (int i = 0; i < e.game.length; i++) {
					if (e.game[i] == 2) {
						player = i;
					}
				}
				
				if (player < 0) {		
					System.out.println("더 이상 왼쪽으로 이동 할 수 없습니다.");
					continue;
				}
				else if (player >= 1) {		// 왼쪽으로 이동했을 때 왼쪽에 1이 있는지 확인
					if (e.game[player - 1] == 1) {
						
						System.out.println("벽을 만났습니다. 부실려면 3번을 누르세요");
						int sel = scan.nextInt();
						
						if (sel == 3) {
							e.game[player - 1] = 0;
						}
						else {
							System.out.println("벽을 부수지 않았습니다.");
						}
						
					}
					else {
						e.game[player] = 0;
						e.game[player - 1] = 2;
					}
				}
				
			}
			else if (choice == 2) {		// 오른쪽으로 이동
				
				for (int i = 0; i < e.game.length; i++) {
					if (e.game[i] == 2) {
						player = i;
					}
				}
				
				if (player == e.game.length - 1) {
					System.out.println("더 이상 오른쪽으로 이동할 수 없습니다.");
				}
				else {
					
					if (e.game[player] + 1 == 1) {
						
						System.out.println("벽을 만났습니다. 부실려면 3번을 누르세요");
						int sel = scan.nextInt();
						
						if (sel == 3) {
							e.game[player + 1] = 0;
						}
						else {
							System.out.println("벽을 부수지 않았습니다.");
						}
						
						
					}
					else {
						e.game[player] = 0;
						e.game[player + 1] = 2;
					}
					
				}
				
			}
			
			if (choice == -100) {
				System.out.println("\n=== 게임 종료 ===\n");
				break;
			}
			
			
			
		}
	}

}
