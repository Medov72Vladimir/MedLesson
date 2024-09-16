package CHESS;

public class King extends ChessPiece {

    public King(String color) {
        super(color, "K");
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)) {
            if (Math.abs(line - toLine) > 1 || Math.abs(column - toColumn) > 1) return false;

            if (isUnderAttack(chessBoard, toLine, toColumn)) return false;

            if (chessBoard.board[toLine][toColumn] != null) {
                return !chessBoard.board[toLine][toColumn].getColor().equals(this.getColor());
            }

            return true;
        } else return false;
    }

    /*
     Метод isUnderAttack() проверяет, находится ли поле, на котором стоит король (или куда собирается пойти) под атакой.
      Если это так, то метод должен вернуть true, иначе — false. Это позволит нам проверять шахи.
     */
    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        if (checkPos(line) && checkPos(column)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (chessBoard.board[i][j] != null) {
                        if (!chessBoard.board[i][j].getColor().equals(this.getColor()) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } else return false;
    }

}

