package kosa.video;

public class Main {

	public static void main(String[] args) {
		
		Video v1 = new Video("1", "탑건2", "톰크루즈");
		Video v2 = new Video("2", "아바타2", "모름");
		
		// 부모의 데이터 타입으로 형변환을 했기 때문에 오류가 발생하지 않음
		// 부모와 자식을 모을 수 있음
		// 한 번에 모아서 가능
		GeneralMember arr[] = {
				new GeneralMember("aa", "홍길동", "송파"),
				new SpecialMember("bb", "박길동", "강남", 0)
		};
		
		// 형변환을 했기 때문에 부모의 메소드만 호출이 가능
//		for(int i = 0; i < arr.length; i++) {
//			arr[i].show();
//		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].rental(v1);
			arr[i].show();
		}

//		GeneralMember gm1 = new GeneralMember("aaa", "홍길동", "동탄");
//		GeneralMember gm2 = new GeneralMember("bbb", "김철수", "서울");
//
//		gm1.rental(v2);
//		gm1.show();
		
//		SpecialMember sm = new SpecialMember("aa", "박길동", "강남", 0);
//		sm.rentalVideo2(v1);
//		sm.show2();

	}

}
