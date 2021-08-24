package br.com.jogoDeXadrez.application;

import br.com.jogoDeXadrez.boardGame.Board;
import br.com.jogoDeXadrez.boardGame.Position;
import br.com.jogoDeXadrez.chess.ChessMatch;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}