package backjun_algorizm_1_arrangement;

import java.util.Scanner;

public class Arrangement_2577 {

	public static void main(String[] args) {
		
		//첫 번째 for문은 0~9 까지 각각의 수를 검사할 반복문이다.
		//그리고 count 로 개수를 카운트 하기 위한 변수를 0으로 초기화 한 후, 
		//이중 for문을 통해 str의 길이만큼 모든 요소를 검사 charAt() 을 통해 해당 인덱스의 문자와 i 
		//가 같은 수가 몇개 있는지 보며 만약 같을 경우 count를 +1 증가시킨다.
		Scanner sc=new Scanner(System.in);
		int value=(sc.nextInt()*sc.nextInt()*sc.nextInt());
		
		String str=Integer.toString(value);
		
		for(int i=0;i<10;i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if((str.charAt(j) - '0') ==i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
