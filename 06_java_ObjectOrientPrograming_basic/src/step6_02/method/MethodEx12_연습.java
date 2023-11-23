package step6_02.method;

import java.util.Arrays;

class Ex12_연습 {
	
	// 1. 절대값을 리턴하는 myABS 메서드를 만드시오.
	int myABS(int param) {
		
		int result = 0;;
		
		if (param < 0) {
			result = param * -1;
		}
		else {
			result = param;
		}
		
		return result;
	}
	
	// 2. 이메일에 '@'가 있는지를 체크하는 checkEmailValidation 메서드를 만드시오.
	boolean checkEmailValidation(String email) {
				
		boolean isCheck = false;
		
		if (email.indexOf("@") != -1) isCheck = true;
		
		return isCheck;
	}
	
	// 3. 파일의 확장자를 리턴하는 getFileExtention 메서드를 만드시오.
	String getFileExtention(String fileName) {
		
		int idx = 0;
		String str = "";
		
		idx = fileName.indexOf(".");
		
		if (idx != -1) {
			str = fileName.substring(idx, fileName.length());
		}
		else {
			str = "확장자가 없습니다.";
		}
		
		return str;
	}
	
	// 4. 숫자의 제곱을 계산하여 리턴하는 myPow 메서드를 만드시오.
	int myPow(int param1 , int param2) {
		
		int cnt = 0;
		int multi = 1;
		
		while (cnt < param2) {
			
			multi *= param1;
			
			cnt++;
		}
		
		return multi;
	}
	
	// 5. 문자열에 특정 문자의 위치를 리턴하는 myIndexOf 메서드를 만드시오.
	int myIndexOf(String data , String word) {
		
		int idx = 0;
		
		for (int i = 0; i < data.length(); i++) {
			String temp = data.charAt(i) + "";
			
			if (temp.equals(word)) {
				idx = i;
			}
		}
		
		return idx;
	}
	
	// 6. 문자열에 특정 위치의 문자를 리턴하는 myCharAt 메서드를 만드시오.
	// 문자열을 문자 배열로 저장) > [안배운문법] 문자열.toCharArray()
	// 예시)                      > char[] 변수 = 문자열.toCharArray();
	char myCharAt(String data , int index) {
		
		char[] temp = data.toCharArray();
		
		char result = ' ';
		
		if (0 > index || index > temp.length) {
			result = 'X';
		}
		else {
			result = temp[index];
		}
		
		return result;
	}
	
	// 7-1. 문자열의 특정위치부터 끝까지의 잘라진 문자열을 리턴하는 mySubString1 메서드를 만드시오.
	String mySubString1(String data , int startIndex) {
		
		String result = "";
		
		for (int i = startIndex; i < data.length(); i++) {
			result += data.charAt(i);
		}
		
		return result;
	}
	
	// 7-2. 문자열의 특정위치부터 특정위치까지의 잘라진 문자열을 리턴하는 mySubString2 메서드를 만드시오.
	String mySubString2(String data , int startIndex , int endIndex) {
		
		String result = "";
		
		for (int i = startIndex; i < endIndex; i++) {
			result += data.charAt(i);
		}
		
		return result;
	}
	
	// 8. 문자열을 특정 키워드로 잘라내어 배열에 담아서 리턴하는 mySplit 메서드를 만드시오.
	String[] mySplit(String data , String sep) {
		
 		int checkCnt = 0;
		
		for (int i = 0; i < data.length(); i++) {
			
			if (!data.equals(sep) || !data.equals(" ")) {
				checkCnt += 1;
			}
		}
		
		String[] temp = new String[checkCnt];
		System.out.println(temp.length);
		int idx = 0;
		
		
		for (int i = 0; i < data.length(); i++) {
			
			if (data.equals(sep) || data.equals(" ")) {
				continue;
			}
			
			
			temp[idx] = data.charAt(i) + "";
			idx++;
			
		}
		
		return temp;
	}
	
}


public class MethodEx12_연습 {

