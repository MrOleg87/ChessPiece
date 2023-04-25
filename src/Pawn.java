public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int paw;
        int startPos;
        if (getColor().equals("White")) {
            paw = 1;
            startPos = 1;
        } else if (getColor().equals("Black")) {
            paw = -1;
            startPos = 6;
        } else return false;
        if ((toLine < 8 && toLine >= 0) && (toColumn < 8 && toColumn >= 0)) {
            if (!(line == toLine && column == toColumn)) {
                if (column == toColumn) {
                    if (line + 2 * paw == toLine && line == startPos) {
                        if (chessBoard.board[toLine][toColumn] != null) {
                            return !chessBoard.board[toLine][toColumn].getColor().equals(color);
                        }
                        return true;
                    } else return line + paw == toLine;
                } else return false;
        } else return false;
    } else return false;
}

    public String getSymbol() {
        return "P";
    }
}

