package org.petrova.javarush;

public class Lecture10_1 {
    public static ChessBoard board = new ChessBoard();// Ссылка на единственный объект типа ChessBoard
    public ChessItem[][] cells = new ChessItem[8][8];//Двумерный массив 8×8, не статическая переменная
   ...
}

public class Game {
    public static void main(String[] args) { // Добавляем фигуры на доску
        var board = ChessBoard.board;
        board.cells[0][3] = new King(Color.WHITE);
        board.cells[0][4] = new Queen(Color.WHITE);
      ...
    }
}
}