	public static void main(String[] args) {

		
		Ex12_연습 e = new Ex12_연습();
		
		// 1. 절대값을 리턴하는 myABS 메서드를 만드시오.
		System.out.println("=== 절대값 문제 1) ===");
		System.out.println(e.myABS(3));   // 3
		System.out.println(e.myABS(-3));  // 3 
		System.out.println(e.myABS(12));  // 12 
		System.out.println(e.myABS(-12)); // 12
		System.out.println();
		
		// 2. 이메일에 '@'가 있는지를 체크하는 checkEmailValidation 메서드를 만드시오.
		System.out.println("=== @ 문자 체크 문제 2) ===");
		System.out.println(e.checkEmailValidation("qwer1234@naver.com"));    // true
		System.out.println(e.checkEmailValidation("qwer1234"));    			 // false
		System.out.println(e.checkEmailValidation("abcde@gmail.com"));    	 // true
		System.out.println(e.checkEmailValidation("abcde"));    			 // false
		System.out.println();
		
		// 3. 파일의 확장자를 리턴하는 getFileExtention 메서드를 만드시오.
		System.out.println("=== 파일 확장자 찾는 문제 3) ===");
		System.out.println(e.getFileExtention("1.jpg"));  			// jpg   
		System.out.println(e.getFileExtention("캡처.png"));  		// png  
		System.out.println(e.getFileExtention("수업자료.txt"));  		// txt  
		System.out.println(e.getFileExtention("프로젝트 제안서.pdf"));  // pdf   
		System.out.println();
		
		// 4. 숫자의 제곱을 계산하여 리턴하는 myPow 메서드를 만드시오.
		System.out.println("=== 숫자 제곱 문제 4) ===");
		System.out.println(e.myPow(3, 2));	// 9
		System.out.println(e.myPow(4, 2));	// 16
		System.out.println(e.myPow(5, 3));	// 125
		System.out.println(e.myPow(7, 3));	// 343
		System.out.println();
		
		// 5. 문자열에 특정 문자의 위치를 리턴하는 myIndexOf 메서드를 만드시오.
		System.out.println("=== 문자 위치 리턴 문제 5) ===");
		System.out.println(e.myIndexOf("just do it!", "j"));  // 0
		System.out.println(e.myIndexOf("just do it!", "s"));  // 2
		System.out.println(e.myIndexOf("just do it!", "i"));  // 8
		System.out.println(e.myIndexOf("just do it!", "!"));  // 10
		System.out.println();
		
		// 6. 문자열에 특정 위치의 문자를 리턴하는 myCharAt 메서드를 만드시오.
		// 문자열을 문자 배열로 저장) > [안배운문법] 문자열.toCharArray()
		// 예시)                      > char[] 변수 = 문자열.toCharArray();
		System.out.println("=== 특정 위치 문자 리턴 문제 6) ===");
		System.out.println(e.myCharAt("just do it!", 0));    // j
		System.out.println(e.myCharAt("just do it!", 2));    // s
		System.out.println(e.myCharAt("just do it!", 8));    // i
		System.out.println(e.myCharAt("just do it!", 10));   // !
		System.out.println();
		
		// 7-1. 문자열의 특정위치부터 끝까지의 잘라진 문자열을 리턴하는 mySubString1 메서드를 만드시오.
		System.out.println("=== 특정 위치부터 끝까지 잘라내는 문제 7) ===");
		System.out.println(e.mySubString1("200107-1234567", 2));    // 0107-1234567
		System.out.println(e.mySubString1("200107-1234567", 4));	// 07-1234567
		System.out.println(e.mySubString1("200107-1234567", 7));	// 1234567
		System.out.println(e.mySubString1("200107-1234567", 10));	// 4567
		System.out.println();
		
		// 7-2. 문자열의 특정위치부터 특정위치까지의 잘라진 문자열을 리턴하는 mySubString2 메서드를 만드시오.
		System.out.println("=== 특정위치부터 특정위치까지 잘라내는 문제 8)===");
		System.out.println(e.mySubString2("200107-1234567", 0 , 2)); // 20
		System.out.println(e.mySubString2("200107-1234567", 2 , 4)); // 01
		System.out.println(e.mySubString2("200107-1234567", 4 , 6)); // 07
		System.out.println(e.mySubString2("200107-1234567", 0 , 6)); // 200107
		System.out.println();
		
		// 8. 문자열을 특정 키워드로 잘라내어 배열에 담아서 리턴하는 mySplit 메서드를 만드시오.
		System.out.println("=== 특정 키워드로 잘라내는 문제 9) ===");
		System.out.println(Arrays.toString(e.mySplit("a,b,c", ",")));		  // [a, b, c]
		System.out.println(Arrays.toString(e.mySplit("a,b,c,e,f,g", ",")));   // [a, b, c, e, f, g]
		System.out.println(Arrays.toString(e.mySplit("a/b/c/e/f/g", "/")));   // [a, b, c, e, f, g]
		System.out.println(Arrays.toString(e.mySplit("goodsCd=1 & goodsNm=스마트 TV & goodsPrice=3000000 & orderQty=1 & ordererId=qwer1234", "&")));  // [goodsCd=1 ,  goodsNm=스마트 TV ,  goodsPrice=3000000 ,  orderQty=1 ,  ordererId=qwer1234]
		
		
	}

}
