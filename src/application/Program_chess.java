package application;

import chess.ChessMatch;

public class Program_chess {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getpieces());

	}

}
