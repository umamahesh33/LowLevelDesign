package DesignForExtension.DesignChess.pieces;

import DesignForExtension.DesignChess.boards.ChessBoard;
import DesignForExtension.DesignChess.cells.ChessCell;
import DesignForExtension.DesignChess.util.Color;
import DesignForExtension.DesignChess.util.PieceName;

public class Rook extends ChessPiece{
    public Rook(PieceName pieceName, Color color, boolean isDead) {
        super(pieceName, color, isDead);
    }

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }
}
