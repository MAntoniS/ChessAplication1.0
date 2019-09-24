package _game;

import _pieces._base.Piece;

public class Board {

    private Piece[][] chessBoard;

    public Board() {
        this.chessBoard = new Piece[8][8];
    }

    public Piece[][] getChessBoard() {
        return chessBoard;
    }

}


