package step4_01.string;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
    Random ran = new Random();

    String[] words = {"java", "mysql", "jsp", "spring"};
    boolean isRun = true;

    System.out.println("Before) " + Arrays.toString(words));

    int cnt = 0;

    while (cnt < 1000) {

      // words 문자열 배열 크기 만큼 난수 생성
      int rNum = ran.nextInt(4); // 0 ~ 3
      String temp = words[0];           // 문자열 temp 변수에 words[0] 번째 데이터 값 대입
      words[0] = words[rNum];           // words[0] 자리에 words[난수] 데이터 섞기
      words[rNum] = temp;               // words[난수]에 temp 데이터 대입
      cnt++;
    }

    System.out.println("After) " + Arrays.toString(words));

    int idx = 0;

    while (isRun) {

      System.out.println("문제 : " + words[idx]);
      System.out.print("입력 : ");
      String getStr = scan.next();

      if (getStr.equals(words[idx])) {
        cnt++;
        idx++;
      }

      if (idx == words.length) {
        System.out.println("=== 게임 종료 ===");
        isRun = false;
      }

    }
    scan.close();
	}

}
