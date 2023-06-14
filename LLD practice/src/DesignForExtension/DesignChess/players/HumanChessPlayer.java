package DesignForExtension.DesignChess.players;

import DesignForExtension.DesignChess.actions.Move;
import DesignForExtension.DesignChess.boards.ChessBoard;
import DesignForExtension.DesignChess.pieces.ChessPiece;
import DesignForExtension.DesignChess.util.PieceName;

import java.util.Map;

public class HumanChessPlayer extends ChessPlayer {
    protected HumanChessPlayer(String name, Map<PieceName, ChessPiece> pieces) {
        super(name, pieces);
    }

    @Override
    public Move makeMove() {
        return null;
    }
}
