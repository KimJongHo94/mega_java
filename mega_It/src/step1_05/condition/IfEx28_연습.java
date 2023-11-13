package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class IfEx28_연습 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("meLeft 값 입력 : ");
		int meLeft = scan.nextInt();
		System.out.print("meRight 값 입력 : ");
		int meRight = scan.nextInt();
		
		int comLeft = ran.nextInt(3);
		int comRight = ran.nextInt(3);
		
		System.out.print("어떤걸 내시겠습니까?");
		int meChoice = scan.nextInt();
		
		int meFinal = 0;
		
		if (meChoice == 1) {
			meFinal = meLeft;
		}
		if (meChoice == 2) {
			meFinal = meRight;
		}
		
		int comChoice = ran.nextInt(2) + 1;
		int comFinal = 0;
		
		// Point!!!!
		if (comChoice == 1) {
			comFinal = comLeft;
		}
		if (comChoice == 2) {
			comFinal = comRight;
		}
		
		System.out.println("comFinal = " + comFinal);
		// 0 가위, 1 바위, 2 보
		if (meFinal == 0 && comFinal == 2) {
			System.out.println("이겼습니다.");
		} else if (meFinal == 1 && comFinal == 0) {
			System.out.println("이겼습니다.");
		} else if (meFinal == 2 && comFinal == 1) {
			System.out.println("이겼습니다.");
		} else if (meFinal == comFinal) {
			System.out.println("비겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}
	}

}
