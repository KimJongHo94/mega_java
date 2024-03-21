package step8_01.technique;

import accessModifierTest.AccessModifierTest;

// public class    PublicC {}   // (가능) 하나의 클래스 파일에는 하나의 public 클래스만 존재할 수 있다.
class           DefaultC {}		  // (가능) 
//protected class ProtectedC {} // (불가능) class 앞에는 public, default 접근제어자만 사용가능하다.
//private class   PrivateC {}   // (불가능) class 앞에는 public, default 접근제어자만 사용가능하다.

class Test2 extends AccessModifierTest {
	
	void printData() {
		System.out.println(publicV);		// 같은 프로젝트이므로 접근 가능
		//System.out.println(defaultV); // (불가) 다른 패키지이므로 접근 불가능
		System.out.println(protectedV); // 상속 관계이므로 접근 가능
		//System.out.println(privateV); // (불가) 다른 클래스이므로 접근 불가능
		
		publicM();		// 같은 프로젝트이므로 접근 가능
		//defaultM(); // (불가) 다른 패키지이므로 접근 불가능
		protectedM();	// 상속 관계이므로 접근 가능
		//privateM(); // (불가) 다른 클래스이므로 접근 불가능
	}
	
}

public class TechniqueEx02_02 {

	public static void main(String[] args) {

		
		
	}

}
