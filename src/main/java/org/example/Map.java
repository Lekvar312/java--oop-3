package org.example;

import java.util.Scanner;

public class Map {
    public static void initField() {
        Main.field = new char[Main.FIELD__SIZE][Main.FIELD__SIZE];
        for (int i = 0; i < Main.FIELD__SIZE; i++) {
            for (int j = 0; j < Main.FIELD__SIZE; j++) {
                Main.field[i][j] = Main.EMPTY__FIELD;
            }
        }
        Main.scanner = new Scanner(System.in);
    }
    public static void printField() {
        for (int i = 0; i <= Main.FIELD__SIZE ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < Main.FIELD__SIZE ; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < Main.FIELD__SIZE; j++) {
                System.out.print(Main.field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
