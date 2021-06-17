package backjun_algorizm_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class For_11022CharSet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 여러분들이 실수 할 수 있는 부분이 String.charAt() 은 해당 위치의 문자를 char 로 반환
		// 만약 0이라는 문자열이 반환되면 아스키 코드값인 48이 반환된다.
		//이를 int형으로 연산하려고 하거나 문자 출력이 아닌 정수로 출력하려 하면 0 이라는 숫자가 아닌 48로 출력된다.
		//그러니 예로들어 문자 '6' 을 숫자 6 으로 바꾸고 싶다면 48을 빼주면 된다.
		//만약 몇을 빼줘야할지 모른다면 -'0' 으로 해도 된다.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=T;i++) {
			String str=br.readLine();
			int A=str.charAt(0)-'0';
			int B=str.charAt(2)-'0';
			
			sb.append("Case #").append(i+": ").append(A)
			.append(" + ").append(B).append(" = ").append(A+B).append("\n");
			
			
		}
		System.out.println(sb);

	}

}
