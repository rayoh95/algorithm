package programmers;

import java.util.Arrays;

public class K번째수 {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		int idx = 0;
		
		for (int[] arr : commands) {
			int[] temp = new int[arr[1] - arr[0] + 1];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = array[arr[0] - 1 + i];
			}
			// temp 정렬하기.
			Arrays.sort(temp);
			answer[idx] = temp[arr[2] - 1];
			idx++;
		}
		System.out.println(Arrays.toString(answer));
	}

}
