package step1_01.print;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintEx03 {

	public static void main(String[] args) {

		/*
		 * 
		 *  # 이스케이프 문자 ( escape sequence ) 
		 * 
		 * 	1) \n : 줄바꿈
		 *  2) \t : tab
		 *  3) \\ : 문자 자체 " (문법x)
		 *  4) \" : 문자 자체 " (문법x)
		 * 
		 */
		
		System.out.println("1)로그인\n2)회원가입\n3)공지사항");
		System.out.println("1)로그인\t2)회원가입\t3)공지사항");
		System.out.println("C:\\coupang\\file_img_reop");
		System.out.println("\"안녕하세요.\"");
		
		System.out.println("\n=================================\n");
		
		
		 /* 
		 *  서식 문자 출력
		 *  
		 *  1) %d : 정수
		 *  2) %f : 실수
		 *  3) %c : 단일 문자
		 *  4) %s : 문자열
		 *  
		 *  5) %.1f : 소수점 1자리 까지 출력(반올림)
		 * 	   %.2f : 소수점 2자리 까지 출력(반올림)
		 *     %.3f : 소수점 3자리 까지 출력(반올림)
		 */
		
		// System.out.printf("형식", 데이터);
		System.out.printf("%d\n", 10);
		System.out.printf("%f\n", 3.14);
		System.out.printf("%.1f\n", 3.14);
		System.out.printf("%.2f\n", 3.14);
		System.out.printf("%.3f\n", 3.14);
		System.out.printf("%c\n", '#');
		System.out.printf("%s\n", "글자");
		
		System.out.printf("이름 : %s, 총점 : %d, 평균 : %.1f\n", "홍길동", 300, 300/3.0);
		
		System.out.println("\n=================================\n");
		
		/*
		 * 
		 *  # 시간 (Timestamp)
		 *  
		 *  1) new Date()
		 *  
		 *   - 현재시간 정보를  생성한다.
		 *   
		 *  	java.util.Date > 날짜 + 시간
		 *  	java.sql.Date  > 날짜
		 *  
		 *  
		 *  2) System.currentTimeMillis()
		 *   
		 * 	- 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
		 *   - 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long으로 저장한다.
		 *   
		 *   
		 *   
		 *  # 시간 출력 형식 SimpleDateFormat
		 *   
		 *   - 날짜 및 시간 출력 서식 지정 방법은 SimpleDateFormat 객체를 사용하여 구현한다.
		 *  - SimpleDateFormat 변수명 = new SimpleDateFormat("날짜 및 시간 서식"); 형태로 객체를 생성한다.
		 *   - sdf.format(date); 메서드를 사용하여 날짜 표현식을 지정한다.
		 *   - 상세 서식은 구글에서 "simpledateformat 형식"을 검색하여 사용한다.
		 *   - 중요)날짜타입 데이터에서 글자타입으로 데이터의 형이 변환된다.
		 *   
		 */
		
		Date time1 = new Date();
		System.out.println(time1); // Mon Nov 20 15:31:48 KST 2023
		
		long time2 = System.currentTimeMillis();
		System.out.println(time2 + "\n"); // 1700462105959
		
		SimpleDateFormat time3 = new SimpleDateFormat("yyyy.MM.dd"); // MM : 월, mm : 분
		//System.out.println(time3); // java.text.SimpleDateFormat@f10928da
		
		String date1 = time3.format(time1); // format에서 Date 타입에서 -> String 타입으로 변환
		String date2 = time3.format(time2); // format에서 Date 타입에서 -> String 타입으로 변환
		
		System.out.println("date1 : " + date1); // date1 : 2023.11.20
		System.out.println("date2 : " + date2); // date2 : 2023.11.20
		System.out.println();
		
		SimpleDateFormat time4 = new SimpleDateFormat("yyyy-MM-dd"); // MM : 월, mm : 분
		//System.out.println(time3); // java.text.SimpleDateFormat@f10928da
		
		String date3 = time4.format(time1); // format에서 Date 타입에서 -> String 타입으로 변환
		String date4 = time4.format(time2); // format에서 Date 타입에서 -> String 타입으로 변환
		
		System.out.println("date3 : " + date3); // date3 : 2023-11-20
		System.out.println("date4 : " + date4); // date4 : 2023-11-20
		System.out.println();
		
		
		SimpleDateFormat time5 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초"); // MM : 월, mm : 분
		//System.out.println(time3); // java.text.SimpleDateFormat@f10928da
		
		String date6 = time5.format(time1); // format에서 Date 타입에서 -> String 타입으로 변환
		String date7 = time5.format(time2); // format에서 Date 타입에서 -> String 타입으로 변환
		
		System.out.println("date5 : " + date6); // date5 : 2023년11월20일 03시49분54초
		System.out.println("date6 : " + date7); // date6 : 2023년11월20일 03시49분54초
		System.out.println();
		
		System.out.println("\n=================================\n");
		
		/*
		 * # 숫자 형식
		 * 
		 * 1) DecimalFormat df = new DecimalFormat("숫자 서식");
		 *  - 숫자 서식은  "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여주어 표현한다.
		 *  - .format(숫자데이터); 메서드를 사용하여 숫자 출력형식을 지정한다.
		 *  - 상세 서식은 구글에서 "DecimalFormat 형식"을 검색하여 사용한다.
		 *  - 중요)숫자 타입에서 글자타입으로 데이터의 형이 변환된다.
		 *  
		 * */
		
		int salary1 = 10000;
		int salary2 = 1000000;
		int salary3 = 100000000;
		
		DecimalFormat df = new DecimalFormat("#,##0");
		String data1 = df.format(salary1);
		String data2 = df.format(salary2);
		String data3 = df.format(salary3);
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2 + "원");
		System.out.println("data3 : " + "$" + df.format(salary3));
		
	}

}
