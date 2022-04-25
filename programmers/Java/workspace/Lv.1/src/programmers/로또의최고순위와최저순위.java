package programmers;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {

	public static void main(String[] args) {
		
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		int correctMin = 0;
		int correctMax = 0;
		int rankMin = 0;
		int rankMax = 0;
		
		for (int i = 0; i < win_nums.length; i++) {
			for (int j = 0; j < lottos.length; j++) {
				if (lottos[j] == win_nums[i]) {
					win_nums[i] = 0;
					break;
				}
			}
			if (win_nums[i] == 0)	correctMin++;
			if (lottos[i] == 0)	correctMax++;
		}
		correctMax += correctMin;
		
		switch (correctMax) {
		case 6: rankMax = 1;
				break;
		case 5: rankMax = 2;
				break;
		case 4: rankMax = 3;
				break;
		case 3: rankMax = 4;
				break;
		case 2: rankMax = 5;
				break;
		default: rankMax = 6;
		}
		
		switch (correctMin) {
		case 6: rankMin = 1;
				break;
		case 5: rankMin = 2;
				break;
		case 4: rankMin = 3;
				break;
		case 3: rankMin = 4;
				break;
		case 2: rankMin = 5;
				break;
		default: rankMin = 6;
		}
		int[] answer = {rankMax, rankMin};
		System.out.println(Arrays.toString(answer));
//        return answer;
	}

}
