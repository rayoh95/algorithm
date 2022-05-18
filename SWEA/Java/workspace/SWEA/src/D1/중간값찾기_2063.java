package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 중간값찾기_2063 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		
		String[] stringNums = br.readLine().split(" ");
		int[] nums = new int[len];
		for (int i = 0; i < len; i++) {
			nums[i] = Integer.parseInt(stringNums[i]);
		}
		
		for (int i = 0; i < len-1; i++) {
			for (int j = i+1; j < len; j++) {
				if(nums[i] >= nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println(nums[len/2 + 1]);
	}

}
