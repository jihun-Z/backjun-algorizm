package codeUP_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("입력하세요.");
		//1019번 문제
		// 입력 2013.8.5
//		String time=sc.nextLine();
//		System.out.println("입력하세요:"+time);
//		String [] arr=time.split("[.]");
//		System.out.printf("%04d.%02d.%02d",Integer.parseInt(arr[0]),
//				Integer.parseInt(arr[1]),
//				Integer.parseInt(arr[2]));
//		
		
//	     //입력받은 주민번호 형식을 -로 구분해서 잘라준다 1020
//		String num=sc.nextLine();
//      StringTokenizer st = new StringTokenizer(num,"-");
//       
//      String result = "";
//        while(st.hasMoreTokens()) {
//            //result에 잘라둔 문자열을 붙인다
//            result+=st.nextToken();    
//        }
//        System.out.println(result);
//		
		
		//21
//		String s=sc.nextLine();
//		System.out.println(s);
//		String f=sc.nextLine();
//		StringTokenizer st=new StringTokenizer(f,".");
//		String[] fc=new String[2];
//		int i=0;
//		while(st.hasMoreTokens()) {
//			fc[i]=st.nextToken();
//			i++;
//		}
//		System.out.println(fc[0]+"\n"+fc[1]);
//		
		//1024
//		String s=sc.nextLine();
//		String [] sr=s.split("");
//		for(int i=0; i<sr.length;i++) {
//			System.out.println(sr[i]);
//		}
//		
		//charAT함수를 활용하여 char배열에 하나씩저장하기
		
//		String s=sc.nextLine();
//		char[] arr=new char[s.length()];//스트링을 담을 배열
//		for(int i=0;i<arr.length;i++) {
//		arr[i]=(s.charAt(i));//스트링을  한글자씩끊어 저장
//			System.out.println(arr[i]);
//		}
		
		//단어 한가운데만 출력하기
//		String s=sc.nextLine();
//		String [] arr= new String[s.length()];//스트링담을 배열생성
//		String result;
//		for(int i=0;i<arr.length;i++) {//스트링을 한글자씩끊어 저장
//			arr[i]=Character.toString(s.charAt(i));
//		}
//		if(arr.length%2 == 0) {
//			result=arr[(arr.length/2)-1]+arr[(arr.length/2)];
//		}else {
//			result=arr[(arr.length/2)];
//		}
//		System.out.println(result);
		
		//가운데 글자출력하기예제
//		String word=sc.nextLine();
//		System.out.println(word.substring((word.length()-1)/2, word.length()/2 + 1));
	
	//단어거꾸로 출력하기
		
//		String word=sc.nextLine();
//		String [] s=new String[word.length()];
//		
//		String result="";
//		for(int i=0;i<word.length();i++) {
//			s[i]=Character.toString(word.charAt(i));
//		}
//		for(int i=s.length-1;i>=0;i--) {
//			result+=s[i];
//		}
//		System.out.println(result);
		
//		//별찍기 예제
//		int T =sc.nextInt();
//		System.out.println(""+T);
//	int N=sc.nextInt();
//		System.out.println(""+N);
//		for(int i =0;i<T;i++) {
//			
//			for(int j=0;j<i;j++) {
//				if(i<j) {
//					
//					System.out.print("");
//				}
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		//피라미드 별찍기
//		for(int i=0;i<4;i++) {
//		for(int j=0;j<3-i;j++) {
//			System.out.print(" ");
//		}
//		for(int j=0;j<2*i+1;j++) {
//			System.out.print("*");
//		}
//		System.out.println("");
//		}
//		
//		//다이아몬드 별찍기
//		int s=sc.nextInt();
//		System.out.println(s);
//		for(int i=0;i<s;i++) {
//			for(int j=0;j<s;j++) {
//				if(i<=s/2) {
//					//위쪽영역
//					if(i+j<=s/2-1) //왼쪽위공백찍기
//						System.out.print(" ");
//						
//					else if(j-i>=s/2+1)//오른쪽 위 공백찍기
//						System.out.print(" ");
//					else
//						System.out.print("*");//별찍기
//				}
//				else if( i>s/2)//아래쪽영역
//				{
//					if(i-j>=s/2+1)
//					System.out.print(" ");//왼쪽 밑 공백
//					else if (i+j>=s/2*3+1)//오른쪽밑 공백
//						System.out.print(" ");
//					else 
//						System.out.print("*");
//				}
//				
//			}
//			System.out.println();//줄바꿈
//		}
//		
//	}
		
		
		List<String> tmp = new ArrayList<String>();
		tmp.add("making sure there's something here");
		tmp.add("and again...just for the heck of it");
		for(String x : tmp) {
		    System.out.println(x);
		}
		
		ArrayList<String> arrayList= new ArrayList<>();
		arrayList.add("test1");
		arrayList.add("test2");
		arrayList.add("test3");
		
//		String[] array=new String[arrayList.size()];
//		int size=0;
//		for(String string: arrayList) {
//			array[size++] = string;
//			System.out.println("답"+array.toString());
//		}
		
		String[] array=arrayList.toArray(new String[arrayList.size()]);
		
		System.out.println(""+array);
		
		//예시는 String으로 했지만, 모든 자료형이 가능하다. 중요한건 바꿀 자료구조끼리 자로형이 같아야한다.
//		int [] arr=new int[3];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		
//		Car c= new Car();
//		Car d=new Car();
//		Car t=new Car();
//		c.setNum1(1);
//		c.setNum2(2);
//		c.setNum3(3);
//		
//		d.setNum1(4);
//		d.setNum2(5);
//		d.setNum3(6);
//		
//		t.setNum1(7);
//		t.setNum2(8);
//		t.setNum3(9);
//		ArrayList<Car> array= new ArrayList<Car>();
//		ArrayList<Car>arr1=new ArrayList<Car>();
//		array.add(d);
//		array.add(c);
//		array.add(t);
//		System.out.println(""+array);
//		for(Car s: array) {
//			Car car=new Car();
//			car.setNum1(s.getNum1());
//			car.setNum2(s.getNum2());
//			car.setNum3(s.getNum3());
//			System.out.println("car "+car);
//			arr1.add(s);
//		}
//		System.out.println("arr1:"+arr1);
//		
	}
}

