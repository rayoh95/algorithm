package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 몫과나머지출력하기_2029 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < testCase; tc++) {
			String[] inputData = br.readLine().split(" ");
			int num1 = Integer.parseInt(inputData[0]);
			int num2 = Integer.parseInt(inputData[1]);
			int share = num1 / num2;
			int remainder = num1 % num2;
			System.out.printf("#%d %d %d\n", tc+1, share, remainder);
		}
		
		
	}

}
