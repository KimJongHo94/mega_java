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

      if (sel == 1) { // 로그인

        if (identifier == -1) {

          System.out.print("아이디 입력 : ");
          String getId = scan.next();
          System.out.print("비밀번호 입력 : ");
          String getPw = scan.next();

          if (getId != null && !getId.isEmpty() && getPw != null && !getPw.isEmpty()) {

            for (int i = 0; i < ids.length; i++) {

              if (getId.equals(ids[i]) && getPw.equals(pws[i])) {
                identifier = i;
              }

            }

            if (identifier == -1) {
              System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
            } else {
              System.out.println(ids[identifier] + "님 로그인 성공!");
            }

          } else {
            System.out.println("계정 정보를 확인해주세요.");
            continue;
          }

        } else {
          System.out.println("이미 로그인 중입니다.");
        }

      }
      else if (sel == 2) { // 로그아웃
        if (identifier != -1) {
          System.out.println("로그아웃 되었습니다.");
          identifier = -1;
        } else {
          System.out.println("로그인 상태가 아닙니다.");
        }
      }
      else if (sel == 3) { // 쇼핑
        if (identifier != -1) {

          while (true) {

            System.out.println("\n=== 상품 목록 ===\n");
            for (int i = 0; i < items.length; i++) {    // items 문자열 배열 값 보여주기
              System.out.println("[" + i + "] : " + items[i]);
            }
            System.out.println("[" + items.length + "] : " + "뒤로가기");

            System.out.print("상품번호를 선택하세요 : ");
            int choice = scan.nextInt();

            if (choice == items.length) { // 뒤로가기 눌렀을 때 벗어나기
              break;
            }

            if (0 > choice || choice > items.length) {
              System.out.println("상품번호를 확인해주세요.");
            } else {
              cart[itemCnt][0] = identifier;
              cart[itemCnt][1] = choice;

              itemCnt++;
            }
          }

        } else {
          System.out.println("로그인 중에만 가능합니다.");
        }
      }
      else if (sel == 4) { // 장바구니

        if (identifier != -1) {

          System.out.println("\n=== 장바구니 ===\n");
          System.out.println(ids[identifier] + "님");

          int apl = 0;    // 사과 개수
          int ban = 0;    // 바나나 개수
          int ber = 0;    // 딸기 개수

          for (int i = 0; i < itemCnt; i++) {
            if (cart[i][0] == identifier) {

              if      (cart[i][1] == 0) apl++;
              else if (cart[i][1] == 1) ban++;
              else if (cart[i][1] == 2) ber++;

            }
          }

          System.out.println("사과   : " + apl + "개");
          System.out.println("바나나 : " + ban + "개");
          System.out.println("딸기   : " + ber + "개");

        }
        else {
          System.out.println("로그인 중에만 가능합니다.");
        }

      }
      else if (sel == 0) {
        System.out.println("프로그램 종료");
        break;
      }

    }

    scan.close();

	}

}
