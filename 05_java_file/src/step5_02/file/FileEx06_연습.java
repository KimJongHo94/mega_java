package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//파일 로드하기 : 연습문제2

public class FileEx06_연습 {

	public static void main(String[] args) {
		
		// 4번 연습문제에서 작성된 텍스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3];			// momk , megait , github
		String[] pws   = new String[3];			// 1111 , 2222   , 3333
		int[] moneys   = new int[3];			// 20000, 30000 , 40000
		
		String fileName = "fileTest02.txt";
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		if (file.exists()) {
			
			try {
				
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				for (int i = 0; i < names.length; i++) {
					String[] temp = br.readLine().split("/");
					names[i] = temp[0];
					pws[i] = temp[1];
					moneys[i] = Integer.parseInt(temp[2]);
				}
				
				System.out.println(Arrays.toString(names));
				System.out.println(Arrays.toString(pws));
				System.out.println(Arrays.toString(moneys));
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
				try {
					br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
