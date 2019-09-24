package _pieces;


import _game.Board;
import _pieces._base.Piece;
import _pieces._base.PieceColor;

public class Pawn extends Piece {
    public Pawn(int x, int y, PieceColor pieceColor) {
        super(x, y, pieceColor);
    }

    @Override
    // TO DO : consider placing the Integer in a different place. This way, you're choosing the move BEFORE knowing them all.
    public void movePiece(Board moveBoard, int moveChoice) {
    possibleMoves(moveBoard);
    switch (moveChoice){
        case 1:
            if (moveOneF(moveBoard)){
                moveBoard.getChessBoard()[getX()][getY() +1] = moveBoard.getChessBoard()[getX()][getY()];
                moveBoard.getChessBoard()[getX()][getY()] = null;
            }
            break;
        case 2:
            if (moveTwoF(moveBoard)){
                moveBoard.getChessBoard()[getX()][getY() +2] = moveBoard.getChessBoard()[getX()][getY()];
                moveBoard.getChessBoard()[getX()][getY()] = null;
            }
            break;
        case 3:
            if (takePieceR(moveBoard)){
                moveBoard.getChessBoard()[getX() + 1][getY() + 1] = moveBoard.getChessBoard()[getX()][getY()];
                moveBoard.getChessBoard()[getX()][getY()] = null;
            }
            break;
        case 4:
            if (takePieceL(moveBoard)){
                moveBoard.getChessBoard()[getX() - 1][getY() - 1] = moveBoard.getChessBoard()[getX()][getY()];
                moveBoard.getChessBoard()[getX()][getY()] = null;
            }
            break;
    } //        TO DO : make a loop for the possibility of making a move, that is not allowed.

    }

    @Override
    public void possibleMoves(Board possibleMovesBoard) {
        System.out.println("Your possible moves are:");
        if(moveOneF(possibleMovesBoard)) System.out.println("1) to: " + getX() + (getY() +1) );
        if(moveTwoF(possibleMovesBoard)) System.out.println("2) to: " + getX() + (getY() +2));
        if(takePieceR(possibleMovesBoard)) System.out.println("3) to:"+ (getX() + 1) + (getY() + 1));
        if(takePieceL(possibleMovesBoard)) System.out.println("4) to: "+ (getX() - 1) + (getY() - 1));
    }

    public boolean takePieceL(Board board){
        if (getPieceColor(board,0,0) != getPieceColor(board, - 1, - 1)) return true;
        return false;

    }
    public boolean takePieceR(Board board){
        if (getPieceColor(board,0,0) != getPieceColor(board, 1, 1)) return true;
        return false;
    }
    public boolean moveOneF(Board board){
        if (board.getChessBoard()[getX()][getY() + 1] == null)return true;
        return false;
    }
    public boolean moveTwoF(Board board){
        if (board.getChessBoard()[getX()][getY() + 2] == null )return true;
        return false;
    } //        TO DO : make a condition for moving two tiles.


}
