package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 스탬프찍기_2046 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			int num = Integer.parseInt(s);
			for (int i = 0; i < num; i++) {
				System.out.print('#');
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
