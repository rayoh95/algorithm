package programmers;

import java.util.ArrayList;

public class 소수만들기 {

	public static void main(String[] args) {
		
		int[] nums = {1,2,7,6,4};
		int sum = 0;
		int cnt = 0;
		// 숫자 3 개의 합이 소수이면 cnt++
		// 3 개의 합이 소수이려면 짝 짝 홀
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) { even.add(nums[i]); }
			else { odd.add(nums[i]); }
		}
		
		// 홀수를 한 개씩 순회
		for (int number : odd) {
			// 짝수 두 개의 합.
			for (int i = 0; i < even.size() - 1; i++) {
				for (int j = i + 1; j < even.size(); j++) {
					sum = (even.get(i) + even.get(j) + number);
					cnt++;
					// 소수인지 판별
					for (int k = 2; k < sum; k++) {
						if (sum % k == 0) {
							cnt--;
							break;
						}
					}
				}
			}
		}

		System.out.println(cnt);
		
	}

}
