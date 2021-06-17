package backjun_algorizm_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For_2742 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		br.close();
		
		for(int i = N; i>0;i--) {
			sb.append(i+"\n");
		}
		System.out.println(sb);
		//System.out.println("while문");
		//while문 
		
//		while( N > 0) {
//			sb.append(N+"\n");
//			N--;
//		}
//		System.out.println(sb);
	}

}
