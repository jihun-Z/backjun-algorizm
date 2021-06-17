package backjun_algorizm_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For_8393 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		int sum=0;
		
		for(int i=1; i <=N;i++) {
			sum +=i;
		}
		System.out.println(sum);
	}

}
