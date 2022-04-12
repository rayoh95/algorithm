package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 간단한N의약수_1933 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputData = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= inputData; i++) {
			if (inputData % i == 0)	System.out.print(i + " ");
		}
		
		
	}

}
