package org.example;

import java.beans.FeatureDescriptor;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static char [][] field;
    static final int FIELD__SIZE = 3;
    static final char EMPTY__FIELD = '*';
    static final char X__CELL = 'X';
    static final char O__CELL = 'O';

    public static void main(String[] args) {
        Map.initField();
        Map.printField();
        while (true) {
            Player.humanTurn();
            Map.printField();
            if(Validate.checkWin(X__CELL)){
                System.out.println("Гру завершено, гравець переміг");
                break;
            }
            if(Validate.checkDraft()){
                System.out.println("Гру завершено. Нічия");
                break;
            }
            Main.field[AI.aiTurn() / FIELD__SIZE][AI.aiTurn() % FIELD__SIZE] = O__CELL;
            Map.printField();
            if(Validate.checkWin(O__CELL)){
                System.out.println("Гру завершено, компютер переміг");
                break;
            }
            if(Validate.checkDraft()){
                System.out.println("Гру завершено. Нічия");
                break;
            }
        }
    }
}