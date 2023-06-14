package DesignForExtension.DesignChess.players;

import DesignForExtension.DesignChess.actions.Move;
import DesignForExtension.DesignChess.cells.ChessCell;
import DesignForExtension.DesignChess.pieces.ChessPiece;
import DesignForExtension.DesignChess.util.PieceName;

import java.util.Map;

public abstract class ChessPlayer extends Player{
    private final Map<PieceName, ChessPiece> pieces;

    protected ChessPlayer(String name, Map<PieceName, ChessPiece> pieces) {
        super(name);
        this.pieces=pieces;
    }

    public ChessPiece getPiece(PieceName pieceName) throws IllegalAccessException {
        if(!pieces.containsKey(pieceName))
            throw new IllegalAccessException("Invalid piece");
        return pieces.get(pieceName);
    }
}
