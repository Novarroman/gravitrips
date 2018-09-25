package nova_gravitrips;

import java.util.Random;

public class ComputerPlayer extends Player {

    private Random rand = new Random();

    public int getMove(Board board) {
        int move;
        do {
            move = rand.nextInt(board.getColumns());
        } while (board.moveIsValid(move));

        return move;
    }
}