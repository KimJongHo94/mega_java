package step4_01.string;

import java.util.Scanner;

/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */



public class StringEx12_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int[][] cart = new int[100][2];
		
		int itemCnt = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int identifier = -1;
		
		while(true) {
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				
				if (identifier != -1) {
					System.out.println(identifier + "사용자가 로그인 중입니다.");
				}
				else {
					
					System.out.print("아이디 입력 : ");
					String getId = scan.next();
					System.out.print("비밀번호 입력 : ");
					String getPw = scan.next();
					
					for (int i = 0; i < ids.length; i++) {
						
						if (getId.equals(ids[i]) && getPw.equals(pws[i])) { // 계정 정보 확인 조건
							identifier = i;
							System.out.println("로그인 성공!");
						} else {
							System.out.println("일치하는 정보가 없습니다.");
							break;
						}
						
					}
					
				}
				
			}
			else if (sel == 2) { // 로그아웃
				if (identifier != -1) {
					identifier = -1;
					System.out.println("로그아웃 되었습니다.");
				}
				else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if (sel == 3) { // 쇼핑
				
			}
			else if (sel == 4) { // 장바구니
				
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}



	}

}
