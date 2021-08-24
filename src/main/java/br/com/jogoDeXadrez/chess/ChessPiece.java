package br.com.jogoDeXadrez.chess;

import br.com.jogoDeXadrez.boardGame.Board;
import br.com.jogoDeXadrez.boardGame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
