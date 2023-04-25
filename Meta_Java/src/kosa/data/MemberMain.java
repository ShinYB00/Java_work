package kosa.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MemberMain {

	public static void main(String[] args) {
		// List에 Member 객체 3개를 추가
		// Stream을 이용해서 출력해 보자
		
		List<Member> list = new ArrayList<Member>();
		
		IntStream.range(0,3).forEach(i->list.add(new Member("user" + i, 20)));
		list.stream().forEach(member -> System.out.println(member.getName()));
//		list.add(new Member("홍길동", 20));
//		list.add(new Member("박철수", 32));
//		list.add(new Member("김자바", 14));

//		Stream<Member> stream = list.stream();
		
		
	}

}
