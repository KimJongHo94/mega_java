package step6_01.classObject;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.text.DecimalFormat;
import java.util.Scanner;

class Ex11_연습 {

  String[] arAcc = new String[5];
  String[] arPw  = new String[5];
  int[] arMoney  = new int[5];

  int accCnt = 0;
  int identifier = -1;

}

public class ClassEx11_연습 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,##0");
    Ex11_연습 e = new Ex11_연습();

    // e 객체에 있는 arAcc, arPw null 초기값에서 "" 값으로 대입 반복문
    for (int i = 0; i < e.arAcc.length; i++) {
      e.arAcc[i] = "";
      e.arPw[i] = "";
    }

    while (true) {

      if (e.identifier != -1) {
        System.out.println(e.arAcc[e.identifier] + "님 로그인 중...\n");
      }

      System.out.println("=== 계정 등록 현황 ===");
      for (int i = 0; i < e.accCnt; i++) {
        System.out.println((i+1) + "번 " + e.arAcc[i]);
      }

			System.out.println("[Mega Bank]");
      System.out.println("[1]회원가입");
      System.out.println("[2]회원탈퇴");
      System.out.println("[3]로그인");
      System.out.println("[4]로그아웃");
      System.out.println("[5]입금하기");
      System.out.println("[6]이체하기");
      System.out.println("[7]잔액조회");
      System.out.println("[0]종료하기");

      System.out.print("메뉴 선택 : ");
      int sel = scan.nextInt();

      if (sel == 1) {

        if (e.identifier != -1) {
          System.out.println("[메세지]로그인 중 입니다.");
          continue;
        }

        if (e.accCnt > e.arAcc.length) {
          System.out.println("[메세지]계좌를 더 생성할 수 없습니다.");
          continue;
        }

        System.out.print("[가입]계좌번호 입력 : ");
        String acc = scan.next();

        int check = -1;

        // 등록 되어 있는 계좌번호 인지 체크 반복문
        for (int i = 0; i < e.arAcc.length; i++) {
          if (e.arAcc[i].equals(acc)) {
            check = i;
          }
        }

        if (check != -1) {
          System.out.println("[메세지]이미 등록되어 있는 계좌번호입니다.");
          continue;
        }

        System.out.print("[가입]비밀번호 입력 : ");
        String pw = scan.next();

        System.out.print("[가입]금액 입력 : ");
        int money = scan.nextInt();

        e.arAcc[e.accCnt] = acc;
        e.arPw[e.accCnt] = pw;
        e.arMoney[e.accCnt] = money;
        e.accCnt++;

      }
      else if (sel == 2) {    // 회원탈퇴

        if (e.identifier == -1) {
          System.out.println("[메세지]로그인 후에 이용이 가능합니다.");
          continue;
        }

        for (int i = e.identifier; i < e.accCnt - 1; i++) {
          e.arAcc[i] = e.arAcc[i + 1];
          e.arPw[i] = e.arPw[i + 1];
          e.arMoney[i] = e.arMoney[i + 1];
        }
        e.accCnt--;
        e.identifier = -1;
        System.out.println("[메세지]회원탈퇴가 처리되었습니다.");

      }
      else if (sel == 3) {    // 로그인

        if (e.identifier != -1) {
          System.out.println("[메세지]로그아웃 상태에서만 가능합니다.");
          continue;
        }

        System.out.print("[로그인]계좌번호 입력 : ");
        String acc = scan.next();
        System.out.print("[로그인]비밀번호 입력 : ");
        String pw = scan.next();

        for (int i = 0; i < e.accCnt; i++) {
          if (e.arAcc[i].equals(acc) && e.arPw[i].equals(pw)) {
            e.identifier = i;
          }
        }

        if (e.identifier == -1) {
          System.out.println("[메세지]일치하는 계좌번호가 없습니다.");
        }
        else {
          System.out.println("[메시지]" + e.arAcc[e.identifier] + "님 환영합니다.");
        }

      }
      else if (sel == 4) {    // 로그아웃

        if (e.identifier == -1) {
          System.out.println("[메세지]로그인 중에만 이용 가능합니다.");
          continue;
        }

        e.identifier = -1;
        System.out.println("[메세지]로그아웃 되었습니다.");

      }
      else if (sel == 5) {    // 입금하기

        if (e.identifier == -1) {
          System.out.println("[메세지]로그인 중에만 이용 가능합니다.");
          continue;
        }

        System.out.print("[입금]금액 입력 : ");
        int money = scan.nextInt();

        e.arMoney[e.identifier] += money;
        System.out.println("[메세지]입금이 정상적으로 처리가 되었습니다.");

      }
      else if (sel == 6) {    // 이체하기

        if (e.identifier == -1) {
          System.out.println("[메세지]로그인 중에만 이용 가능합니다.");
          continue;
        }

        System.out.print("[이체]계좌번호 입력 : ");
        String acc = scan.next();

        int check = -1;

        for (int i = 0; i < e.arAcc.length; i++) {
          if (e.arAcc[i].equals(acc)) {
            check = i;
          }
        }

        if (check == -1) {
          System.out.println("[메세지]일치하는 계좌가 없습니다.");
        }

        System.out.print("[이체]금액 입력 : ");
        int money = scan.nextInt();

        if (e.arMoney[e.identifier] >= money) {
          e.arMoney[e.identifier] -= money;
          e.arMoney[check] += money;

          System.out.println("[메세지]이체가 완료되었습니다.");
        }
        else {
          System.out.println("[메세지]잔액이 부족합니다.");
        }

      }
      else if (sel == 7) {    // 잔액조회

        if (e.identifier == -1) {
          System.out.println("[메세지]로그인 후에 이용 가능합니다.");
          continue;
        }

        System.out.println(e.arAcc[e.identifier] + "님의 잔액은 " + df.format(e.arMoney[e.identifier]) + "원 입니다.");

      }
      else if (sel == 0) {
        System.out.println("프로그램 종료");
        break;
      }

    }

  }
}