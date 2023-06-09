package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();

		list.add(new Person("홍길동", 20));
		list.add(new Person("박길동", 50));
		list.add(new Person("김길동", 60));
		list.add(new Person("성길동", 40));
		
//		Collections.sort(list);
		// compareTo로 이름 정렬 기준 변경 가능
		Collections.sort(list, new Comparator<Person>() {
			// 이름을 기준으로 오름차순
			// 음수 -> aa. compareTo(bb)
			// 양수 -> bb. compareTo(aa)
			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getName().compareTo(o2.getName()) > 0) {
					return 1;
				} else if(o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}
				return 0;
			}
		});
		
//		Collections.sort(list);
		System.out.println(list);
	}

}
