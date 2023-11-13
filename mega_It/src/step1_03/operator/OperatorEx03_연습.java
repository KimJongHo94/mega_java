package step1_03.operator;

// 2023-10-27 (16:07 ~ 16:)
// 깨달은점, 느낀점 , 보완할점 , 성찰
public class OperatorEx03_연습 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(10000 - 2800);
		System.out.println("잔돈 = " + (10000 - 2800) + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		int salary = 2000000;
		double tax = salary * 3.3;
		
		System.out.println("세금은 " + tax + "원 입니다.");
		
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int grade1 = 100;
		int grade2 = 88;
		int grade3 = 92;
		
		double avg = (grade1 + grade2 + grade3) / 3;
		
		System.out.println("평균 점수는 " + avg + "점 입니다.");
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		int under = 3;
		int high = 7;
		
		double result = (under * high) / 2;
		System.out.println("삼각형의 넓이 : " + result);
		
		//문제4) 100초를 1분 40초로 출력
		int time = 100;
		int minute = 100 / 60;
		int second = 100 % 60;
		
		System.out.println(minute + "분" + second + "초");
		
		//문제5) 800원에서 500원짜리 개수와 100원짜리 개수 출력
		//정답5) 500원 = 1개 
		//		100원 = 3개 
		int five_coin = 800 / 500;
		int one_coin = (800 % 500) / 100;
		
		System.out.println("500원 동전 개수 " + five_coin);
		System.out.println("100원 동전 개수 " + one_coin);
		
	}

}
