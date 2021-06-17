package backjun_algorizm_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class For_2439_Reader_Builder {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		
//		int N=Integer.parseInt(br.readLine());
//		
//		StringBuilder sb=new StringBuilder();
//		for(int i=1; i<=N;i++) {
//			for(int j=1;j<=N-i;j++) {
//				sb.append(" ");
//			}
//			for(int h=1;h<=i;h++) {
//				sb.append("*");
//			}
//			sb.append("\n");
//		}
//		System.out.println(sb);
//
//	}

	   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int h=0;h<i;h++){
               System.out.print("*");
           }
           System.out.println();
       }
}
}
