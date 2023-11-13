package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) { // 로그인
				if (identifier == -1) {
					System.out.print("아이디를 입력하세요 : ");
					int insertId = scan.nextInt();
					System.out.print("비밀번호를 입력하세요 : ");
					int insertPw = scan.nextInt();
					
					if (dbAcc1 == insertId && dbPw1 == insertPw) {
						identifier = 1;
						System.out.println(dbAcc1 + "님 정상적으로 로그인 되셨습니다.");
					} else if (dbAcc2 == insertId && dbPw2 == insertPw) {
						identifier = 2;
						System.out.println(dbAcc2 + "님 정상적으로 로그인 되셨습니다.");
					} else {
						System.out.println("아이디 및 비밀번호를 확인하세요.");
					}
					
				} else {
					System.out.println("현재 로그인 중입니다.");
				}
			}
			else if (sel == 2) { // 로그아웃
				if (identifier != -1) {
					identifier = -1;
					System.out.println("정상적으로 로그아웃 되셨습니다.");
				} else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if (sel == 3) { // 입금
				if (identifier != -1) {
					if (identifier == 1) {
						System.out.print("얼마를 입금하시겠습니까? : ");
						int insertMoney = scan.nextInt();
						
						if (insertMoney > 0) {
							dbMoney1 += insertMoney;
							System.out.println("정상적으로 입금이 되셨습니다.");
						} else {
							System.out.println("금액을 확인 후 다시 시도해주세요.");
						}
					} else {
						System.out.print("얼마를 입금하시겠습니까? : ");
						int insertMoney = scan.nextInt();
						
						if (insertMoney > 0) {
							dbMoney2 += insertMoney;
							System.out.println("정상적으로 입금이 되셨습니다.");
						} else {
							System.out.println("금액을 확인 후 다시 시도해주세요.");
						}
					}
				} else {
					System.out.println("로그인 중에만 입금이 가능합니다.");
				}
			}
			else if (sel == 4) { // 출금
				if (identifier != -1) {
					
					if (identifier == 1) {
						System.out.print("출금하실 금액을 입력해주세요 : ");
						int withdrawMoney = scan.nextInt();
						
						if (withdrawMoney > 0) {
							if (dbMoney1 >= withdrawMoney) {
								dbMoney1 -= withdrawMoney;
								System.out.println("정상적으로 출금이 되셨습니다.");
							} else {
								System.out.println("소지하고 계신 금액보다 큰 금액을 입력하셨습니다.");
							}
						} else {
							System.out.println("출금하시는 금액을 0원 이상 입력해주세요.");
						}
					} else {
						System.out.print("출금하실 금액을 입력해주세요 : ");
						int withdrawMoney = scan.nextInt();
						
						if (withdrawMoney > 0) {
							if (dbMoney2 >= withdrawMoney) {
								dbMoney2 -= withdrawMoney;
								System.out.println("정상적으로 출금이 되셨습니다.");
							} else {
								System.out.println("소지하고 계신 금액보다 큰 금액을 입력하셨습니다.");
							}
						} else {
							System.out.println("출금하시는 금액을 0원 이상 입력해주세요.");
						}
					}
					
				} else {
					System.out.println("로그인 중에만 출금이 가능합니다.");
				}
			}
			else if (sel == 5) { // 이제
				if (identifier != -1) {
					if (identifier == 1) {
						System.out.print("이체하실 계좌번호를 입력하세요 : ");
						int submitAcc = scan.nextInt();
						
						if (dbAcc2 == submitAcc) {
							
							System.out.print("이체하실 금액을 입력하세요 : ");
							int submitMoney = scan.nextInt();
							
							if (dbMoney1 >= submitMoney) {
								dbMoney1 -= submitMoney;
								dbMoney2 += submitMoney;
								System.out.println("정상적으로 이체가 되셨습니다.");
							} else {
								System.out.println("보유한 금액보다 큰 금액을 입력하셨습니다.");
							}
							
						} else {
							System.out.println("계좌번호가 일치하지 않습니다.");
						}
					} else {
						System.out.print("이체하실 계좌번호를 입력하세요 : ");
						int submitAcc = scan.nextInt();
						
						if (dbAcc1 == submitAcc) {
							
							System.out.print("이체하실 금액을 입력하세요 : ");
							int submitMoney = scan.nextInt();
							
							if (dbMoney2 >= submitMoney) {
								dbMoney2 -= submitMoney;
								dbMoney1 += submitMoney;
								System.out.println("정상적으로 이체가 되셨습니다.");
							} else {
								System.out.println("보유한 금액보다 큰 금액을 입력하셨습니다.");
							}
							
						} else {
							System.out.println("계좌번호가 일치하지 않습니다.");
						}
					}
				} else {
					System.out.println("로그인 중에만 이체가 가능합니다.");
				}
			}
			else if (sel == 6) { // 조회
				if (identifier != -1) {
					if (identifier == 1) {
						System.out.println("소지하신 금액 : " + dbMoney1 + "원 입니다.");
					} else {
						System.out.println("소지하신 금액 : " + dbMoney2 + "원 입니다.");
					}
				} else {
					System.out.println("로그인 중에만 조회가 가능합니다.");
				}
			}
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
