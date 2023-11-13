package step1_06.loop;

/*
 
 	(for문)
 
	# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제5) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx31_연습 {

	public static void main(String[] args) {
		
		int tenNum = 0;
		
		// 문제 1)
		System.out.println("문제 1)");
		Outter: for (int i = 1; i <= 9; i++) {
			
			for (int j = 9; j <= (9 * i); j += 9) {
				
				tenNum = j / 10;
				
				if (tenNum == 6) {
					System.out.println("9의 배수중 십의 자리가 6인 첫번째 배수 : "+ j);
					break Outter;
				}
				
			}
			
		}
		System.out.println();
		
		// 문제 2)
		System.out.println("문제 2)");
		int nearNum = 0;
		for (int i = 1; i <= 150; i++) {
			
			if (i % 8 == 5) {
				
				if (nearNum < i) {
					nearNum = i;
				}
				
			}
			
		}
		System.out.println("8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수 : " + nearNum);
		System.out.println();
		
		// 문제 3)
		// 50에서 100까지 자연수중에서 9의 배수는 모두 몇개
		System.out.println("문제 3)");
		
		int nineNumCnt = 0;
		
		for (int i = 50; i <= 100; i++) {
						
			if (i % 9 == 0) {
				System.out.print(i + " ");
				nineNumCnt += 1;
			}
			
		}
		System.out.println();
		System.out.println("50에서 100까지 자연수중에서 9의 배수는 " + nineNumCnt + "개");
		
		System.out.println();
		System.out.println("문제 4)");
		// 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
		
		int maxNum = 0;
		
		for (int i = 1; i < 1000; i++) {
			
			if (i % 28 == 0) {
				
				if (maxNum < i) {
					maxNum = i;
				}
				
			}
			
		}
		System.out.println("28의 배수 중에서 가장 큰 세자리 수 : " + maxNum);
		
		System.out.println();
		
		System.out.println("문제 5)");
		// 8의 배수를 작은수부터 5개 출력
		
		int minNumCnt = 0;
		
		Outter: for (int i = 0; i <= 100; i++) {
			
			if (i % 8 == 0) {
				
				if (minNumCnt == 5) {
					break Outter;
				}
				
				minNumCnt += 1;
				System.out.print(i + " ");
			}
			
		}
		
		
	}

}
