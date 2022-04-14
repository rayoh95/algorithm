package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거꾸로출력해보아요_1545 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputData = Integer.parseInt(br.readLine());
		
		for (int i = inputData; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}

}
