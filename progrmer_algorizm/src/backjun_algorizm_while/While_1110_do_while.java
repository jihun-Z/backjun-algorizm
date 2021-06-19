package backjun_algorizm_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While_1110_do_while {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int copy=N; //변수 카피 
		int count=0; //N싸이클 길이를 잴 카운트
		
		do{
			N=((N % 10 )*10) +(((N / 10) + (N % 10)) % 10);
			count++;
		}while(copy != N);
			System.out.println(count);

	}

}
