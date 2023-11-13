package step1_05.condition;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */


public class IfEx11_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int result = 0;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		System.out.print("구매할 음식 번호를 입력해주세요 : ");
		int choice = scan.nextInt();
		
		System.out.print("소지한 금액을 입력해주세요 : ");
		int myMoney = scan.nextInt();
		
		if (choice == 1) {
			if (price1 <= myMoney) {
				result = myMoney - price1;
				System.out.println("불고기 버거를 정상적으로 구매했습니다.");
				System.out.println("거스름 돈" + result + "원 입니다.");
			} else {
				System.out.println("현금이 부족합니다.");
			}
		} else if (choice == 2) {
			if (price2 <= myMoney) {
				result = myMoney - price2;
				System.out.println("새우 버거를 정상적으로 구매했습니다.");
				System.out.println("거스름 돈" + result + "원 입니다.");
			} else {
				System.out.println("현금이 부족합니다.");
			}
		} else if (choice == 3) {
			if (price3 <= myMoney) {
				result = myMoney - price3;
				System.out.println("콜라를 정상적으로 구매했습니다.");
				System.out.println("거스름 돈" + result + "원 입니다.");
			} else {
				System.out.println("현금이 부족합니다.");
			}
		} 
		scan.close();
	}

}
