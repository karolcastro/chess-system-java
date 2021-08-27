package br.com.jogoDeXadrez.application;

import br.com.jogoDeXadrez.chess.ChessException;
import br.com.jogoDeXadrez.chess.ChessMatch;
import br.com.jogoDeXadrez.chess.ChessPiece;
import br.com.jogoDeXadrez.chess.ChessPosition;

import java.security.InvalidParameterException;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();

        while (!chessMatch.getCheckMate()) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturePiece = chessMatch.performChessMove(source, target);

                if (capturePiece != null) {
                    captured.add(capturePiece);
                }

                if (chessMatch.getPromoted() != null) {
                    System.out.println("Enter piece for promotion (B/N/R/Q): ");
                    String type = sc.nextLine().toUpperCase();
                    while (!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")) {
                        System.out.println("Invalid value! Enter piece for promotion (B/N/R/Q): ");
                        type = sc.nextLine().toUpperCase();
                    }
                    chessMatch.replacePromotedPiece(type);
                }
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();

            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        UI.clearScreen();
        UI.printMatch(chessMatch, captured);
    }
}