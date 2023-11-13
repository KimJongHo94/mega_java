package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		System.out.println();
		
		int cnt = 1;
		int choiceMenu_01 = 0;
		int choiceMenu_02 = 0;
		int choiceMenu_03 = 0;
		int totalCost = 0;
		
		while (cnt <= 5) {
			
			System.out.print("메뉴를 선택하세요 : ");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				totalCost += bulgogiBurgerPrice;
				choiceMenu_01 += 1;
			} else if (choice == 2) {
				totalCost += shrimpBurgerPrice;
				choiceMenu_02 += 1;
			} else if (choice == 3) {
				totalCost += colaPrice;
				choiceMenu_03 += 1;
			}
			cnt++;
		}
		
		System.out.println("총 금액 : " + totalCost + "원");
		System.out.print("현금 입력 : ");
		int myMoney = scan.nextInt();
		if (totalCost > 0) {
			if (myMoney >= totalCost) {
				System.out.println("=== 롯데리아 영수증 ===");
				System.out.println("1. 불고기 버거 : " + choiceMenu_01 + "개");
				System.out.println("2. 새 우 버 거 : " + choiceMenu_02 + "개");
				System.out.println("3. 콜       라 : " + choiceMenu_03 + "개");
				System.out.println("4. 총  금   액 : " + totalCost + "원");
				System.out.println("5. 잔       액 : " + (myMoney - totalCost) + "원");
			} else {
				System.out.println("금액이 부족합니다.");
			}
		}
		scan.close();
	}

}
