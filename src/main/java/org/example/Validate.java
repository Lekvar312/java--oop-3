package org.example;

public class Validate {
    public static boolean checkDraft(){
        for (int i = 0; i < Main.FIELD__SIZE; i++) {
            for (int j = 0; j < Main.FIELD__SIZE; j++) {
                if (Main.field[i] [j] == Main.EMPTY__FIELD){
                    return false;
                }
            }

        }
        return true;
    }
    public static boolean checkWin(char playerField){
        if (Main.field [0][0] == playerField && Main.field[0] [1] == playerField && Main.field [0][2] == playerField) return true;
        if (Main.field [1][0] == playerField && Main.field[1] [1] == playerField && Main.field [1][2] == playerField) return true;
        if (Main.field [2][0] == playerField && Main.field[1] [1] == playerField && Main.field [2][2] == playerField) return true;

        if (Main.field [0][0] == playerField && Main.field[1] [0] == playerField && Main.field [2][0] == playerField) return true;
        if (Main.field [1][0] == playerField && Main.field[1] [1] == playerField && Main.field [2][1] == playerField) return true;
        if (Main.field [2][0] == playerField && Main.field[1] [2] == playerField && Main.field [2][2] == playerField) return true;

        if (Main.field [0][0] == playerField && Main.field[1] [1] == playerField && Main.field [2][2] == playerField) return true;
        if (Main.field [0][2] == playerField && Main.field[1] [1] == playerField && Main.field [2][0] == playerField) return true;
        return false;
    }
    public static boolean isCellEmpty(int x, int y){
        if(x < 0 ||  y < 0 || x >= Main.FIELD__SIZE || y >= Main.FIELD__SIZE){
            return false;
        }
        if(Main.field [y] [x] != Main.EMPTY__FIELD){
            return false;
        }
        return true;
    }
}
