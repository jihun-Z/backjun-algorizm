package backjun_algorizm_1_arrangement;

import java.util.Scanner;

public class Arrangement_3052_modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] arr=new int[N];
		
		int result=0;
		for(int i=0;i<N;i++) {
			arr[i] =sc.nextInt();
			
		}
		for(int value: arr) {
			
			result=value/42;
		}
		System.out.println(result);
		
		
	}

}
