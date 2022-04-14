package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 서랍의비밀번호_2043 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputData = br.readLine();
		
		int pwd = Integer.parseInt(inputData.split(" ")[0]);
		int start = Integer.parseInt(inputData.split(" ")[1]);
		int cnt = 0;
		
		for (int i = start; i <= pwd; i++) {
			cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
