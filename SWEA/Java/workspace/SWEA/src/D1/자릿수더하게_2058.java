package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 자릿수더하게_2058 {

	public static void main(String[] args) throws IOException {
		
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputData = br.readLine();
		
		String[] nums = inputData.split("");
		
		for (int i = 0; i < nums.length; i++) {
			sum += Integer.parseInt(nums[i]);
		}
		
		System.out.println(sum);
	}

}
