package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//# 파일 저장하기 : 연습문제2

public class FileEx04_연습 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		String[] temp = new String[names.length];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = names[i] + "/" + pws[i] + "/" + Integer.toString(moneys[i]);
		}
		
		System.out.println(Arrays.toString(temp));
		// [momk/1111/20000, megait/2222/30000, github/3333/40000]
		
		String fileName = "fileTest02.txt";
		
		String data = "";
		
		try {
			
			fw = new FileWriter(fileName);
			
			for (int i = 0; i < temp.length; i++) {
				
				data += temp[i];
				
				if (i < temp.length - 1) {
					data += "\n";
				}
			}
			
			fw.write(data);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
