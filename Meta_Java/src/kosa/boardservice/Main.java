package kosa.boardservice;

public class Main {

	public static void main(String[] args) {

		OracleDao oracleDao = new OracleDao();
		MySQLDao mysqDao = new MySQLDao();
		
		BoardService boardService = new BoardService("mysql", oracleDao);
		boardService.insertBoard();
	}

}
