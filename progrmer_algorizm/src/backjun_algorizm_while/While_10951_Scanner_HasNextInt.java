package backjun_algorizm_while;

import java.util.Scanner;

public class While_10951_Scanner_HasNextInt {

	public static void main(String[] args) {
	
		//이 문제에서는 hasNextInt(), hasNext() 둘 중 아무거나 써도 괜찮다.
		//어차피 입력이 아예 들어오지 않기 때문에 예외가 발생하는 형태는 같기 때문이다.

		//그래도 nextInt() 를 통해 정수를 입력받고자 했으니 hasNextInt() 를 써주는게 다른 코딩할 때도 착오가 발생하지 않는다.
		//참고로 hasNextInt() 의 경우 입력값이 정수일경우 true를 반환하며 정수가 아닐경우 
		//바로 예외를 던지며 더이상의 입력을 받지 않고 hasNextInt()에서 false를 반환하면서 반복문이 종료된다.
		
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			
			System.out.println(A+B);
		}

	}

}
