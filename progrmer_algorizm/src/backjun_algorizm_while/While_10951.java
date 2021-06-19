package backjun_algorizm_while;

import java.util.Scanner;

public class While_10951 {

	public static void main(String[] args) {

//		특히 hasNext(), hasNextInt() 등 이런 메소드들로 처리해도 백준에서는 문제가 해결되는 이유가 더이상 데이터를 읽을 것이 없는경우 당연히 nextInt() 에서 받는 입력이 존재하지 않아 예외를 던져준다.
//		그러나 이클립스에서 우리가 입력을 할 경우 공백이나 엔터를 치더라도 예외가 던져지는 것이 아니기 때문에
		//반복문을 종료시키려면 hasNextInt() 에서 정수가 아닌 문자열을 입력한다던가 등
		//다른 타입의 입력을 주어 InputMismatchException 을 던져주어야 한다.
		Scanner sc=new Scanner(System.in);
		
		
		while(sc.hasNextInt()) {
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}

}
