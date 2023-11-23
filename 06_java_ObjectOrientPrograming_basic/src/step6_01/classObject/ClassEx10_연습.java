package step6_01.classObject;

import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */


class Ex10_연습 {
	
	int[] menuPrices   = {    2500,       3800,     1500,  1000};
	String[] menuNames = {"치즈버거", "불고기버거", "감자튀김", "콜	라"};
	int[] orderCnt = new int[4];
	int totalPrice = 0;
	
}


public class ClassEx10_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex10_연습 e = new Ex10_연습();
		
		int idx = 0;
		
		while (true) {
			
			System.out.println("=== 롯 데 리 아 ===");
			System.out.println();
			System.out.println("=== 메  뉴   판 ===");
			System.out.println("-------------------");
			for (int i = 0; i < e.menuNames.length; i++) {
				System.out.println((i+1) + ") " + e.menuNames[i]);
			}
			System.out.println((e.menuNames.length + 1) + ") 주문종료");
			System.out.println();
			
			System.out.print("[주문]메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if (choice == 1) { // 치즈버거
				e.orderCnt[choice-1] += 1;
				e.totalPrice += e.menuPrices[choice-1];
			}
			else if (choice == 2) { // 불고기버거
				e.orderCnt[choice-1] += 1;
				e.totalPrice += e.menuPrices[choice-1];
			}
			else if (choice == 3) {  // 감자튀김
				e.orderCnt[choice-1] += 1;
				e.totalPrice += e.menuPrices[choice-1];
			}
			else if (choice == 4) {  // 콜라
				e.orderCnt[choice-1] += 1;
				e.totalPrice += e.menuPrices[choice-1];
			}
			else if (choice == 5) {
				System.out.println("=== 주문 종료 ===");
				break;
			}
			else {
				System.out.println("1 ~ 4번 메뉴 중에 선택하세요");
				continue;
			}
			
		}
		System.out.println("※ ITEM    QTY    AMT");
		System.out.println("합계금액 : " + e.totalPrice + "원");
		
		System.out.print("받은 금액 : ");
		int myMoney = scan.nextInt();
		
		if (myMoney >= e.totalPrice) {
			System.out.println("잔돈 : " + (myMoney - e.totalPrice) + "원");
		}
		else {
			System.out.println("금액이 부족합니다.");
		}

	}

}
