package programmers;

import java.util.Arrays;

public class 신고결과받기 {

	public static void main(String[] args) {
		
		String[] id_list = {"con", "ryan"};	// 유저들 리스트
		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};	// "신고한 유저 신고당한 유저", "신고한 유저 신고당한 유저", ... 
		int k = 3;				// 정지되는 누적 신고 수
		
		int[] reportedNum = new int[id_list.length];	// 각 유저별 신고당한 횟수
		int[] result = new int[id_list.length];			// 각 유저별 받은 메일 수
		
		// 신고당한 유저 찾기 -> reportedNum 채우기
		for (int i = 0; i < report.length; i++) {

			String[] temp = report[i].split(" ");
			boolean isValid = true;
			
			for (int j = 0; j < id_list.length; j++) {
				if (id_list[j].equals(temp[1])) {
					for (int l = 0; l < i; l++) {
						if (report[i].equals(report[l])) {
							isValid = false;
							break;
						}
					}
					if (isValid)	reportedNum[j]++;
				}
			}
		}
		
		// 신고당한 수를 검사해서 누적 신고수를 초과한 유저를 신고한 유저 찾기
		for (int i = 0; i < reportedNum.length; i++) {
			
			if (reportedNum[i] >= k) {
//				id_list[i] 와 report[] 를 찢은 후 신고당한 유저가 같은 신고한 유저를 ++ 하기
				for (int j = 0; j < report.length; j++) {
					
					String[] temp = report[j].split(" ");
					if (id_list[i].equals(temp[1])) {
						for (int l = 0; l< id_list.length; l++) {
							if (id_list[l].equals(temp[0])) {
								result[l]++;
							}
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(result));
//		return result;
	}

}
