package nova_gravitrips;

public abstract class Player {

    private Token token;
    boolean won = false;

    void setToken(Token token){
        this.token = token;
    }

    Token getToken(){
        return this.token;
    }

    char getName(){
        return this.token.getChar();
    }

    public abstract int getMove(Board board);

}