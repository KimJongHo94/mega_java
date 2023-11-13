package step1_05.condition;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.print("이체 할 계좌번호를 입력하세요 : ");
		int checkAcc = scan.nextInt();
		
		int checkMoney = 0;
		
		if (yourAcc == checkAcc) {
			
			System.out.print("이체 할 금액을 입력하세요 : ");
			checkMoney = scan.nextInt();
			
			if (myMoney >= checkMoney) {
				myMoney = myMoney - checkMoney;
				yourMoney = yourMoney + checkMoney;
				System.out.println("이체가 정상적으로 처리가 되었습니다.");
			} else {
				System.out.println("현재 잔액 : " + myMoney + "원");
				System.out.println("이체 금액 : " + checkMoney + "원");
				System.out.println("부족 금액 : " + (checkMoney - myMoney) + "원이 부족합니다.");
				System.out.println("이체에 실패하셨습니다.");
			}
			
		} else {
			System.out.println("계좌번호가 일치하지 않습니다.");
		}
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
	
		scan.close();
	}

}
