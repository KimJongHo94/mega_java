package step2_01.array;

import java.util.Scanner;

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 'O'로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [O] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */


public class ArrayEx09_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
		int price = 0;
		
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("1. 좌석 예매");
			System.out.println("2. 종료");
			System.out.print("입력 : ");
			int menuChoice = scan.nextInt();
			
			if (menuChoice == 1) {
				
				System.out.print("좌석 선택(1 ~ 7) : ");
				int seatChoice = scan.nextInt();
				
				for (int i = 0; i < seat.length; i++) {
					
					if (seat[seatChoice -1] == 'X') {
						seat[seatChoice -1] = 'O';
						System.out.println(seatChoice + "번째 좌석이 정상적으로 예매되었습니다.");
						break;
					} else {
						System.out.println("해당 좌석은 이미 예매 완료되었습니다.");
						break;
					}
					
				}
				
			} else if (menuChoice == 2) {
				
				for (int i = 0; i < seat.length; i++) {
					System.out.print(seat[i] + " ");
					if (seat[i] == 'O') {
						price += 12000;
						isRun = false;
					}
				}
				
			} else {
				System.out.println("1 ~ 2번 중에 선택해주세요.");
			}
			
		}
		System.out.println();
		System.out.println("================");
		System.out.println("총 금액 : " + price + "원");
		
	}
	
}
