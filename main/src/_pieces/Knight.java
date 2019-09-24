package _pieces;

import _game.Board;
import _pieces._base.Piece;
import _pieces._base.PieceColor;

public class Knight extends Piece {

    public Knight(int x, int y, PieceColor pieceColor) {
        super(x, y, pieceColor);
    }

    @Override
    public void movePiece(Board moveBoard, int moveChoice) {

    }

    @Override
    public void possibleMoves(Board possibleMovesBoard) {
        if (moveFR(possibleMovesBoard));
        if (moveFL(possibleMovesBoard));
        if (moveRF(possibleMovesBoard));
        if (moveLF(possibleMovesBoard));
        if (moveBR(possibleMovesBoard));
        if (moveBL(possibleMovesBoard));
        if (moveRB(possibleMovesBoard));
        if (moveLB(possibleMovesBoard));
    }

    public boolean moveFR(Board board){
        if(getPiece(board,1,2) == null || getPieceColor(board,1,2) != getPieceColor(board,0,0))return true;
        return false;
    }

    public boolean moveFL(Board board){
        if(getPiece(board,-1,2) == null || getPieceColor(board,-1,2) != getPieceColor(board,0,0))return true;
        return false;
    }

    public boolean moveRF(Board board){
        if(getPiece(board,2,1) == null || getPieceColor(board,2,1) != getPieceColor(board,0,0))return true;
        return false;
    }

    public boolean moveLF(Board board){
        if(getPiece(board,-2,1) == null || getPieceColor(board,-2,1) != getPieceColor(board,0,0))return true;
        return false;
    }

    public boolean moveBR(Board board){
        if(getPiece(board,1,-2) == null || getPieceColor(board,1,-2) != getPieceColor(board,0,0))return true;
        return false;
    }

    public boolean moveBL(Board board){
        if(getPiece(board,-1,-2) == null || getPieceColor(board,-1,-2) != getPieceColor(board,0,0))return true;
        return false;
    }

    public boolean moveRB(Board board){
        if(getPiece(board,2,-1) == null || getPieceColor(board,2,-1) != getPieceColor(board,0,0))return true;
        return false;
    }

    public boolean moveLB(Board board){
        if(getPiece(board,-2,-1) == null || getPieceColor(board,-2,-1) != getPieceColor(board,0,0))return true;
        return false;
    }
}
