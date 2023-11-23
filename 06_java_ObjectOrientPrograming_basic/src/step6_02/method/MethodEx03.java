package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */
class ReturnEx {
	
	void setScore1(int score1) {
		score1 = 100;
	}
	
	int setScore2(int score2) {
		score2 = 100;
		return score2;
	}
	
	int testReturn() {
		
		System.out.println("return 전 명령어1");
		System.out.println("return 전 명령어2");
		System.out.println("return 전 명령어3");
		
		//return 1, 2, 3, 4, 5; // 복수의 return값은 불가능하므로 error가 발생한다.
		return 0;
		
		// return이 실행되는 순간 메서드가 종료되므로 아래의 명령어에서 error가 발생한다.
		//System.out.println("return 후 명령어1");
		//System.out.println("return 후 명령어2");
		//System.out.println("return 후 명령어3");
		
	}
}

public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnEx r = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출전의 성적 : " + score1);		// 87
		
		System.out.println("\n===============================\n");
		
		r.setScore1(score1);
		System.out.println("setScore1 메서드 호출후의 성적 : " + score1);		// 87
		
		System.out.println("\n===============================\n");
		
		int score2 = 87;
		
		System.out.println("메서드 호출전의 성적 : " + score2);		// 87
		
		r.setScore2(score2);
		
		System.out.println("setScore2 메서드 호출후의 성적 : " + score2); // 87
		
		score2 = r.setScore2(score2);
		
		System.out.println("setScore2 메서드 호출후 score2 변수에 담은 성적 : " + score2); // 100
		
		System.out.println("\n===============================\n");
		
	}

}
