package CHESS;
/*
Абстрактный класс ChessPiece (шахматная фигура), чтобы на его
 основе легко написать все типы фигур в игре
 */
public abstract class ChessPiece {
    private final String color; //цвет фигуры
    private final String symbol; //тип фигуры
    boolean check = true; //поможет отследить, двигались ли фигуры или нет

    public ChessPiece(String color, String symbol) { //конструктор
        this.color = color;
        this.symbol = symbol;
    }
    public String getColor(){ //геттер
        return color;
    }
    /*
    В методе canMoveToPosition будем реализовывать возможность движения и возвращать true,
    если фигура может походить по заданным игроком координатам, либо false, если это невозможно.
     */
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public String getSymbol(){ //геттер
        return symbol;
    }
    public boolean checkPos(int pos) { //проверяем не вышла ли фигура за границы шахматной доски
        if (pos >= 0 && pos <= 7) return true;
        else return false;
    }
}
