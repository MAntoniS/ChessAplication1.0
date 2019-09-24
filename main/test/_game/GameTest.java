package _game;

import _pieces.Pawn;
import _pieces._base.Piece;
import _pieces._base.PieceColor;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Board testBoard = new Board();
    Game  testGame = new Game(testBoard);

    @Test
    public void isSet(){
        testGame.placePawns(PieceColor.WHITE);
        for (int i = 0; i < testBoard.getChessBoard().length; i ++){
            System.out.println(testBoard.getChessBoard()[i][6]);
        }

    }


}