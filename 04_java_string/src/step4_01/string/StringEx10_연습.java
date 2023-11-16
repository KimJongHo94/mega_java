package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

    String start = "자전거";

    boolean isRun = true;
    //char temp = start.charAt(start.length() - 1);
    //System.out.println(temp); // 거

    while (isRun) {

      System.out.println("제시어 : " + start);

      // start 문자열 변수 끝 문자를 확인하기 위해 start.length() - 1 해당 문자열 크기에서 - 1 해주기
      char temp1 = start.charAt(start.length() - 1);

      System.out.print("입력 : ");
      String getStr = scan.next();

      if (getStr.equals("quit")) {
        System.out.println("=== 게임 종료 ===");
        isRun = false;
      }

      if (!getStr.isEmpty()) {
        char temp2 = getStr.charAt(0);

        if (Character.compare(temp1, temp2) == 0) {
          start = getStr;
        } else {
          continue;
        }

      }
    }
    scan.close();
		
	}

}
