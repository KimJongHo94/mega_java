package step4_01.string;

/*
 * 
 * 문제) 전체 성적(총점)이 1등인 학생 이름 출력
 * 
 *  학생 정보와 성적이 담긴 데이터 이다 
 * 	student => 1.이름 2.주소 3.번호
 *  score   => 1.번호 2.국어 3.수학 4.영어 점수
 *  
 *  
 * */

public class StringEx19_테스트문제_연습 {

	public static void main(String[] args) {
		
		// String[][] students = new String[4][3]
		String[][] students = {
								 {"제임스 고슬링" , "신촌" , "1001"}, 
								 {"스티브워즈니악" , "강남" , "1002"},
								 {"데니스리치" , "대치" , "1003"}, 
								 {"팀버너스리" , "강동" , "1004"}
							  };
		
		// String[][] scores = new String[4][4]
		String[][] scores = {
								{"1001" , "100" , "20" , "30"},
								{"1002" , "10" , "60" , "60"},
								{"1003" , "23" , "63" , "31"},
								{"1004" , "45" , "30" , "35"},
							};

//		 for (int i = 0; i < students.length; i++) {
//			 System.out.println(students[i][2]);
//		 }
		
		int maxScore = 0;
		int maxStu = 0;
		
		for (int i = 0; i < students.length; i++) {
			
			int sum = 0;
			
			for (int j = 1; j < scores[i].length; j++) {
				sum += Integer.parseInt(scores[i][j]);
			}
			if (maxScore < sum) {
				maxScore = sum;
				maxStu = i;
			}
		}
		
		System.out.println("maxScore      : " + maxScore + "점");
		System.out.println("이름 : " + students[maxStu][0]);
		System.out.println("주소 : " + students[maxStu][1]);
		System.out.println("번호 : " + students[maxStu][2]);
		//System.out.println("최고점수 학생 : " + students[maxStu][2]);

	}

}
