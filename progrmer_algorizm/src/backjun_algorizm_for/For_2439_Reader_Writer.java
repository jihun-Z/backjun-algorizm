package backjun_algorizm_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For_2439_Reader_Writer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		br.close();
	
		for(int i=1;i<=N;i++) {
			for(int h=1;h<=N-i;h++) {
				bw.write(" ");
			}
			for(int j=1;j<=i;j++) {
				bw.write("*");
			}
			bw.write("\n");
		
		//거꾸로 찍기 
//		for(int i=N;i>0;i--) {
//			for(int j=i;j>0;j--) {
//				bw.write("*");
//			}
//			bw.write("\n");
		}
		bw.flush();
		bw.close();
		

	}

}
