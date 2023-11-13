package step1_06.loop;

//# 반복문 기본문제[2단계]

public class LoopEx03_연습2 {

	public static void main(String[] args) {
		
		// 문제1) 1~10까지 반복해 3미만 7이상만 출력
		// 정답1) 1 2 7 8 9 10
		int i = 1;
		
		while (i <= 10) {
			if (3 > i || i >= 7) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		// 문제2) 문제1의 조건에 맞는 수들의 합 출력
		// 정답2) 37
		System.out.println();
		
		int sum = 0;
		i = 1;
		
		while (i <= 10) {
			if (3 > i || i >= 7) {
				sum += i;				
			}
			i++;
		}
		System.out.println("sum = " + sum);
		
		// 문제3) 문제1의 조건에 맞는 수들의 개수 출력
		// 정답3) 6
		int cnt = 0;
		i = 1;
		
		while (i <= 10) {
			if (3 > i || i >= 7) {
				cnt += 1;
			}
			i++;
		}
		System.out.println("cnt = " + cnt);
		// 문제4) 1~5까지의 합 출력
		// 정답4) 15
		int five_sum = 0;
		i = 1;
		
		while (i <= 5) {
			five_sum += i;
			i++;
		}
		System.out.println("five_sum = " + five_sum);

	}

}
