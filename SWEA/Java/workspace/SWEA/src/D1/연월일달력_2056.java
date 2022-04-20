package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연월일달력_2056 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= testCase; tc++) {
			String date = br.readLine();
			// 22220202
			date = date.substring(0,4) + "/" + date.substring(4,6) + "/" + date.substring(6,8);
			// 2222/02/02
			int month = Integer.parseInt(date.substring(5,7));
			int day = Integer.parseInt(date.substring(8,10));
			if (month <= 0 || month > 12) {
				System.out.printf("#%d -1\n", tc);
			}
			else {
					if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
						if (day <= 0 || day > 31)	System.out.printf("#%d -1\n", tc);
						else	System.out.printf("#%d %s\n", tc, date);
					}
					else if (month == 2) {
						if (day <= 0 || day > 28)	System.out.printf("#%d -1\n", tc);
						else	System.out.printf("#%d %s\n", tc, date);
					}
					else {
						if (day <= 0 || day > 30)	System.out.printf("#%d -1\n", tc);
						else	System.out.printf("#%d %s\n", tc, date);
					}
			}
			
		}
	}

}
