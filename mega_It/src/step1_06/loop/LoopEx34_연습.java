package step1_06.loop;

/*
 * 
 *  # 삼각형 출력하기 (for문)
 * 
 *         1
 *        2 2 
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5
 *    6 6 6 6 6 6 
 *   7 7 7 7 7 7 7
 *  8 8 8 8 8 8 8 8
 * 9 9 9 9 9 9 9 9 9 
 * 
*/

public class LoopEx34_연습 {

	public static void main(String[] args) {
		
		int maxNum = 0;
		int k = 1;
		
		for (int i = 1; i <= 9; i++) {
			
			// 공백 출력
			// 9 -> 8 -> 7 -> 6 ... -> 1
			for (int j = 10; j > i; j--) {
				System.out.print(" ");
			}
			
			// max값 찾기
			for (int j = 1; j <= i; j++) {
				
				if (maxNum < j) {
					maxNum = j;
				}
			}
			
			// max값 개수만큼 출력
			for (k = maxNum; k < maxNum + i; k++) {
				System.out.print(maxNum + " ");
			}
			
			// 개행
			System.out.println();
		}

	}

}
