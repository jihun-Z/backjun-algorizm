package backjun_algorizm_Method;

public class Fun_4673 {

	public static void main(String[] args) {

		
		boolean[] check=new boolean[10001];
		
		for(int i = 1;i<10001;i++) {
			int n= d(i);
			System.out.println("N:"+n);
			if(n < 10001) {// 10000이 넘는수는 저장할필요가 없음
				
				check[n]=true;
			}
		}
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<10001;i++) {
			if(!check[i]) {//false 인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) {
		int sum=number;
		
		while(number != 0) {
			sum = sum + (number % 10);//첫째 자리수 구한값에 sum값을 더해 준다.
			System.out.println("첫째자리수 : "+number%10);
			System.out.println("sum: "+sum);
			//10으로 나누어 쳣째 자리수를 없앤 나머지값을 구한다.
			// 1234 -> 123 -> 12-> 1-> 0 
			number= number/10;
		}
		
		return sum;
	}

}
