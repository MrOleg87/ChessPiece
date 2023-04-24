public class Queen extends ChessPiece{
    public Queen(String color){
        super(color);
    }
    public String getColor(){
        return color;
    }
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((toLine < 8 && toLine >= 0) && (toColumn < 8 && toColumn >= 0)) {
            if (!(line == toLine && column == toColumn)) {
                if ((Math.abs(toLine - line) == Math.abs(toColumn - column)) || (line == toLine || column == toColumn)){
                    return true;
                }else return false;
            }else return false;
        } else return true;
    }
    public String getSymbol() {
        return "Q";
    }
}