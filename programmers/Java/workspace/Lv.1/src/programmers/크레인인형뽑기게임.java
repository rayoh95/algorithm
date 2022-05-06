package programmers;

import java.util.LinkedList;

public class 크레인인형뽑기게임 {

	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0},
						 {0,0,1,0,3},
						 {0,2,5,0,1},
						 {4,2,4,4,2},
						 {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		LinkedList<Integer> basket = new LinkedList<>();
		int num1, num2;
		int result = 0;

		for (int number : moves) {
			for (int j = 0; j < board[number-1].length; j++) {
				if (board[j][number-1] != 0) {
					basket.add(board[j][number-1]);
					board[j][number-1] = 0;
					break;
				}
			}
		}
		
		for (int i = 0; i < basket.size()-1; i++) {
			num1 = basket.get(i);
			num2 = basket.get(i+1);

			if (num1 == num2) {
				basket.remove(i);
				basket.remove(i);
				result += 2;
				i = 0;
			}
		}
		
		System.out.println(result);
	}

}
