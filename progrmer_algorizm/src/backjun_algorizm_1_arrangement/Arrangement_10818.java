package backjun_algorizm_1_arrangement;

import java.util.Arrays;
import java.util.Scanner;

public class Arrangement_10818 {

	public static void main(String[] args) {
		//최댓값과 최솟값을 찾는 방법은
		//우리에겐 Arrays.sort() 라는 메소드가 있다.
		//이 메소드는 배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드다.
		//이 메소드를 활용하여 정렬하면 최솟값은 배열의 첫번째 원소(index 0)에,
		//최댓값은 배열의 마지막 원소(arr.length-1)에 있을테니 이를 출력하면 된다.
		Scanner sc=new Scanner(System.in);
		
		int N= sc.nextInt();
		int num;
		int[] arr=new int[N];
		
		int min,max;
		
		for(int i=0;i<arr.length;i++) {
			num=sc.nextInt();
			arr[i]=num;			
			
		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[N -1]);

	}

}
