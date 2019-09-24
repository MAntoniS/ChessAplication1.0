package _pieces;


import _game.Board;
import _pieces._base.Piece;
import _pieces._base.PieceColor;

public class King extends Piece {

    public King(int x, int y, PieceColor pieceColor) {
        super(x, y, pieceColor);
    }

    @Override
    // TO DO : check for OUTOFBOUNDEXEPTION.
    public void movePiece(Board moveBoard, int moveChoice) {
        possibleMoves(moveBoard);
        switch (moveChoice){
            case 1:
                if (moveF(moveBoard)){
                    moveBoard.getChessBoard()[getX()][getY() + 1] = getPiece(moveBoard,0,0);
                    moveBoard.getChessBoard()[getX()][getY()]= null;
                }
                break;

            case 2:
                if (moveFR(moveBoard)){
                    moveBoard.getChessBoard()[getX() + 1][getY() + 1] = getPiece(moveBoard,0,0);
                    moveBoard.getChessBoard()[getX()][getY()]= null;
                }
                break;
            case 3:
                if (moveFL(moveBoard)){
                    moveBoard.getChessBoard()[getX() - 1][getY() + 1] = getPiece(moveBoard,0,0);
                    moveBoard.getChessBoard()[getX()][getY()]= null;
                }
                break;
            case 4:
                if (moveR(moveBoard)){
                    moveBoard.getChessBoard()[getX() + 1][getY()] = getPiece(moveBoard,0,0);
                    moveBoard.getChessBoard()[getX()][getY()]= null;
                }
                break;
            case 5:
                if (moveL(moveBoard)){
                    moveBoard.getChessBoard()[getX() - 1][getY()] = getPiece(moveBoard,0,0);
                    moveBoard.getChessBoard()[getX()][getY()]= null;
                }
                break;
            case 6:
                if (moveB(moveBoard)){
                    moveBoard.getChessBoard()[getX()][getY() - 1] = getPiece(moveBoard,0,0);
                    moveBoard.getChessBoard()[getX()][getY()]= null;
                }
                break;
            case 7:
                if (moveBR(moveBoard)){
                    moveBoard.getChessBoard()[getX() + 1][getY() - 1] = getPiece(moveBoard,0,0);
                    moveBoard.getChessBoard()[getX()][getY()]= null;
                }
                break;
            case 8:
                if (moveBL(moveBoard)){
                    moveBoard.getChessBoard()[getX() - 1][getY() - 1] = getPiece(moveBoard,0,0);
                    moveBoard.getChessBoard()[getX()][getY()]= null;
                }
                break;
        }
    }

    @Override
    public void possibleMoves(Board possibleMovesBoard) {
        System.out.println("Possible moves:");
        if (moveF(possibleMovesBoard))  System.out.println("1) to: " + getPiece(possibleMovesBoard,0,1));
        if (moveFR(possibleMovesBoard)) System.out.println("2) to: " + getPiece(possibleMovesBoard,1,1));
        if (moveFL(possibleMovesBoard)) System.out.println("3) to: " + getPiece(possibleMovesBoard,-1,1));
        if (moveR(possibleMovesBoard))  System.out.println("4) to: " + getPiece(possibleMovesBoard,1,0));
        if (moveL(possibleMovesBoard))  System.out.println("5) to: " + getPiece(possibleMovesBoard,-1,0));
        if (moveB(possibleMovesBoard))  System.out.println("6) to: " + getPiece(possibleMovesBoard,0,-1));
        if (moveBR(possibleMovesBoard)) System.out.println("7) to: " + getPiece(possibleMovesBoard,1,-1));
        if (moveBL(possibleMovesBoard)) System.out.println("8) to: " + getPiece(possibleMovesBoard,-1,-1));
    }

    public boolean moveF(Board board){
        if (getPiece(board,0,1) == null || getPieceColor(board,0,1) != getPieceColor(board,0,0))return true;
        return false;
    }
    public boolean moveFR(Board board){
        if (getPiece(board,1,1) == null || getPieceColor(board,1,1) != getPieceColor(board,0,0))return true;
        return false;
    }
    public boolean moveFL(Board board){
        if (getPiece(board, -1, 1) == null || getPieceColor(board,-1,1) != getPieceColor(board,0,0))return  true;
        return false;
    }
    public boolean moveR(Board board){
        if (getPiece(board,1,0) == null || getPieceColor(board,1,0) != getPieceColor(board,0,0))return true;
        return false;
    }
    public boolean moveL(Board board){
        if (getPiece(board,-1,0) == null || getPieceColor(board,-1,0) != getPieceColor(board,0,0))return true;
        return false;
    }
    public boolean moveB(Board board){
        if (getPiece(board,0,-1) == null || getPieceColor(board,0,-1) != getPieceColor(board,0,0))return true;
        return false;
    }
    public boolean moveBR(Board board){
        if (getPiece(board,1,-1) == null || getPieceColor(board,1,-1) != getPieceColor(board,0,0))return true;
        return false;
    }
    public boolean moveBL(Board board){
        if (getPiece(board,-1,-1) == null || getPieceColor(board,-1,-1) != getPieceColor(board,0,0))return true;
        return false;
    }

}
