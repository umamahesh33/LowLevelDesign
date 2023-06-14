package DesignForExtension.DesignChess.pieces;

import DesignForExtension.DesignChess.boards.ChessBoard;
import DesignForExtension.DesignChess.cells.ChessCell;
import DesignForExtension.DesignChess.util.Color;
import DesignForExtension.DesignChess.util.PieceName;

public class King extends ChessPiece{
    public King(PieceName pieceName, Color color, boolean isDead) {
        super(pieceName, color, isDead);
    }

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }
}
