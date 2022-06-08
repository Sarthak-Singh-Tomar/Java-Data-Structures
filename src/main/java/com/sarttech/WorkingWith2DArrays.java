package com.sarttech;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        System.out.println(Arrays.deepToString(board));

        char[][] board2 = new char[][] {
          new char[] {'0','-','-'},
          new char[] {'0','-','-'},
          new char[] {'0','-','-'}
        };

        System.out.println(Arrays.deepToString(board2));
    }
}
