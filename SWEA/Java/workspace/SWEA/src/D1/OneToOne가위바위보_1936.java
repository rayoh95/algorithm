package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneToOne가위바위보_1936 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputData = br.readLine();
		
		int a = Integer.parseInt(inputData.split(" ")[0]);
		int b = Integer.parseInt(inputData.split(" ")[1]);
		
		if (a == 1) {
			if (b == 3)	System.out.println("A"); 
			else System.out.println("B");
		}
		else if (a == 2) {
			if (b == 1)	System.out.println("A");
			else System.out.println("B");
		}
		else {
			if (b == 2)	System.out.println("A");
			else	System.out.println("B");
		}
		
		
	}

}
