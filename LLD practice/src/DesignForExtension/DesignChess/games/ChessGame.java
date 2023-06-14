package DesignForExtension.DesignChess.games;

import DesignForExtension.DesignChess.BoardGame;
import DesignForExtension.DesignChess.boards.ChessBoard;
import DesignForExtension.DesignChess.players.ChessPlayer;
import DesignForExtension.DesignChess.util.PieceName;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ChessGame extends BoardGame {
    private final ChessBoard chessBoard;
    private final ChessPlayer player1;
    private final ChessPlayer player2;

    public ChessGame(ChessBoard chessBoard, ChessPlayer player1, ChessPlayer player2) {
        super(chessBoard,new ArrayDeque<>(Arrays.asList(player1,player2)));
        this.chessBoard = chessBoard;
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public boolean isOver() throws IllegalAccessException {
        return player1.getPiece(PieceName.KING).isDead() ||
                player2.getPiece(PieceName.KING).isDead();
    }
}
