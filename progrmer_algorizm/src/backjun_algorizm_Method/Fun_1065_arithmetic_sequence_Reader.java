package backjun_algorizm_Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fun_1065_arithmetic_sequence_Reader {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));
		
		
	}
	public static int arithmetic_sequence(int num) {
		
		int count=0;
		if(num<100) {
			return num;
		}else {
			count=99;
			if(num == 1000) {//num이 1000일 경우 예외처리
				num= 999;
			}
			for(int i=100;i<=num;i++) {
				int hun= num/100;//백의 자릿수 구하기
				int ten= (i/10)%10;//십의 자릿수 구하기
				int one= i%10;
				
				if((hun - ten) == (ten -one)) {
					count++;
				}
			}
		
		}
		return count;
	}

}
