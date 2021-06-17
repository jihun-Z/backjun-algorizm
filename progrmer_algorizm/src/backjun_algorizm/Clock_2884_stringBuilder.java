package backjun_algorizm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Clock_2884_stringBuilder {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int H=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		StringBuilder sb=new StringBuilder();
		
		if( M < 45) {
			
			if(H < 0) {
				H=23;
				sb.append(H).append("시");
			}else {
				H--;
				sb.append(H).append("시");
			}
			M=60 - (45 - M);
			sb.append(M).append("분");
			
		}else {
			sb.append(H).append("시").append(M-45).append("분");
		}
		System.out.println(sb);
		
	}

}
