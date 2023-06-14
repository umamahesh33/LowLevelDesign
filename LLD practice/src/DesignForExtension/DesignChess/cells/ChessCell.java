package DesignForExtension.DesignChess.cells;

import DesignForExtension.DesignChess.pieces.ChessPiece;

import java.util.Optional;

public class ChessCell {
    private final int x;
    private final int y;
    private Optional<ChessPiece> chessPiece;

    public ChessCell(int x, int y) {
        this.x = x;
        this.y = y;
        this.chessPiece = Optional.empty();
    }
}
