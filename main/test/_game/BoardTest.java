package _game;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    Board board = new Board();

    @Test
    public void ChessBoardTest () {
        for (int i = 0; i < board.getChessBoard().length; i++){
            for (int j = 0; j < board.getChessBoard().length; j++){
                assertNull(board.getChessBoard()[i][j]);
            }
        }
    }

}