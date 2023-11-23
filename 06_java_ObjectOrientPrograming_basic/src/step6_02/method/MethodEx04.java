package step6_02.method;

// 다양한 변수의 종류

class VariableEx {
	
	int a;										// 객체변수, 인스턴스변수 (객체에서 사용하는 변수)
	static int b; 						// 클래스 변수 (클래스에서 사용하는 변수)
	
	void testMethod(int c) {	// 매개 변수 (메서드로 전달되는 데이터를 받을 때 사용하는 변수)
		int d;									// 지역 변수 (메서드 내부에서 사용하는 변수)
		
		this.a = c;
	}
	
}

// this : 

public class MethodEx04 {

	public static void main(String[] args) {

	}

}
