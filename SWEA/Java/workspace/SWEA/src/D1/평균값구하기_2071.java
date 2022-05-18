package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평균값구하기_2071 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= testCase; tc++) {
			String[] inputString = br.readLine().split(" ");
			double sum = 0.0;
			for (int i = 0; i < inputString.length; i++)	sum += Integer.parseInt(inputString[i]);
			double avg = sum / inputString.length;
			System.out.printf("#%d %d\n", tc, Math.round(avg));
		}
	}

}


