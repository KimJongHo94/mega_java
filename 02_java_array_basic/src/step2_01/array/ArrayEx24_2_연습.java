package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_2_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10 , 20 , 30 , 40 , 50 };
		int[] e = { 0 , 0 , 0 , 0 , 0 };
		// 예) 30 ==> e = {10 , 20 , 40 , 50 , 0};
		System.out.print("문제1) 입력 : ");
		int getNum = scan.nextInt();
		
		if (0 > getNum || getNum > d.length) {
			System.out.println("0 ~ 4 중에 입력하세요");
			return;
		}
		
		for (int i = 0; i < e.length; i++) {
			if (getNum == i) {
				continue;
			}
			
			if (i < getNum) {
				e[i] = d[i];
			} else {
				e[getNum++] = d[i];
			}
		}
		System.out.println(Arrays.toString(e) + "\n");
		
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001 , 40 , 1002 , 65 , 1003 , 70 };
		int[] g = { 0 , 0 , 0 , 0 , 0 , 0 };
		// 예) 1002 ==> {1001 , 40 , 1003 , 70 , 0 , 0};
		System.out.print("문제2) 입력 : ");
		int getBunho = scan.nextInt();
		
		int idx = 0;
		
		// 입력한 번호의 인덱스 찾기
		for (int i = 0; i < f.length; i++) {
			if (getBunho == f[i]) {
				idx = i;
			}
		}
		
		for (int i = 0; i < g.length; i++) {
			
			if (idx == i || (idx + 1) == i) {
				continue;
			}
			
			if (i < idx) {
				g[i] = f[i];
			} else {
				g[idx++] = f[i];
			}
			
		}
		
		System.out.println(Arrays.toString(g));
		System.out.println();
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10 , 20 , 30 , 40 , 50 };
		// 예)  60 ==> {20 , 30 , 40 , 50 , 60};
		System.out.print("문제3) 입력 : ");
		int getNum3 = scan.nextInt();
		
		for (int i = 0; i < h.length - 1; i++) {
			h[i] = h[i + 1];
		}
		h[h.length-1] = getNum3;
		
		System.out.println(Arrays.toString(h));
		System.out.println();
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10 , 20 , 30 , 40 , 50 };
		// 예) 60 ==> {60 , 10 , 20 , 30 , 40};
		System.out.print("문제4) 입력 : ");
		int getNum4 = scan.nextInt();
		
		// i[0] = getNum4
		// i[1] = i[0]
		// i[2] = i[1]
		
		// temp = i[0]
		// i[1] = temp
		// i[2] = i[1]
		
		for (int z = i.length - 1; z >= 1; z--) {
			i[z] = i[z - 1];
		}
		i[0] = getNum4;
		System.out.println(Arrays.toString(i));
		System.out.println();
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1 , 2 , 3 , 4 , 5 };
		int[] k = { 0 , 0 , 0 , 0 , 0 };
		//예) k => {5 , 4 , 3 , 2 , 1};
		
		idx = 0;
		
		for (int z = k.length - 1; z >= 0; z--) {
			k[idx] = j[z];
			idx++;
		}
		
		System.out.println(Arrays.toString(k));
		
		
	}

}
