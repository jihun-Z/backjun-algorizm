package backjun_algorizm_while;

import java.util.Scanner;

public class While_1110_Scanner {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		
		
		int N=sc.nextInt();
		int copy=N;// 변수 복사 
		int count=0;//카운트
		
		//T의 십의자리수 구하기
		int T=(N%10)*10;
		//M의 일의자리수 구하기
		int M=(N/10 +N%10)%10;
		System.out.println(T);
		System.out.println(M);
		
		while(true) {
			N=((N%10)*10 )+ (((N / 10)+(N % 10)) %10);
			count++;
			System.out.println("N:"+N);
			if(copy == N) {
				break;
			}
			
		}
		System.out.println("Copy"+copy);
		System.out.println(count);
	}

}
