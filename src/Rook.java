public class Rook extends ChessPiece{
    public Rook(String color){
        super(color);
    }
    public String getColor(){
        return this.color;
    }
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((toLine < 8 && toLine >= 0) && (toColumn < 8 && toColumn >= 0)) {
            if (!(line == toLine && column == toColumn)) {
               if (line == toLine || column == toColumn) {
                   if (chessBoard.board[toLine][toColumn] != null) {
                       if (chessBoard.board[toLine][toColumn].getColor().equals(this.color) && chessBoard.board[toLine][toColumn] != this)
                           return false;
                       else return !chessBoard.board[toLine][toColumn].getColor().equals(this.color) && chessBoard.board[toLine][toColumn] != this;
                   } else return true;
               }else return false;
            } else return false;
        } else return false;
    }
    public String getSymbol() {
        return "R";
    }
}
