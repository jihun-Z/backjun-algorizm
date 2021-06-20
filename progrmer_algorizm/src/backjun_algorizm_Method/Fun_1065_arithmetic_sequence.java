package backjun_algorizm_Method;

import java.util.Scanner;

public class Fun_1065_arithmetic_sequence {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(arthmetic_sequence(sc.nextInt()));
		sc.close();
		
		
	}
	public static int arthmetic_sequence(int number) {
		int count=0;//한수 카운팅
		
		if(number <100) {
			return number;
		}else {
			count=99;// 수열이 100이하면 99로 초기화
			if(number == 1000) {//1000이면 에외처리 필수
				number= 999;//-999로 해서 초기화
			}
			
			for(int i=100;i<=number;i++) {
				int hun= i/100;//백의 자릿수 구하기
				int ten= (i/10)%10;//십의자릿수 구하기
				int one= i %10; //일의자릿수 구하기
				
				if((hun - ten) == (ten - one)) {//각 자릿수가  수열을 이루면 count증가
					count++;
				}
			}
		}
		return count;
	}

}
