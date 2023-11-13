package step1_06.loop;

/*
 * # 2차원 반복문
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_연습 {

	public static void main(String[] args) {
		
		int k = 10;
		
		for (int i = 1; i <= 5; i++) {
			
			if (i % 2 == 1) {
				
				for (int j = k - 9; j < k - 4; j++) {
					System.out.print(j + " ");
				}
				
			} else {
								
				for (int j = k; j > k - 5; j--) {
					System.out.print(j + " ");
				}
				k += 10;
			}
			
			System.out.println();
			
		}
		
	}

}