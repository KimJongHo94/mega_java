package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_문제 {

	public static void main(String[] args) {
		
		int i = 1;
		int cnt = 0;
		
		while (i <= 50) {
			
			int tenNum = i / 10;
			int oneNum = i % 10;
			
			if (tenNum == 3 || tenNum == 6 || tenNum == 9) {
				cnt += 1;
			} 
			if (oneNum == 3 || oneNum == 6 || oneNum == 9) {
				cnt += 1;
			} 
			
			if (cnt == 2) {
				System.out.println("짝짝");
			} else if (cnt == 1) {
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
			
			i++;
			cnt = 0;
		}
		
	}

}
