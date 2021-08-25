package br.com.jogoDeXadrez.pieces;

import br.com.jogoDeXadrez.boardGame.Board;
import br.com.jogoDeXadrez.chess.ChessPiece;
import br.com.jogoDeXadrez.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMovies() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
