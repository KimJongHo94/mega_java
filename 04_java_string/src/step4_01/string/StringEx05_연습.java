package step4_01.string;

import java.time.LocalDate;

public class StringEx05_연습 {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		String jumin = "890101-2012932";
		
		// 문제 1) 나이 출력
		// 정답 1) 35세
		int year = now.getYear();
		String age = "19" + jumin.substring(0, 2);
		int result = year - Integer.parseInt(age);
		//System.out.println(year); // 2023
		System.out.println("나이 : " + (result + 1) + "세");
		
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		int check = jumin.indexOf("-");
		System.out.println(check);
		char sex = jumin.charAt(check + 1);
		System.out.println(sex);
		
		switch (sex) {
			case '1': case '3':
				System.out.println("남성");
				break;
			case '2': case '4':
				System.out.println("여성");
				break;
			default:
				System.out.println("기타입니다.");
		}

	}

}
