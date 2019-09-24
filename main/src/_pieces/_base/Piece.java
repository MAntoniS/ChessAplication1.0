package _pieces._base;


import _game.Board;

import java.util.Arrays;

public abstract class Piece {


    private int x;
    private int y;
    private PieceColor pieceColor;


    public Piece(int x, int y,  PieceColor pieceColor) {
        this.x = x;
        this.y = y;
        this.pieceColor = pieceColor;
    }

    public abstract void movePiece(Board moveBoard, int moveChoice);

    public abstract void possibleMoves(Board possibleMovesBoard);

    public PieceColor getPieceColor(Board board,int moveX, int moveY) {

        return board.getChessBoard()[x + moveX][y + moveY].pieceColor;
    }

    public Piece getPiece(Board board, int moveX, int moveY){
        return board.getChessBoard()[x + moveX][y + moveY];
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
