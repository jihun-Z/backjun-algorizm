package backjun_algorizm_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class For_10871_Reader_builder {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<A;i++) {
			int random=(int)(Math.random()*100)+1;
			if(random < B) {
				sb.append(random).append(" ");
			}
			System.out.println(sb);
		}
			

		

	}

}
