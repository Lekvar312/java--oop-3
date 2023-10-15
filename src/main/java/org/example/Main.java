package org.example;

import java.beans.FeatureDescriptor;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static char[][] field;
    static final int FIELD_SIZE =3;
    static final char EMPTY_CELL = '*';
    static final char X_CELL = 'x';
    static final char O_CELL = '0';
    public static void main(String[] args) {
        initField();
        printField();
        humanTurn();
        printField();

    }
    public static boolean isCellEmpty(int x, int y) {
    if(x < 0 || y < 0 || x >= FIELD_SIZE || y >= FIELD_SIZE){
        return false;
    }
    }
    public static void humanTurn() {
        System.out.println("Оберіть клітинку за координатами x,y");
        int x, y;
        x = scanner.nextInt() - 1;
        y = scanner.nextInt() - 1;
        field[x][y] = X_CELL;
    }
    public static void printField(){
        for (int i = 0; i <= FIELD_SIZE ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print((i +1 ) + " ");

            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void initField () {
        field = new char[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE ; j++) {
                field [i][j] = EMPTY_CELL;
            }

        }
        scanner = new Scanner(System.in);
    }
}


