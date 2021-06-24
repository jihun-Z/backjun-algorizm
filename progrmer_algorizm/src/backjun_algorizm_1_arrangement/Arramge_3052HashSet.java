package backjun_algorizm_1_arrangement;

import java.util.HashSet;
import java.util.Scanner;

public class Arramge_3052HashSet {

	
	//HashSet.add() 메소드는 HashSet에 저장하는 메소드이다. 
	//처음 생성할 때 HashSet<Integer> 으로 타입을 Integer로 선언했기 때문에 int 형 또는 Integer 객체를 넣어주어야한다.
	//또한 이 메소드에서 값을 넣을 때 만약 중복되는 값이 없으면 HashSet 에 저장되면서 True 를 반환하고,
	//만약 중복되어 저장되지 않으면 False 를 반환한다.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int i=0;i<10;i++) {
			h.add(sc.nextInt() % 42);
			//입력받은 값의 나머지값을 add메서드를 통해 hashSet에 넣는다.
		}
		sc.close();
		System.out.println(h.size());
		
	}

}
