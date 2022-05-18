package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대수구하기_2068 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			int max = 0;
			String[] inputData = br.readLine().split(" ");
			int[] numData = new int[10];
			for (int j = 0; j < inputData.length; j++) {
				numData[j] = Integer.parseInt(inputData[j]);
				if (j == 0)	max = numData[j];
				else {
					if (numData[j] > max)	max = numData[j];
				}
			}
			System.out.println("#" + (i + 1) + " " + max);
		}
		
	}

}
