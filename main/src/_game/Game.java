package _game;

import _pieces.*;
import _pieces._base.Piece;
import _pieces._base.PieceColor;

public class Game {

    private Board chessBoard = new Board();

    public Game(Board chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void prepareTheBoard(){
        placeTheWhitePieces();
        placeTheBlackpieces();
    }

    public void placeTheBlackpieces() {
        placePawns(PieceColor.BLACK);
        placeFigures(PieceColor.BLACK);
    }

    public void placeTheWhitePieces() {
        placePawns(PieceColor.WHITE);
        placeFigures(PieceColor.WHITE);
    }

    public void placePawns(PieceColor color){

        switch (color) {
            case BLACK:
                for (int i = 0; i < chessBoard.getChessBoard().length; i++) {
                chessBoard.getChessBoard()[i][1] = new Pawn(i,1, color); }
                break;
            case WHITE:
                for (int i = 0; i < chessBoard.getChessBoard().length; i++) {
                    chessBoard.getChessBoard()[i][6] = new Pawn(i,6, color); }
                break;
        }
    }

    public void placeFigures(PieceColor color) {
        switch (color) {
            case BLACK:
                for (int i = 0; i < chessBoard.getChessBoard().length; i++) {
                    if (i == 0 || i == 7) {
                        placeOneFigure(i,0,new Rook(i,7, color));
                    } else if (i == 1 || i == 6) {
                        placeOneFigure(i,0,new Knight(i,7, color));
                    } else if (i == 2 || i == 5) {
                        placeOneFigure(i,0,new Bishop(i,7, color));
                    } else if (i == 3) {
                        placeOneFigure(i,0,new Queen(i,7, color));
                    } else if (i == 4){
                        placeOneFigure(i,0,new King(i,7, color));
                    }
                }
            case WHITE:

                for (int i = 0; i < chessBoard.getChessBoard().length; i++) {
                    if (i == 0 || i == 7) {
                        placeOneFigure(i,7, new Rook(i,7,color));
                    } else if (i == 1 || i == 6) {
                        placeOneFigure(i,7, new Knight(i,7,color));
                    } else if (i == 2 || i == 5) {
                        placeOneFigure(i,7, new Bishop(i,7,color));
                    } else if (i == 3) {
                        placeOneFigure(i,7, new Queen(i,7,color));
                    } else if(i == 4){
                        placeOneFigure(i,7, new King(i,7,color));
                    }

                }
        }
    }

    public void placeOneFigure(int x, int y, Piece choosenPiece){
        chessBoard.getChessBoard()[x][y] = choosenPiece;
    }
}

