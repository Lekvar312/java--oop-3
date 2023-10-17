package org.example;

import java.util.Objects;

public class AI {

    public static int aiTurn() {
        int bestMove = -1;
        int bestScore = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            int row = i / Main.FIELD__SIZE;
            int col = i % Main.FIELD__SIZE;

            if (Main.field[row][col] == Main.EMPTY__FIELD) {
                Main.field[row][col] = Main.O__CELL;
                int score = minimax(Main.field, 0, false);
                Main.field[row][col] = Main.EMPTY__FIELD;

                if (score > bestScore) {
                    bestScore = score;
                    bestMove = i;
                }
            }
        }

        return bestMove;
    }



    private static int minimax(char[][] cells, int depth, boolean isMaximizing) {
        if (Validate.checkWin(Main.O__CELL)) {
            return 1;
        } else if (Validate.checkWin(Main.X__CELL)) {
            return -1;
        } else if (Validate.checkDraft()) {
            return 0;
        }

        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells[i].length; j++) {
                    if (cells[i][j] == (char) ('1' + i * 3 + j)) {
                        cells[i][j] = Main.O__CELL;
                        int score = minimax(cells, depth + 1, false);
                        cells[i][j] = (char) ('1' + i * 3 + j);
                        bestScore = Math.max(score, bestScore);
                    }
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells[i].length; j++) {
                    if (cells[i][j] == (char) ('1' + i * 3 + j)) {
                        cells[i][j] = Main.X__CELL;
                        int score = minimax(cells, depth + 1, true);
                        cells[i][j] = (char) ('1' + i * 3 + j);
                        bestScore = Math.min(score, bestScore);
                    }
                }
            }
            return bestScore;
        }
    }
}
