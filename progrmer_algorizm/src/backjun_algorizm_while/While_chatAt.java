package backjun_algorizm_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class While_chatAt {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb=new StringBuilder();

		
		while(true) {
			String str=br.readLine();
			
			int A=str.charAt(0)-48;
			int B=str.charAt(0)-48;
			
			if(A==0 && B==0) {
				br.close();
				break;
				
			}
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);
	}

}
