package step1_05.condition;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */


public class IfEx09_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int parentCheck = 0;
		
		System.out.print("키를 입력하세요 : ");
		int tall = scan.nextInt();
		
		
		if (tall >= 120) {
			System.out.println("입장 가능");
		} else {
			System.out.println("부모님과 같이 입장을 했습니까?");
			parentCheck = scan.nextInt();
			
			if (parentCheck == 1) {
				System.out.println("부모님과 함께 오셨군요. 입장 가능");
			} else {
				System.out.println("입장 불가");
			}
		}
		scan.close();
	}

}
