package kosa.boardservice;

public class BoardService {

	private String name;
	private Insert insert;
	
	public BoardService() {}

	public BoardService(String name, Insert insert) {
		super();
		this.name = name;
		this.insert = insert;
	}	
	
	public void insertBoard() {
		insert.insert();
	}
	
}
