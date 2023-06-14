package DesignForExtension.DesignChess;

import DesignForExtension.DesignChess.actions.Move;
import DesignForExtension.DesignChess.boards.Board;
import DesignForExtension.DesignChess.players.Player;

import java.util.Queue;

public abstract class BoardGame {
    private final Board board;
    private final Queue<Player> players;

    public BoardGame(Board board, Queue<Player> players) { 
        this.board = board;
        this.players = players;
    }

    public void startGame() throws IllegalAccessException {
        while(true){
            Player currentPlayer = players.poll();
            Move move =  currentPlayer.makeMove();
            board.applyMove(move);
            if( isOver()){
                System.out.println("Game up.. "+currentPlayer.getName()+" is winner!");
                break;
            }
            players.offer(currentPlayer);
        }
    }

    public abstract boolean isOver() throws IllegalAccessException;
}
