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

public class LoopEx10_연습2 {

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
						System.out.println(dbAcc1 + "님 환영합니다.");
					} else if (dbAcc2 == insertId && dbPw2 == insertPw) {
						identifier = 2;
						System.out.println(dbAcc2 + "님 환영합니다.");
					} else {
						System.out.println("아이디 또는 비밀번호를 확인해주세요.");
					}
					
				} else {
					System.out.println("로그인 중....");
				}
			}
			else if (sel == 2) { // 로그아웃
				if (identifier != -1) {
					identifier = -1;
					System.out.println("정상적으로 로그아웃이 되었습니다.");
				} else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if (sel == 3) { // 입금
				if (identifier != -1) {
					
					if (identifier == 1) {
						
						System.out.print("입금할 금액을 입력해주세요 : ");
						int insertMoney = scan.nextInt();
						
						if (insertMoney > 0) {
							
							dbMoney1 += insertMoney;
							System.out.println("정상적으로 입금이 되었습니다.");
							
						} else {
							System.out.println("0보다 큰 금액을 입력하세요.");
						}
						
						
					} else {
						
						System.out.print("입금할 금액을 입력해주세요 : ");
						int insertMoney = scan.nextInt();
						
						if (insertMoney > 0) {
							
							dbMoney2 += insertMoney;
							System.out.println("정상적으로 입금이 되었습니다.");
							
						} else {
							System.out.println("0보다 큰 금액을 입력하세요.");
						}
					}
					
				} else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if (sel == 4) { // 출금
				
				if (identifier != -1) {
					
					if (identifier == 1) {
						
						System.out.print("출금할 금액을 입력하세요 : ");
						int withdrawMoney = scan.nextInt();
						
						if (withdrawMoney > 0) {
							
							if (dbMoney1 >= withdrawMoney) {
								dbMoney1 -= withdrawMoney;
								System.out.println("정상적으로 출금이 되었습니다.");
							} else {
								System.out.println("소지한 금액보다 더 큰 금액을 출금하실 수 없습니다.");
							}
							
						} else {
							System.out.println("0원 보다 큰 금액을 입력하세요.");
						}
						
					} else {
						
						System.out.print("출금할 금액을 입력하세요 : ");
						int withdrawMoney = scan.nextInt();
						
						if (withdrawMoney > 0) {
							
							if (dbMoney2 >= withdrawMoney) {
								dbMoney2 -= withdrawMoney;
								System.out.println("정상적으로 출금이 되었습니다.");
							} else {
								System.out.println("소지한 금액보다 더 큰 금액을 출금하실 수 없습니다.");
							}
							
						} else {
							System.out.println("0원 보다 큰 금액을 입력하세요.");
						}
					}
					
				} else {
					System.out.println("로그인 상태가 아닙니다.");
				}
				
			}
			else if (sel == 5) { // 이체 
				
				if (identifier != -1) {
					
					System.out.print("이체할 계좌를 입력하세요 : ");
					int transId = scan.nextInt();
					
					if (identifier == 1) {
						
						if (dbAcc1 != transId) {
							
							if (dbAcc2 == transId) {
								
								System.out.print("이체하실 금액을 입력하세요 : ");
								int transMoney = scan.nextInt();
								
								if (dbMoney1 >= transMoney) {
									dbMoney1 -= transMoney;
									dbMoney2 += transMoney;
									System.out.println("정상적으로 이체가 되었습니다.");
								} else {
									System.out.println("이체하시는 금액이 소지하신 금액을 초과했습니다.");
								}
								
							} else {
								System.out.println("계좌를 확인하세요.");
							}
							
						} else {
							System.out.println("이체 대상이 본인일 수 없습니다.");
						}
						
					} else {
						if (dbAcc2 != transId) {
							
							if (dbAcc1 == transId) {
								
								System.out.print("이체하실 금액을 입력하세요 : ");
								int transMoney = scan.nextInt();
								
								if (dbMoney2 >= transMoney) {
									dbMoney2 -= transMoney;
									dbMoney1 += transMoney;
									System.out.println("정상적으로 이체가 되었습니다.");
								} else {
									System.out.println("이체하시는 금액이 소지하신 금액을 초과했습니다.");
								}
								
							} else {
								System.out.println("계좌를 확인하세요.");
							}
							
						} else {
							System.out.println("이체 대상이 본인일 수 없습니다.");
						}
					}
					
				} else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if (sel == 6) { // 조희
				if (identifier != -1) {
					
					if (identifier == 1) {
						System.out.println(dbAcc1 + "님 보유하신 금액은 : " + dbMoney1 + "원 입니다.");
					} else {
						System.out.println(dbAcc2 + "님 보유하신 금액은 : " + dbMoney2 + "원 입니다.");
					}
					
				} else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if (sel == 0) { // 종료 
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
