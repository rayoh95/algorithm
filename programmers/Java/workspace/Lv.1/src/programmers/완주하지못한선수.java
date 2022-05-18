package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String answer = "";
		
//		List<String> completionList = new ArrayList<>(Arrays.asList(completion));
//		
//		for (String name : participant) {
//			for (int i = 0; i < completionList.size(); i++) {
//				if (name.equals(completionList.get(i))) {
//					completionList.remove(i);
//					break;
//				}
//				if (i == completionList.size() - 1) { 
//					answer = name;
//					break;
//				}
//			}
//		}
//		System.out.println(completionList.contains("eden"));
//		completionList.forEach(System.out::println);
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i = 0; 
		for (i = 0; i < completion.length; i++) { if(!participant[i].equals(completion[i])) break; }
		answer = participant[i];

		System.out.println("정답은 : " + answer);
		
	}

}
