package DesignForExtension.DesignChess.players;

import DesignForExtension.DesignChess.actions.Move;

public abstract class Player {
    private final String name;

    protected Player(String name){
        this.name=name;
    }

    /*
    * when we call makeMove, we need to collect input from the user about the move and we need to return
    * the Move so that we can apply that move on board
    * */
    public abstract Move makeMove();

    public String getName() {
        return name;
    }
}
