package step6_02.method;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 		- 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있다.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 ) 		
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	
	// 입력값도 없고 결과값도 없는 경우
	void type00() {
		System.out.println("==================");
		System.out.println("1) 로그인");
		System.out.println("2) 로그아웃");
		System.out.println("3) 회원가입");
		System.out.println("4) 고객센터");
		System.out.println("5) 종료");
		System.out.println("==================");
	}
	// 입력값은 있고 결과값은 없는 경우
	void type10(String fileName) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName);
			fw.write("[" + fileName + "]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	// 입력값은 없고 결과값은 있는 경우
	double type01() {
		return 3.14952;
	}
	
	// 입력값과 결과값이 모두 있는 경우
	int type11(String birth) {
		String temp = birth.substring(0, 4);
		int age = 2023 - Integer.parseInt(temp) + 1;
		return age;
	}
	
}


public class MethodEx02 {

	public static void main(String[] args) {

		MethodType object = new MethodType();
		
		// 입력값도 없고 결과값도 없는 경우
		object.type00();
		
		// 입력값은 있고 결과값은 없는 경우
		object.type10("팀_버너스리.txt");
		object.type10("제임스_고슬링.txt");
		object.type10("데니스리치.txt");
		
		// (에러) 파라미터의 타입이 일치해야만 한다.
		// object.type10('C');
  	// object.type10(100);
		
	  // (에러) 파라미터의 타입이 일치해야만 한다.
		// object.type10("파일1.txt", "파일2.txt");
		// object.type10("파일1.txt", "파일2.txt", "파일3.txt");
		
		// 입력값은 없고 결과값은 있는 경우
		System.out.println();
		System.out.println("PI : " + object.type01());
		double pi = object.type01();
		System.out.println("원주율 : " + pi);
		System.out.println();
		
		System.out.println("=================\n");
		
		// 입력값과 결과값이 모두 있는 경우
		System.out.println("나이 : " + object.type11("19800101") + "살");
		//object.type11("19800101");
		int result = object.type11("19900101");
		System.out.println("나이 : " + result + "살");
		
		if (object.type11("20230101") == 1) {
			System.out.println("1살 입니다.");
		}
		
	}

}


