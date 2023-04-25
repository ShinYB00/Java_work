package kosa.course;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("전산 학개론");
		Course c2 = new Course("기초 통계학");
		Course c3 = new Course("빅데이터 개론");
		
		// 세부 내용까지 했을 때
//		Course c1 = new Course("전산 학개론", "전산에 대하여 정보를 배움");
//		Course c2 = new Course("기초 통계학", "통계학과 관련하여 기초적인 정보를 배움");
//		Course c3 = new Course("빅데이터 개론", "빅데이터의 역사와 정보에 대해 배움");
		
		Student s1 = new Student("1", "홍길동");
		Student s2 = new Student("2", "김철수");
		
		s1.register(c1);
		s1.register(c3);
		
		s2.register(c1);
		s2.register(c2);
		
		s1.cancel(c3);
		
//		s1.print();
//		s2.print();
		
		c1.printCourse();
		c3.printCourse();
				
			
	}

}
