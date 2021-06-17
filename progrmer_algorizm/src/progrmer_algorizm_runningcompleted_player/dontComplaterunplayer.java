package progrmer_algorizm_runningcompleted_player;

import java.util.HashMap;
import java.util.Map.Entry;

public class dontComplaterunplayer {

	public static void main(String[] args) {
			System.out.println(solution(new String[] {"mislav","stankor","mislav","ana"},
					new String[] {"stanko","ana","mislav"}));
	}
	public static String solution(String[]participant,String[] completion) {
		
		String answer="";
		HashMap<String,Integer> map=new HashMap<>();
		
		//participant 배열의 모든값을 해시 맵에 넣어줌
		for(String part: participant) {
			//key = 문자열, value=현재 맵에 저장된 문자열 갯수에 +1
			//- getOrDefault(key, defaultValue) : map에서 찾는 Key가 없다면 defaultValue를 리턴함
			map.put(part, map.getOrDefault(part, 0)+1);
		}
		//completion 배열의 모든값을 해시맵에 넣어줌
		for(String comp: completion) {
			//같은 문자열을 찾아 value의 값을 -1해줌
			map.put(comp, map.get(comp)-1);
		}
		for(Entry<String,Integer> entry:map.entrySet()) {
			if(entry.getValue() > 0) {
				answer=entry.getKey();
				break;
			}
		}
		return answer;
	}

}
