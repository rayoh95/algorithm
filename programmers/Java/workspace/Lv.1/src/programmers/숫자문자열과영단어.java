package programmers;

import java.util.HashMap;

public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		
		String s = "12threefour5six7";
		String answer = "";
		String pattern = "^[0-9]*$";
		String checkNum = "";
		HashMap<String,String> map = new HashMap<String,String>(){{
			put("zero", "0");
			put("one", "1");
			put("two", "2");
			put("three", "3");
			put("four", "4");
			put("five", "5");
			put("six", "6");
			put("seven", "7");
			put("eight", "8");
			put("nine", "9");
		}};
		
		// 주어진 s 가 모두 숫자로 이루어져 있다면, 그냥 answer 에 대입
		if (s.matches(pattern))	answer = s;
		else {
			// s를 한 문자씩 나누어 확인.
			for (String value : s.split("")) {
				// 그 문자가 숫자이면 answer 에 더한다.
				if (value.matches(pattern))	answer += value;
				else {
					// 문자가 숫자가 아니라면 checkNum 에 더한다.
					checkNum += value;
					// checkNum 이 map 의 key 값에 존재하는 문자열인지 확인
					for (String i : map.keySet()) {
						// 존재하는 key 값이라면 그 value 를 answer 에 대입, checkNum 빈 문자열로 초기화
						if (checkNum.equals(i)) {
							answer += map.get(i);
							checkNum = "";
						}
						// 아니라면 continue
						else	continue;
					}
				}
			}
		}
		System.out.println(answer);
	}

}