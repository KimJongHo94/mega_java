package step1_02.variable;

// 변수의 생명주기 ( life cycle , scope )

public class VariableEx04 {

	public static void main(String[] args) {

		int x = 12;
		
		if (true) {
			int y = 7;
			System.out.println(x);
			System.out.println(y);
			//System.out.println(z);
		}
		
		if (true) {
			int z = 3;
			System.out.println(x);
			//System.out.println(y);
			System.out.println(z);
		}
		
		System.out.println(x);
		//System.out.println(y);
		//System.out.println(z);
		
	}

}
