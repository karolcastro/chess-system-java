package br.com.jogoDeXadrez.application;

import br.com.jogoDeXadrez.boardGame.Board;
import br.com.jogoDeXadrez.boardGame.Position;
import br.com.jogoDeXadrez.chess.ChessMatch;
import br.com.jogoDeXadrez.chess.ChessPiece;
import br.com.jogoDeXadrez.chess.ChessPosition;

import javax.swing.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturePiece = chessMatch.performChessMove(source, target);
        }

    }
}