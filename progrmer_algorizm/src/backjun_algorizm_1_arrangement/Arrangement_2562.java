package backjun_algorizm_1_arrangement;

import java.util.Scanner;

public class Arrangement_2562 {

	public static void main(String[] args) {
		// for-each 구문으로 배열의 원소를 하나씩 value 에 저장한 뒤 
		//final_value 와 value 값을 비교하여 value 가 final_value 보다 크면
		//count 값과 value 값을 각각 저장한다.
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] arr=new int[N];
		int max=0;
		int index=0;
		int count=0;

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int value: arr) {
				count++;
			if(max < value ) {
				max=value;
				index=count;
				
			}
		}
		System.out.println(max+"\n"+index);
	}

}
