package step1_06.loop;


// # 삼각형 그리기

public class LoopEx28_연습 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		System.out.println("문제 1)");
		
		for	(int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		System.out.println();
		System.out.println("문제 2)");
		
		for (int i = 1; i <= 3; i++) {
			
			// 공백 출력
			// 2 -> 1 -> 0
			for (int j = 2; j >= i; j--) {
				System.out.print(" ");
			}
			// # 출력
			// 1 -> 2 -> 3
			for (int k = 1; k <= i; k++) {
				System.out.print("#");
			}
			System.out.println();
			
		}
		System.out.println();
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		System.out.println("문제 3)");
		
		for (int i = 1; i <= 3; i++) {
			// 3 -> 2 -> 1
			for (int j = 3; j > i - 1; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		System.out.println("문제 4)");
		
		for (int i = 1; i <= 3; i++) {
			// 공백 출력 
			// 0 -> 1 -> 2
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			// # 출력
			// 3 -> 2 -> 1
			for (int k = 3; k > i - 1; k--) {
				System.out.print("#");
			}
			
			// 개행
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
		System.out.println("문제 5)");
		
		for (int i = 1; i <= 3; i++) {
			
			// @ 출력 
			// 1 -> 2 -> 3
			for (int j = 1; j <= i; j++) {
				System.out.print("@");
			}
			
			// # 출력 
			// 2 -> 1 -> 0
			for (int k = 2; k > i - 1; k--) {
				System.out.print("#");
			}
			
			// 개행 
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		System.out.println("문제 6)");
		int k = 0;
		for (int i = 1; i <= 3; i++) {
			
			// 공백 출력 
			// 3 -> 2 -> 1
			for (int j = 3; j > i - 1; j--) {
				System.out.print(" ");
			}
			
			// # 출력 
			// 1 -> 3 -> 5
			for (int j = 1; j <= k + 1; j++) {
				System.out.print("#");
			}
			k += 2;
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		System.out.println("문제 7)");
		k = 5;
		for (int i = 1; i <= 3; i++) {
			
			// 공백 출력
			// 2 -> 3 -> 4
			for (int j = 1; j <= i + 1; j ++) {
				System.out.print(" ");
			}
			
			// # 출력
			// 5 -> 3 -> 1 
			for (int j = 1; j <= k; j++) {
				System.out.print("#");
			}
			k -= 2;
			// 개행
			System.out.println();
		}
		
	}
}
