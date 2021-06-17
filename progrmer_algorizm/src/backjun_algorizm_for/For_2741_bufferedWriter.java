package backjun_algorizm_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For_2741_bufferedWriter {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		
		br.close();
		while(N>0) {
			bw.write(N+"\n");
			N--;
		}
		bw.flush();
		bw.close();
		
		
	}

}
