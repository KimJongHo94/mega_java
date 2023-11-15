package step4_01.string;

import java.util.Scanner;

/*
 * # 쇼핑몰 [관리자]
 * 
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * 
 * 
 * } 
 */

public class StringEx11_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCnt = 0;
		
		while(true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[4]종료");
			
			System.out.print("입력 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) { // 카테고리 관리
				
				System.out.print("카테고리 입력 : ");
				String getMain = scan.next();
				
				items[itemCnt++][0] = getMain;
				
			}
			else if (sel == 2) { // 아이템 관리
				
				if (itemCnt > 0) { 
					for (int i = 0; i < itemCnt; i++) {
						System.out.println("[" + i + "]" + items[i][0]);
					}
					
					System.out.print("카테고리를 선택하세요 : ");
					int getCheck = scan.nextInt();
					
					if (0 > getCheck || getCheck > itemCnt) {
						System.out.println("카테고리 확인해주세요");
						continue;
					}
					
					boolean isCheck = false;
					
					for (int i = 0; i < itemCnt; i++) {
						if (i == getCheck) {
							isCheck = true;
						}
					}
					if (isCheck == true) {
						
						System.out.print("추가할 아이템을 입력하세요 : ");
						String getItem = scan.next();
						
						items[getCheck][1] += getItem + "/";
						
						
					} else {
						System.out.println("해당 카테고리는 없습니다.");
						continue;
					}
					
					
					
					
					
					
				} else {
					System.out.println("카테고리를 먼저 추가하세요.");
					continue;
				}
				
				
			}
			else if (sel == 3) { // 전체품목 출력
				
				if (itemCnt > 0) {
					
					for (int i = 0; i < itemCnt; i++) {
						System.out.println("=================================");
						System.out.println("[" + i + "]" + items[i][0] + " : " + items[i][1]);
						System.out.println("=================================");
					}
					
				} else {
					System.out.println("등록된 카테고리가 없습니다.");
				}
				
			}
			else if (sel == 4) { // 종료
				System.out.println("- 종료 -");
				break;
			}
			
		}

		scan.close();

	}

}
