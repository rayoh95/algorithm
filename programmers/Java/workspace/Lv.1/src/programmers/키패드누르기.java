package programmers;

public class 키패드누르기 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};				// 누를 번호들의 배열
		String hand = "right";				// 사용자가 왼손잡이인지 오른손잡이인지
		int leftLocation = 10;			// 왼손의 현재 위치
		int rightLocation = 12;			// 오른손의 현재 위치
		int rDistance;
		int lDistance;
		String answer = "";
		
		for (int number : numbers) {
			
			rDistance = 0;
			lDistance = 0;
			
			if (number == 1 || number == 4 || number == 7) {
				answer += "L";
				leftLocation = number;
			}
			else if (number == 3 || number == 6 || number == 9) {
				answer += "R";
				rightLocation = number;
			}
			else {	// 2, 5, 8 을 누를 때
				if (number == 0) number += 11;
				
				// 오른손과 누를 번호의 거리 - 거리를 정확히 구할 필요가 없이 왼손과의 거리를 비교하기 위함이므로 정확한 거리에 연연하지 말자.
				rDistance = (Math.abs(rightLocation-number))/3 + (Math.abs(rightLocation-number))%3;

				// 왼손과 누를 번호의 거리
				lDistance = (Math.abs(number-leftLocation))/3 + (Math.abs(number-leftLocation))%3;
				
				if (rDistance > lDistance) { 
					answer += "L"; 
					leftLocation = number;
				}
				else if (rDistance < lDistance) { 
					answer += "R";
					rightLocation = number;
				}
				else {
					if(hand.equals("right")) {
						answer += "R";
						rightLocation = number;
					}else {
						answer += "L";
						leftLocation = number;
					}
				}
			}
		}
		
		System.out.println(answer);
//		return answer;

		
		
	}
}
