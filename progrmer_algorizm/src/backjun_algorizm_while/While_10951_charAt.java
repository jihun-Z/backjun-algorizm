package backjun_algorizm_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class While_10951_charAt {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		String str;
		
		while((str=br.readLine()) != null) {
			
			int A=str.charAt(0) - 48;
			int B=str.charAt(2) - 48;
			
			sb.append(A+B).append("\n");
			
		}
		System.out.println(sb);
	}

}
