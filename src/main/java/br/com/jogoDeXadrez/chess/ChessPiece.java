package br.com.jogoDeXadrez.chess;

import br.com.jogoDeXadrez.boardGame.Board;
import br.com.jogoDeXadrez.boardGame.Piece;
import br.com.jogoDeXadrez.boardGame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount(){
        return moveCount;
    }

    public void increaseMoveCount() {
        moveCount++;
    }

    public void decreaseMoveCount() {
        moveCount--;
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.color != color;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }
}
