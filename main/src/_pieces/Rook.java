package _pieces;

import _game.Board;
import _pieces._base.Piece;
import _pieces._base.PieceColor;

public class Rook extends Piece {

    public Rook(int x, int y, PieceColor pieceColor) {
        super(x, y, pieceColor);
    }

    @Override
    public void movePiece(Board moveBoard, int moveChoice) {

    }

    @Override
    public void possibleMoves(Board possibleMovesBoard) {
        System.out.println("Possible moves : ");
        if(moveF(possibleMovesBoard));
        if (moveR(possibleMovesBoard));
        if (moveL(possibleMovesBoard));
        if (moveB(possibleMovesBoard));
    }

    public boolean moveF (Board board){
        if ()return true;
        return false;
    }
}
