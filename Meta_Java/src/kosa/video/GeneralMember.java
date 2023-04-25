package kosa.video;

public class GeneralMember {
	
	private String id;
	private String name;
	private String address;
	// 다른 객체와의 연관을 맺기 위해 쓰임
	private Video rentalVideo;
	
	public GeneralMember() {}
	
	// 생성자 만들 때 빌린 비디오까지 넣게 되면 이 시스템은 빌린 비디오가 없으면 회원이 불가능 하기 때문에 3개만 초기화
	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	// 빌린 비디오의 정보를 가져오기 위해 메서드 생성
	// 별도의 메서드로 필요할 때만 사용하는 건 의존 관계
	public void rental(Video video) {
		rentalVideo = video;
	}
	
	public void show() {
		System.out.println("회원의 아이디 : " + id);
		System.out.println("회원의 이름 : " + name);
		System.out.println("회원의 주소 : " + address);
		rentalVideo.show();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}
