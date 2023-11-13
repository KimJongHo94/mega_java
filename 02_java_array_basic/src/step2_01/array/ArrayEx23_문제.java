package step2_01.array;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0}; // accs.length(5)
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			for (int i = 0; i < accs.length; i++) {
				System.out.print(accs[i] + " ");
			}
			System.out.println();
			
			for (int i = 0; i < pws.length; i++) {
				System.out.print(pws[i] + " ");
			}
			System.out.println();
			
			System.out.println("accsCnt = " + accsCnt);
			 
 			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if		(selectMenu == 1) { // 가입
				
				System.out.print("가입하실 계좌번호를 입력해주세요 : ");
				int myAccs = scan.nextInt();
				
				boolean isValueId = false;
				
				if (accsCnt < accs.length) { // accs 배열 크기 만큼만 계정 생성 가능함
				
					for (int i = 0; i < accs.length; i++) {
						
						if (accs[i] == myAccs) {
							isValueId = false;
							break;
						} else {
							isValueId = true;
						}
					}
					
					if (isValueId != true) {
						System.out.println(myAccs + " 계좌번호는 이미 등록이 되어있습니다.");
						continue;
					} else {
						
						System.out.print("등록하실 비밀번호를 입력해주세요 : ");
						int myPws = scan.nextInt();
						
						if (myPws < 0) {
							System.out.println("비밀번호를 다시 입력해주세요");
							continue;
						} else {
							accs[accsCnt] = myAccs;
							pws[accsCnt] = myPws;
							accsCnt++;
							System.out.println("정상적으로 계좌가 생성이 되었습니다.");
						}
						
					}
					
				} else {
					System.out.println("더 이상 계좌를 생성하실 수 없습니다.");
					continue;
				}
				
			}
			else if (selectMenu == 2) { // 탈퇴
				
				if (accsCnt < 1) { // 생성된 계좌가 하나도 없다면
					System.out.println("생성된 계좌가 없습니다.");
					continue;
				}
				
				System.out.print("탈퇴하실 계좌번호를 입력하세요 : ");
				int delAccs = scan.nextInt();
				
				boolean isValueId = false;
				
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == delAccs) {
						isValueId = true;
						break; // 탈퇴할려는 계좌번호가 등록되어있는 계좌에 있으면 반복문 탈출
					} 
				}
				
				if (isValueId != true) { // 등록된 계좌 여부 확인 조건
					System.out.println("해당 계좌번호는 등록이 되어 있지 않습니다.");
					continue;
				} else {
					
					System.out.print("해당 계좌번호의 비밀번호를 입력해주세요 : ");
					int delPwd = scan.nextInt();
					
					boolean isValuePw = false;
					int delIdx = 0;
					
					for (int i = 0; i < pws.length; i++) {
						if (accs[i] == delAccs && pws[i] == delPwd) {
							isValuePw = true;
							delIdx = i;
							break;
						}
					}
					
					if (isValuePw != true) {
						System.out.println("해당 계좌번호의 비밀번호가 일치하지 않습니다.");
						continue;
					} else {
						
						// 삭제 할려는 배열 인덱스 찾고
						// 해당 데이터 0으로 초기화
						accs[delIdx] = 0;
						pws[delIdx] = 0;
						
						// 데이터 삭제 후 왼쪽으로 한칸씩 땡기기
						for (int i = 0; i < accsCnt; i++) {
							accs[i] = accs[i + 1];
							pws[i] = pws[i + 1];
						}
						
						accsCnt--;
						System.out.println("정상적으로 삭제 되었습니다.");
						
					}
					 
				}
				
			}
			else if (selectMenu == 3) { // 종료
				System.out.println("종료되었습니다.");
				isRun = false;
			}
			
		}

	}
}
