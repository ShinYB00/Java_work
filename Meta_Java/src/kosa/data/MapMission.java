package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수를 한쌍으로 Map 자료구조로 구현하자 ex) 김자바: 80, 박자바: 90
		// 1. 시험 응시자만 출력
		// 2. 총점, 평균, 최고점수, 최저점수 : Collections => max(), min()
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int total = 0;
		int max = 0;
		int min = 0;
		
		map.put("김자바", 80);
		map.put("박자바", 90);
		map.put("유자바", 30);
		map.put("안자바", 65);
		
		// 키 값만 set에 모이게 됌
		Set<String> set = map.keySet();
		System.out.println("응시자 명단 : " + set);
		
//		Iterator<String> iter = set.iterator();
//		
//		while(iter.hasNext()) {
//			String k = iter.next();
//			total += map.get(k);
//		}
		
		// map => value만 추출
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		while(iter.hasNext()) {
			total += iter.next();
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total / map.size());
		System.out.println("최고점 : " + Collections.max(values));
		System.out.println("최저점 : " + Collections.min(values));
		
//		max = Collections.max(map.values());
//		min = Collections.min(map.values());
		
	}

}
