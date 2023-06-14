package DesignForExtension.DesignChess.pieces;

import DesignForExtension.DesignChess.boards.ChessBoard;
import DesignForExtension.DesignChess.cells.ChessCell;
import DesignForExtension.DesignChess.util.Color;
import DesignForExtension.DesignChess.util.PieceName;


public abstract class ChessPiece {
    private final PieceName pieceName;
    private final Color color;
    private boolean isDead;

    public ChessPiece(PieceName pieceName, Color color, boolean isDead) {
        this.pieceName = pieceName;
        this.color = color;
        this.isDead = isDead;
    }

    public boolean isDead(){ return isDead; }

    public void setDead(boolean isDead){ this.isDead = isDead; }

    public PieceName getPieceName() { return pieceName; }

    public abstract void move(ChessCell source, ChessCell destination, ChessBoard chessBoard);
}
