package nova_gravitrips;

public class Board {

    private int rows;
    private int columns;
    private Token[][] board;

    Board(int rows, int columns){

        this.rows = rows;
        this.columns = columns;

        board = new Token[rows][columns];
        initBoard(Token.EMPTY);
    }

    public void initBoard(Token token){
        for (int x = 0; x < getRows(); x++) {
            for (int y = 0; y < getColumns(); y++) {
                board[x][y] = token;
            }
        }
    }

    void drawBoard(){

        System.out.println();
        System.out.print("       ");
        for(int i=1; i<=getColumns(); ++i){
            System.out.print("  "+i);
        }
        System.out.println();


        System.out.println();
        for(int i=getRows()-1; i>=0; --i){
            System.out.print("   "+ (i+1)+"   ");
            for(int j=0; j<=getColumns()-1; ++j){
                System.out.print("  "+ board[i][j].getChar());
            }
            System.out.println();
        }

        System.out.println();
    }

    int getRows(){
        return rows;
    }

    int getColumns(){
        return columns;
    }

    boolean moveIsValid(int column){
        if (board[getRows() - 1][column] != Token.EMPTY) return true;
        else return false;
    }

    public boolean placeMove(int column, Player player){
        board[findRow(column)][column] = player.getToken();
        return false;
    }

    public int findRow(int column){

        int row = 0;

        for (int i = 0; i < getRows(); ++i) {
            if (board[i][column] == Token.EMPTY) {
                row = i;
                break;
            }
        }

        return row;
    }

    int countEmptyCells(){
        int emptyCells = 0;

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (board[i][j] == Token.EMPTY){
                    emptyCells++;
                }
            }
        }
        return emptyCells;
    }

    boolean emptyCellsLeft(){
        for (int j = 0; j <= getColumns()-1; j++){
            if (board[getRows()-1][j] == Token.EMPTY){return true;}
        }
        return false;
    }

    Token getToken(int i, int j){
        return board[i][j];
    }


}