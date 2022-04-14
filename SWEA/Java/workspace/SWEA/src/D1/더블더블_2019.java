package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더블더블_2019 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputData = Integer.parseInt(br.readLine());
		int startNum = 1;
		
		for (int i = 0; i <= inputData; i++) {
			System.out.print(startNum + " ");
			startNum *= 2;
		}
		
	}

}
