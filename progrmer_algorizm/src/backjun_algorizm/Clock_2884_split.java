package backjun_algorizm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clock_2884_split {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] str=br.readLine().split(" ");
		
		int H=Integer.parseInt(str[0]);
		int M=Integer.parseInt(str[1]);
		
		if(M<45) {
			H--;
			System.out.println(H);
			M=60-(45-M);
			
			if(H < 0) {
				H=23;
				
			}
			System.out.println(H+"시 "+M+" 분");
		}
		else {
			System.out.println(H+" "+(M - 45));
		}

	}

}
