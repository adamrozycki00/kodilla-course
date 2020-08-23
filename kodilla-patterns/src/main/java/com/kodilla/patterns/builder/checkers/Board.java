package com.kodilla.patterns.builder.checkers;

public class Board {

    final public static int MIN_INDEX = 0;
    final public static int MAX_INDEX = 9;

    final private Figure[][] board = new Figure[MAX_INDEX + 1][MAX_INDEX + 1];

//    public Board() {
//        for (int n = 0; n < 10; n++) {
//            board[n] = new Figure[10];
//        }
//    }

    public Figure getFigure(int x, int y) {
        return board[x][y];
    }

    public void setFigure(Figure figure, int x, int y) {
        board[x][y] = figure;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result.append("|");
            for (int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if (board[n][k] == null) {
                    result.append("  ");
                } else {
                    result.append(board[n][k].getColor().equals(Figure.BLACK) ? "b" : "w");
                    result.append(board[n][k] instanceof Pawn ? "P" : "Q");
                }
                result.append("|");
            }
            result.append("\n");
        }
        return result.toString();
    }

}
