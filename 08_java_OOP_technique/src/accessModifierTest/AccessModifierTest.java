package accessModifierTest;

class Test1 extends AccessModifierTest {
	
	void printData() {
		System.out.println(publicV);		// 같은 프로젝트이므로 접근 가능
		System.out.println(defaultV);   // 같은 패키지이므로 접근 가능
		System.out.println(protectedV); // 상속 관계이므로 접근 가능
		//System.out.println(privateV); // (불가) 다른 클래스이므로 접근 불가능
		
		publicM();		// 같은 프로젝트이므로 접근 가능
		defaultM();		// 같은 패키지이므로 접근 가능
		protectedM();	// 상속 관계이므로 접근 가능
		//privateM(); // (불가) 다른 클래스이므로 접근 불가능
	}
	
}

public class AccessModifierTest {

	public int    publicV;		// 프로젝트 접근
	int           defaultV;   // 같은 패키지 접근
	protected int protectedV; // 상속 관계 접근
	private int   privateV;   // 클래스 내부에서 접근
	
	public void    publicM() {}     // 프로젝트 접근
	void           defaultM() {}    // 같은 패키지 접근
	protected void protectedM() {}  // 상속 관계 접근
	private void   privateM() {}    // 클래스 내부에서 접근
	
}
