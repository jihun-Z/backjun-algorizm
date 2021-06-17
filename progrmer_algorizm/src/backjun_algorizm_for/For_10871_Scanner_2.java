package backjun_algorizm_for;

import java.util.Scanner;

public class For_10871_Scanner_2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<A;i++) {
			int val=sc.nextInt();
			
			if(val < B) {
				sb.append(val+" ");
			}
		}
		System.out.println(sb);
	}

}
