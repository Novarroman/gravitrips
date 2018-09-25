package nova_gravitrips;

enum Token {
    X('X'), O('O'), EMPTY('.');

    private char tokenChar;

    Token(char tokenChar) {
        this.tokenChar = tokenChar;
    }

    public char getChar() {
        return tokenChar;
    }

}
