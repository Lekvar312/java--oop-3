package org.example;

public class Player {
    public static void humanTurn(){
        int x,y;
        do {
            System.out.println("Оберіть клітинку за координатами");
            x = Main.scanner.nextInt() - 1;
            y = Main.scanner.nextInt() - 1;
        }while(!Validate.isCellEmpty(x, y));
        Main.field[y][x] = Main.X__CELL;
    }
}
