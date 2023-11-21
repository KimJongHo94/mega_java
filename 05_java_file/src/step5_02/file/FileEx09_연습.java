package step5_02.file;


import java.util.Scanner;

//# 파일 컨트롤러[3단계] : 장바구니

public class FileEx09_연습 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",   "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		
		final int MAX_SIZE = 100;
		int[][] cart = new int[MAX_SIZE][2];

		String fileName = "jang.txt";
		
		int count = 0;
		int log = -1;
		
		while (true) {
						
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {		// 로그인
				
				if (log == -1) {
					
					System.out.println("=== 로그인 ===");
					System.out.print("[아이디] 입력 : ");
					String getId = scan.next();
					System.out.print("[비밀번호] 입력 : ");
					String getPw = scan.next();
					
					boolean isCheckLogin = false;
					
					for (int i = 0; i < ids.length; i++) {
						if (getId.equals(ids[i]) && getPw.equals(pws[i])) {
							isCheckLogin = true;
							log = i;
						}
					}
					
					if (isCheckLogin != false) {
						System.out.println(ids[log] + "님 환영합니다.");
					}
					else {
						System.out.println("[메세지]계정 정보를 확인해주세요");
					}
					
					
					
				}
				else {
					System.out.println("[메세지]로그인 중입니다.");
				}
				
			}
			else if (selectMenu == 2) {		// 로그아웃
				
				if (log != -1) {
					System.out.println("[메세지]로그아웃 되었습니다.");
					log = -1;
				}
				else {
					System.out.println("[메세지]로그인 상태가 아닙니다.");
				}
				
			}
			else if (selectMenu == 3) {		// 쇼핑
				
				if (log != -1) {
					
					System.out.println("=== 쇼핑 ===");
					for (int i = 0; i < items.length; i++) {
						System.out.println("[" + (i + 1) + "번] " + items[i]);
					}
					
					System.out.print("상품 선택 : ");
					int choice = scan.nextInt();
					
					if (1 > choice || choice > items.length - 1) {
						System.out.println("상품 1 ~ 3번 중에 선택하세요");
						continue;
					}
					else {
						cart[count][0] = log;
						cart[count][1] = choice;
						count++;
					}
					
					
				}
				else {
					System.out.println("[메세지]로그인 상태가 아닙니다.");
				}
				
			}
			else if (selectMenu == 4) {		// 장바구니
				
				if (log != -1) {
					
					for (int i = 0; i < count; i++) {
						for (int j = 0; j < cart[i].length; j++) {
							if (cart[i][0] == log) {
								System.out.println();
							}
						}
					}
					
				}
				else {
					System.out.println("[메세지]로그인 상태가 아닙니다.");
				}
				
			}
			else if (selectMenu == 5) {}
			else if (selectMenu == 6) {}
			else if (selectMenu == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
