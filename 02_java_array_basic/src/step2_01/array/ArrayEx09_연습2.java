package step2_01.array;

import java.util.Arrays;
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

class Ex09_연습2 {
	
	char seat[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
	int cnt = 0;
	
	void mainView () {
		System.out.println("===[메가 영화관]===");
		System.out.println("[1]좌석예매");
		System.out.println("[2]종료하기");
	}
	
	void print () {
		System.out.println("=== 좌석 현황 ===");
		System.out.println(Arrays.toString(seat) + "\n");
	}
	
	int checkSeat (int value) {
		
		int index = -1;
		
		if (seat[value] == 'O') {
			return index;
		}
		else {
			index = value;
		}
		
		return index;
		
	}
	
	void setSeat (int index) {
		seat[index] = 'O';
		cnt++;
	}
	
	int totalPrice () {
		
		int price = 0;
		
		price = cnt * 12000;
		
		return price;
	}
	
}

public class ArrayEx09_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex09_연습2 e = new Ex09_연습2();
		
		while (true) {
			
			e.print();
			
			e.mainView();
			System.out.print("선택 : ");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				e.print();
				System.out.print("좌석 선택[1 ~ 7] : ");
				int selSeat = scan.nextInt();
				selSeat--;
				
				int check = e.checkSeat(selSeat);
				
				if (check != -1) {
					e.setSeat(selSeat);
				}
				else {
					System.out.println("해당 좌석은 이미 예매가 완료되었습니다.");
				}
				
			}
			else if (choice == 2) {
				System.out.println("=== 종료 ===");
				System.out.println("매출액 : " + e.totalPrice() + "원");
				scan.close();
				break;
			}
			
		}
		
		
		
	}
	
}
