package backjun_algorizm_Method;

public class Fun_Test {

	long sum(int[] a) {
		
		long sum=0;// a 배열 정수 합을 담을 변수
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		return sum;
	}

}
