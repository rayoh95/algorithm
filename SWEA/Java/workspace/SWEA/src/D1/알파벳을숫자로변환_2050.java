package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳을숫자로변환_2050 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] alphabets = br.readLine().toCharArray();
		for (int i = 0; i < alphabets.length; i++) {
			int alphabetToNum = alphabets[i];
			System.out.print(alphabetToNum - 64 + " ");
		}
		
	}

}
