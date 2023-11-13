package step1_05.condition;

/*
 * 
 *  # 조건문 if 
 * 
 *  조건식이 true이면 실행되는 구문 ( false면 실행 x )
 *  
 *  [ 형식 ]
 *  
 *  if (조건식) {
 *  
 *  	조건식이 true일때 실행할 명령어;
 *  
 *  }
 * 
 * 
 * */

public class IfEx01 {

	public static void main(String[] args) {
   
		if (true) {
			// if문 안에 속한 명령어는 tab으로 들여쓰기한 이후에 작성한다.
			
			/*
			 * (참고) 마우스 블럭 + tab > 여러 명령어 들여쓰기
			 *        마우스 블럭 + shift + tab > 여러 명령어 역들여쓰기
			 * */
			
			System.out.println("명령어 1");
			System.out.println("명령어 2");
			System.out.println("명령어 3");
		}
		
		if (false) {
			System.out.println("명령어 4");
			System.out.println("명령어 5");
			System.out.println("명령어 6");
		}
		
		int number = 3;
		
		// if문에 속한 명령어가 1줄 이면 {}를 생략 할 수 있다.
		if (number % 2 == 0)  System.out.println("짝수");
		if (number % 2 == 1)  System.out.println("홀수");
		
	}

}
