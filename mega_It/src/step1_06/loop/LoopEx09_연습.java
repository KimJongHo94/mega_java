package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */

public class LoopEx09_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) { // 입금
				
				System.out.print("입금 할 금액을 입력하세요 : ");
				int insertMoney = scan.nextInt();
				
				myMoney += insertMoney;
				System.out.println("입금 이후 금액 : " + myMoney + "원 입니다.");
			}
			else if (selectMenu == 2) { // 출금
				System.out.print("출금 할 금액을 입력하세요 : ");
				int withdrawMoney = scan.nextInt();
				
				if (myMoney >= withdrawMoney) {
					myMoney -= withdrawMoney;
					System.out.println("출금 이후 금액 : " + myMoney + "원 입니다.");
				} else {
					System.out.println("금액이 부족합니다.");
				}
				
				
			}
			else if (selectMenu == 3) { // 이체 
				
				System.out.print("이체 할 계좌번호를 입력하세요 : ");
				int checkAcc = scan.nextInt();
				
				if (checkAcc == yourAcc) {
					
					System.out.print("이체 할 금액을 입력해주세요 : ");
					int submitMoney = scan.nextInt();
					
					if (submitMoney > 0) {
						
						if (myMoney >= submitMoney) {
							
							myMoney -= submitMoney;
							yourMoney += submitMoney;
							
							System.out.println("이체가 정상적으로 처리가 되었습니다.");
							
						} else {
							System.out.println("현재 잔액 : " + myMoney + "원");
							System.out.println("부족한 금액 : " + (submitMoney - myMoney) + "원 입니다.");
							System.out.println("잔액이 부족합니다.");
						}
						
					}
					
				} else {
					System.out.println("이체 할 계좌번호를 다시 확인해주세요.");
				}
				
			}
			else if (selectMenu == 4) { // 조회
				
				System.out.println("본인 잔액 : " + myMoney + "원 입니다.");
				System.out.println("상대 잔액 : " + yourMoney + "원 입니다.");
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
	}

}
