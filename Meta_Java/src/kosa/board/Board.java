package kosa.board;

public class Board {
	// 상태 : 글 번호, 글 제목, 작성자, 글 내용
	// 기능 : 게시판 목록 출력, 글 세부 내용 출력
	
	private String num;
	private String title;
	private String writer;
	private String content;
	
	// 디폴트 생성자
	public Board() {}
	
	public Board(String num, String title, String writer, String content) {
		super();
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	public void boardList() {
		System.out.println("글 번호 : " + num);
		System.out.println("글 제목 : " + title);
		System.out.println("작성자 : " + writer);
	}
	
	public void boardDetail() {
		System.out.println("글 번호 : " + num);
		System.out.println("글 제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("글 내용 : " + content);
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
