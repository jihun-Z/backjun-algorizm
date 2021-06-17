package backjun_algorizm_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class For_2438_star {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		br.close();
//		Scanner sc=new Scanner(System.in);
//		int N=sc.nextInt();
		
		for(int i =1; i<= N;i++) {
			for(int j=1;j<=i;j++) {
				sb.append("*");
				//System.out.print("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
