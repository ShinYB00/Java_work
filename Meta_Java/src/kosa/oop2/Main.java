package kosa.oop2;

public class Main {

	public static void main(String[] args) {
		// Work => Study
		
		Work work = new Work();
		Study study = new Study();
		//Driver 
		
		// Role을 상속 받는 모든 객체는 다 사용 가능
//		Person person = new Person("홍길동", work);
		
		// 익명 내부 클래스 (단 한 번만 사용) 별도로 클래스나 파일을 만들지 않아도 사용 가능
		// Role은 추상 클래스임
		Person person = new Person("홍길동", new Role() {
			
			@Override
			public void doing() {
				System.out.println("Driver Role");
				
			}
		});
		person.doIt();

	}

}
