package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 비교
 * 
 *  equals메서드를 사용하지 않고 두 문자열이 같은지 판별하는 코드를 작성해보시오.
 *  
 */

public class StringEx14_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";

    System.out.print("동물 이름을 입력하세요 : ");
    String myName = scan.next();

    int count = 0;

    if (name.length() == myName.length()) {

      // name 문자열 크기 만큼 반복
      for (int i = 0; i < name.length(); i++) {

        if (name.charAt(i) == myName.charAt(i)) {
          count++;
        }

      }

    } else {
      System.out.println("글자수가 일치하지 않습니다.");
    }

    if (count == name.length()) {
      System.out.println("동일한 문자");
    } else {
      System.out.println("다른 문자");
    }

    scan.close();

	}

}
