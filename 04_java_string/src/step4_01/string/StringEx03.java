package step4_01.string;

import java.util.Arrays;

/* 
 * # 문자열 관련 메서드
 * 
 * 1. 문자열.length() 							: 문자열의 길이를 반환한다. (반환타입은 int)
 * 2. 문자열.indexOf("문자열") 					: 특정문자열이 포함된 위치를 반환한다.  (반환타입은 int)
 * 3. 문자열.charAt(?번째)      				: 문자열의 ?번째에에 포함된 데이터를 반환한다. (반환 타입은 char)
 * 4. 문자열.substring(index1이상, index2미만)  : 특정문자열의 index1이상 index2미만의 문자열을 잘라서 반환한다. (반환타입은 String)
 *    문자열.substring(index1)  				: 특정문자열의 index1이상부터 끝까지의 문자열을 잘라서 반환한다. (반환타입은 String)
 * 5. 문자열.split("구분자")					: 구분자로 문자열을 잘라서 반환한다. (반환타입은 String 배열)
 * 
 */

public class StringEx03 {

	public static void main(String[] args) {
		
		String str = "megait";
		System.out.println(str);
		System.out.println("\n================\n");
		
		// [1] length() : 문자열의 길이
		System.out.println("str.length : " + str.length()); // 6
		
		System.out.println("\n================\n");
		
		// [2] indexOf("글자") : 글자가 포함된 인덱스 확인
		System.out.println("str.indexOf(index) : " + str.indexOf("m")); // 0
		System.out.println("str.indexOf(index) : " + str.indexOf("e")); // 1
		System.out.println("str.indexOf(index) : " + str.indexOf("g")); // 2
		System.out.println("str.indexOf(index) : " + str.indexOf("a")); // 3
		System.out.println("str.indexOf(index) : " + str.indexOf("i")); // 4
		System.out.println("str.indexOf(index) : " + str.indexOf("t")); // 5
		
		System.out.println("\n================\n");
		
		// 찾는 데이터가 없을 경우 return = -1;
		System.out.println("str.indexOf(자바) : " + str.indexOf("@")); // -1 
	
		// [3] charAt(index) : 문자 한개 추출 (인덱싱)
		System.out.println("str.charAt(2) : " + str.charAt(2)); // g
		System.out.println("str.charAt(3) : " + str.charAt(3)); // a
		
		// (중요) charAt 메서드의 return 타입은 char 타입이다.
		char c = str.charAt(2);
		System.out.println(c); // g
		System.out.println(str.charAt(str.length() - 1)); // t
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("\n================\n");
		// [4] substring() : 문자 여러개 추출 (슬라이싱)
		// 4-1) substring(index1이상, index2미만)
		System.out.println(str.substring(0, str.length())); // (0, 4) -> 0 ~ 3 mega 
		System.out.println(str.substring(4, 6)); // it
		
		String test = str.substring(4, 6);
		System.out.println("String test : " + test);
		// 4-2) substring(index1부터 끝까지)
		
		System.out.println("str.substring(index) : " + str.substring(1)); 
		// 인덱스 입력한 값 부터 끝까지 문자열 추출
		// substring(0) : megait
		// substring(1) : egait
		
		System.out.println("\n================\n");
		// [5] split("구분자") : 구분자로 잘라내기
		String str2 = "a/b/c/d/e/f/g";
		String str3 = "aa&bb&cc";
		String str4 = "aaa.bbb.ccc.ddd.eee";
		
		String[] temp = str2.split("/");
		
		System.out.println("temp.length : " + temp.length); // 7
		System.out.println("temp : " + Arrays.toString(temp)); // temp : [a, b, c, d, e, f, g]
		
		temp = str3.split("&");
		
		System.out.println("temp.length : " + temp.length);
		System.out.println("temp : " + Arrays.toString(temp));
		
		//temp = str4.split("."); // .(닷)은 예외사항
		temp = str4.split("\\."); // .(닷)은 \\ 같이 사용해야함 (이스케이프 문자로 구현)
		
		System.out.println("temp.length : " + temp.length);
		System.out.println("temp : " + Arrays.toString(temp));
		
		// 참고) 문자열 비교 : compareTo()
		
	}

}
