public class Character {
    private Line line;
    private int position;
    private boolean upperCase;
    private char value;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isUpperCase() {
        return upperCase;
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
    public String toString(){
        return String.valueOf(value);
    }
    public Character(char value, boolean upperCase){
        this.value=value;
        this.upperCase=upperCase;

    }
    public Character(int position){
        this.position=position;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
}
