package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran   = new Random();
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		
		com = ran.nextInt(3); // [0 ~ 2]
		
		System.out.print("가위(0), 바위(1), 보(2) 입력하세요 : ");
		me = scan.nextInt();
		
		if (com == me) {
			System.out.println("비겼습니다.");
		} else if (com == 0 && me == 1) {
			System.out.println("이겼습니다.");
		} else if (com == 1 && me == 2) {
			System.out.println("이겼습니다.");
		} else if (com == 2 && me == 0) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}
		
//		if (com == 0) { // 컴퓨터가 가위일 때
//			System.out.println("컴퓨터 : 가위");
//			if (me == 1) {
//				System.out.println("내가 이겼습니다.");
//			} else if (me == 2) {
//				System.out.println("내가 졌습니다.");
//			} else {
//				System.out.println("비겼습니다.");
//			}
//		} else if (com == 1) { // 컴퓨터가 바위일 때
//			System.out.println("컴퓨터 : 바위");
//			if (me == 2) {
//				System.out.println("내가 이겼습니다.");
//			} else if (me == 0) {
//				System.out.println("내가 졌습니다.");
//			} else {
//				System.out.println("비겼습니다.");
//			}
//		} else {
//			System.out.println("컴퓨터 : 보");
//			if (me == 0) {
//				System.out.println("내가 이겼습니다.");
//			} else if (me == 1) {
//				System.out.println("내가 졌습니다.");
//			} else {
//				System.out.println("비겼습니다.");
//			}
//		}
	scan.close();
	}

}
