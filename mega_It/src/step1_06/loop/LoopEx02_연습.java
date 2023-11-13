package step1_06.loop;

public class LoopEx02_연습 {
	
	public static void main(String[] args) {
		
		/*
		 * while (true인 동안) {
		 * 	반복
		 * }
		 * */
		
		int i = 1;
		
		System.out.println("증가한다");
		while (i <= 10) {
			
//			if (~한다면) {
//				~할 것이다.
//			}
//		
			if (i >= 5 && i < 9) {
				System.out.println(i + "번");
				// i++; // 조건 안에 증감식을 입력하면 while 무한루프 발생
			}
			i++;
		}
		System.out.println();
		
		i = 10;
		
		System.out.println("감소한다.");
		while (i >= 1) {
			
			if (i >= 3 && i < 6) {
				System.out.println(i + "번");
			}
			i--;
		}
		
		System.out.println();
		
		i = 1;
		
		int cnt = 0;
		
		while (i <= 10000) {
			
			if (i % 7 == 0) { // 7의 배수
				//System.out.println(i + "번");
				// cnt += 1;
				cnt++;
			}
			
			i++;
			
		}
		
		System.out.println("7의 배수 개수 : " + cnt + "개");
	}
}
