package kosa.board;

public class BoardComment {

	private String comment;
	
	public BoardComment() {}
	
	public BoardComment(String comment) {
		super();
		this.comment = comment;
	}
	
	public void show() {
		System.out.println("댓글 : " + comment);
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
