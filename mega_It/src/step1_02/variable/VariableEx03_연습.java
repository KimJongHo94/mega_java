package step1_02.variable;

// 2023-10-27 (16:27~)
//
public class VariableEx03_연습 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력
		
		int cash = 10000;
		int snack = 2800;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		int salary = 2000000;
		double tax = salary * 3.3;
		
		System.out.println("세금은 : " + tax + "원 입니다.");
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int grade_01 = 100;
		int grade_02 = 88;
		int grade_03 = 92;
		int result1 = 0;
		
		result1 = (grade_01 + grade_02 + grade_03) / 3;
				
		System.out.println("평균은 " + result1 + "점 입니다.");
		
		
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		int under = 3;
		int high = 7;
		int result2 = 0;
		
		result2 = (under * high) / 2;
		
		System.out.println("삼각형의 넓이는 : " + result2 + "입니다.");

		//문제4) 100초를 1분 40초로 출력
		int minute = 100 / 60;
		int second = 100 % 60;
		
		System.out.println(minute + "분" + second + "초 입니다.");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원의 개수 = 1개
		//      100원의 개수 = 3개 
		int five_coin = 800 / 500;
		int one_coin  = (800 % 500) / 100;
		
		System.out.println("500원의 개수 = " + five_coin);
		System.out.println("100원의 개수 = " + one_coin);

	}

}
