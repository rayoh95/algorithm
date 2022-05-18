package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 홀수만더하기_2072 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < testCase; tc++) {
			int sum = 0;
			String[] inputString = br.readLine().split(" ");
			for (int i = 0; i < inputString.length; i++) {
				int num = Integer.parseInt(inputString[i]);
				if (num % 2 != 0)	sum += num;
			}
			System.out.printf("#%d %d\n", tc + 1, sum);
		}
	}

}
