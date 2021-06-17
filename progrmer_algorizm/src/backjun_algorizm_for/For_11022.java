package backjun_algorizm_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class For_11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		int A,B;
		
		for(int i = 1; i<=T;i++) {
			st=new StringTokenizer(br.readLine()," ");
			A=Integer.parseInt(st.nextToken());
			B=Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": ");
			bw.write(A+" + "+B+" = "+(A+B)+"\n");
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
		
//		Scanner sc=new Scanner(System.in);
//		
//		int T=sc.nextInt();
//		
//		for(int i=1;i<=T;i++) {
//			int A=sc.nextInt();
//			int B=sc.nextInt();
//			
//			System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
//		}
//		sc.close();
//	}

}
