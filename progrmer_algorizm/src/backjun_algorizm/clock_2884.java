package backjun_algorizm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class clock_2884 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		StringTokenizer st=new StringTokenizer(str," ");
		
		int H=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		if( M < 45) {
			H--; //1시간 감소
			M=60-(45-M);//분 감소 
			if(H < 0) {
				H=23;
			}
			System.out.println(H+" "+M);
		}
		else {
			System.out.println(H+" "+(M-45));
		}
		
		
		//split으로 구현하기 
	}

}
