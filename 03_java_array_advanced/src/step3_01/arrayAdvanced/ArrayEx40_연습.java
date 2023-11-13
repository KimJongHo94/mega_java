package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 *	# 관리비
*/

public class ArrayEx40_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		int[] floorSum = new int[apt.length];
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				floorSum[i] += pay[i][j];
			}
		}
		System.out.print("각 층별 관리비 합 : ");
		for (int i = 0; i < floorSum.length; i++) {
			System.out.print(floorSum[i] + " ");
		}
		System.out.println("\n");
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.print("호를 입력하세요 : ");
		int getHo = scan.nextInt();
		
		int getIdx01 = 0;
		int getIdx02 = 0;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (apt[i][j] == getHo) {
					getIdx01 = i;
					getIdx02 = j;
					break;
				}
			}
		}
		System.out.println("관리비 출력 : " + pay[getIdx01][getIdx02] + "원" + "\n");
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int maxPay = 0;
		int minPay = Integer.MAX_VALUE;
		
		getIdx01     = 0;
		getIdx02     = 0;
		int getIdx03 = 0;
		int getIdx04 = 0;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				
				// 관리비가 가장 많이 나온 집
				if (maxPay < pay[i][j]) {
					maxPay = pay[i][j];
					getIdx01 = i;
					getIdx02 = j;
				}
				
				// 관리비가 가장 적게 나온 집
				if (minPay > pay[i][j]) {
					minPay = pay[i][j];
					getIdx03 = i;
					getIdx04 = j;
				}
			}
		}
		System.out.println("관리비가 가장 많이 나온 집 : " + apt[getIdx01][getIdx02] + "호");
		System.out.println("관리비가 가장 적게 나온 집 : " + apt[getIdx03][getIdx04] + "호");
		System.out.println();
		
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		int temp = 0;
		
		System.out.print("첫번째 호를 입력 : ");
		int getHo01 = scan.nextInt();
		System.out.print("두번째 호를 입력 : ");
		int getHo02 = scan.nextInt();
		
		int getPay01 = 0;
		int getPay02 = 0;
		getIdx01 = 0;
		getIdx02 = 0;
		getIdx03 = 0;
		getIdx04 = 0;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				
				if (apt[i][j] == getHo01) {
					//getPay01 = pay[i][j];
					getIdx01 = i;
					getIdx02 = j;
				} else if (apt[i][j] == getHo02) {
					//getPay02 = pay[i][j];
					getIdx03 = i;
					getIdx04 = j;
				}
			}
		}
		System.out.println();
		System.out.println("Before >>");
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		temp = pay[getIdx01][getIdx02];
		pay[getIdx01][getIdx02] = pay[getIdx03][getIdx04];
		pay[getIdx03][getIdx04] = temp;
		
		System.out.println("After  >>");
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
	}

}
