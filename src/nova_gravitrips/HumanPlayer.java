package nova_gravitrips;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public Scanner scan = new Scanner(System.in);

    public int getMove(Board board) {

        board.drawBoard();
        int move;

        int i = 0;
        do {
           if (i > 0){
              System.out.println("This move is not allowed!");
              System.out.println();
           }
            System.out.println("Your move, '" + getName() + "' player! Choose a line (1-" + board.getColumns() + ") to drop your token! ");
            move = scan.nextInt();

           i++;

        } while ( move < 1 || move > board.getColumns() || board.moveIsValid(move - 1));

        return --move;
    }

}