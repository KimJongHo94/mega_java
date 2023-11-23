package step6_02.method;


class Ex07_연습 {
	
	void printEvenOrOdd(int x) {
		if (x % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}
	void getAvgBetweenValues(int x, int y) {
		double avg = (x + y) / 2.0;
		System.out.println("평균 : " + avg + "점");
	}

	void printPrimeNums(int primeNumber) {
	
		int idx = 1;
		
		while (idx <= primeNumber) {
			
			int cnt = 0;
			
			for (int i = 1; i <= idx; i++) {
				if (idx % i == 0) {
					cnt += 1;
				}
			}
			
			if (cnt == 2) {
				System.out.println("소수 : " + idx);
			}
			
			idx++;
		}
	}
}


public class MethodEx07_연습 {

	public static void main(String[] args) {
		
		
			Ex07_연습 e = new Ex07_연습();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.getAvgBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);
		



	}

}
