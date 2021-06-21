package backjun_algorizm_1_arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Arrangement_10818_BufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int index=0;
		int[] arr=new int[N];
		//참고로 hasMoreTokens() 는 StringTokenizer 에 토큰이 남아있으면 true, 비어있으면 false를 반환한다.
		while(st.hasMoreTokens()) {
			arr[index]=Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[N-1]);
		
	}

}
