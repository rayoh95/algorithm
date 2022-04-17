package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아주간단한계산기_1938 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputData = br.readLine();
//		String inputData = "8 3";
		String[] nums = inputData.split(" ");
		
		int n1 = Integer.parseInt(nums[0]);
		int n2 = Integer.parseInt(nums[1]);
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		
		
	}

}
