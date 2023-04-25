package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMaission {

	public static void main(String[] args) {
		// 로또 번호 1~45 중복되지 않는 정수 6개를 출력
		// 1. 배열
//		int arr[] = new int[6];
		Random r1 = new Random();
//		
//		for(int i = 0; i < 6; i++) {
//			int n = r1.nextInt(45) + 1;
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) 
//					i = i - 1;
//			}
//			
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println();
		
		
		
		
		// 2. List(ArrayList)
//		ArrayList list1 = new ArrayList<>();
//		Random r2 = new Random();
//		
//		for(int i = 1; i <= 6; i++) {
//			int n = r2.nextInt(45) + 1;
//			list1.add(n);
//		}
//		
//		System.out.println(list1);
//		System.out.println();
		
		//-----------------------
		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		while(true) {
//			int n = r1.nextInt(45) + 1;
//			if(list.contains(n)) {
//				continue;
//			} else {
//				list.add(n);
//			}
//			
//			if(list.size() == 6) break;
//		}
//		Collections.sort(list);
//		System.out.println(list);
		
		
		// 3. Set(TreeSet)
		// 기본 정렬 comparable -> compareTo() 오버라이딩
		// 필요에 따라 정렬 기준을 변경 : comparator -> compare() 오버라이딩
//		Set<Integer> set = new TreeSet<Integer>();
		Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// 내림차순으로 정렬 기준 정의
				if(o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				}
				return 0;
			}
			
		});
		
		for(int i = 0; set.size() < 6; i++) {
			set.add(r1.nextInt(45)+1);
		}
		
		System.out.println(set);
	}

}
