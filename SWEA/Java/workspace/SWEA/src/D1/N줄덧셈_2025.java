package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N줄덧셈_2025 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputData = br.readLine();
		
		int sum = 0;
		int num = Integer.parseInt(inputData);
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}
