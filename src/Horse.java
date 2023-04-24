public class Horse extends ChessPiece{
    public Horse(String color){
        super(color);
    }
    public String getColor(){
        return color;
    }
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((toLine < 8 && toLine >=0) && (toColumn < 8 && toColumn >= 0)) {
            if (!(line == toLine && column == toColumn)) {
                if (!(line == toLine ^ column == toColumn)
                        && (Math.abs(toLine - line) <= 2 && Math.abs(toColumn - column) <= 2)) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }
    public String getSymbol(){
        return "H";
    }
}