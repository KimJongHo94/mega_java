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


public class LoopEx05_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		int i = 1;
		int totalPrice = 0;
		int menuCnt1 = 0;
		int menuCnt2 = 0;
		int menuCnt3 = 0;
		
		while (i <= 5) {
			
			System.out.print("메뉴 선택 : ");
			int myMenu = scan.nextInt();
			
			if (myMenu == 1) {
				totalPrice += bulgogiBurgerPrice;
				menuCnt1 += 1;
			} else if (myMenu == 2) {
				totalPrice += shrimpBurgerPrice;
				menuCnt2 += 1;
			} else {
				totalPrice += colaPrice;
				menuCnt3 += 1;
			}
			i++;
		}
		
		System.out.println("총 금액 : " + totalPrice + "원");
		System.out.print("금액 입력 : ");
		int myMoney = scan.nextInt();
		
		int money = 0;
		
		if (totalPrice > 0) {
			if (myMoney >= totalPrice) {
				money = myMoney - totalPrice;
			} else {
				System.out.println("금액이 부족합니다.");
			}
		} else {
			System.out.println("주문하신 메뉴가 없습니다.");
		}
		
		System.out.println("=== 롯데리아 영수증 ===");
		System.out.println("1. 불고기 버거 : " + menuCnt1 + "개");
		System.out.println("2. 새우   버거 : " + menuCnt2 + "개");
		System.out.println("3.        콜라 : " + menuCnt3 + "개");
		System.out.println("4. 총  금   액 : " + totalPrice + "원");
		System.out.println("5. 잔       액 : " + money + "원");
		
		scan.close();
		
	}

}
