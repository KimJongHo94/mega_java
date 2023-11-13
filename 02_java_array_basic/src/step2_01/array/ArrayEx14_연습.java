package step2_01.array;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // 배열의 크기 : 15
		int player = 0;
		
		boolean isRun = true;
		
		for (int i=0; i < game.length; i++) {
			if (game[i] == 2) {
				player = i; // player = 2;
			}
			System.out.print(game[i] + " ");
		}
		System.out.println();
		
		while (isRun) {
			
			System.out.print("숫자1: 왼쪽, 숫자2: 오른쪽을 입력하세요");
			int myChoice = scan.nextInt();
			
			if (myChoice == 1) {
				
				for (int i = 0; i < game.length; i++) {
					
					if (game[i] == 2) {
						player = i - 1;
						game[i] = 0;
						if (player < 0) {
							System.out.println("왼쪽 끝까지 이동했습니다 처음 위치로~");
							player = 2;
							break;
						}
						
					}
					
				}
				game[player] = 2;
				
				for (int i = 0; i < game.length; i++) {
					System.out.print(game[i] + " ");
				}
				
				System.out.println();
				
			} else if (myChoice == 2) {
				
				for (int i = 0; i < game.length; i++) {
					
					if (game[i] == 2) {
						player = i + 1;
						game[i] = 0;
						if (player >= game.length) {
							System.out.println("오른쪽 끝까지 이동했습니다 처음 위치로~");
							player = 2;
							break;
						}
						
					}
					
				}
				game[player] = 2;
				
				for (int i = 0; i < game.length; i++) {
					System.out.print(game[i] + " ");
				}
				
				System.out.println();
				
			}
			
			if (myChoice == 0) {
				System.out.println("게임 종료");
				isRun = false;
				
			}
			
		}
				
	}
	
}