package lsystems;

public class LSystemSymbolException extends Exception {
	private char c;
	
	public LSystemSymbolException(char c) {
		this.c = c;
	}

    public char getSymbol() {
        return c;
    }
}
