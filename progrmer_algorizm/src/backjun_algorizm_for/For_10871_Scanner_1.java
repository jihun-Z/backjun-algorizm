package backjun_algorizm_for;

import java.util.Scanner;

public class For_10871_Scanner_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		int arr[]=new int[A];
	
		for(int i=0;i<A;i++) {
			
			arr[i]=sc.nextInt();
		}
		for( int i=0;i< A;i++) {
			if(arr[i] < B) {
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}
