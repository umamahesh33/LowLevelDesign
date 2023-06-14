package DesignForExtension.DesignChess.boards;

import DesignForExtension.DesignChess.actions.Move;

public interface Board {
    void display();
    void applyMove(Move move);
}
