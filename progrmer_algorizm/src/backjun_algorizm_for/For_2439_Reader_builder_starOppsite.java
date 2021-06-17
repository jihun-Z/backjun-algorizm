package backjun_algorizm_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For_2439_Reader_builder_starOppsite {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=N;i>0;i--) {
			for(int h=1;h<=N-i;h++) {
				sb.append(" ");
			}
			for(int j=i;j>0;j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}

}
