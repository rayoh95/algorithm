package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {

	public static void main(String[] args) {
		
		int[] answers = {1,2,3,4,5};
		int[] answerCnt = new int[3];
		int std1 = 0;
		int std2 = 0;
		int std3 = 0;
		int max = 0;
		
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == (i % 5) + 1) {std1++;}
			answerCnt[0] = std1;
			if (max < std1)	max = std1;
				
			if (i % 2 == 0) {
				if (answers[i] == 2) {std2++;}
			}
			else {
				if (i % 8 == 1)	{if (answers[i] == 1)	std2++;}
				if (i % 8 == 3)	{if (answers[i] == 3)	std2++;}
				if (i % 8 == 5) {if (answers[i] == 4)	std2++;}
				if (i % 8 == 7) {if (answers[i] == 5)	std2++;}
			}
			answerCnt[1] = std2;
			if (max < std2)	max = std2;
			
			if (i % 10 == 0 || i % 10 == 1)	{if (answers[i] == 3)	std3++;}
			else if (i % 10 == 2 || i % 10 == 3)	{if (answers[i] == 1)	std3++;}
			else if (i % 10 == 4 || i % 10 == 5)	{if (answers[i] == 2)	std3++;}
			else if (i % 10 == 6 || i % 10 == 7)	{if (answers[i] == 4)	std3++;}
			else	{if (answers[i] == 5)	std3++;}
			answerCnt[2] = std3;
			if (max < std3)	max = std3;
		}
		
		ArrayList<Integer> student = new ArrayList<>();
		for (int i = 0; i < answerCnt.length; i++) {
			if (max == answerCnt[i])	student.add(i+1);
		}
		
		int[] answer = new int[student.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = student.get(i);
		}
		System.out.println(Arrays.toString(answer));
		
	}

}
