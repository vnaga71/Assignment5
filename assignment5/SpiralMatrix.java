/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author venka
 */
import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        sm.print_spiral();
    }

    public void print_spiral() {
        int[][] spiral = new int[4][4];
        int value = 1;
        int mincol = 0;
        int maxcol = 3;
        int minrow = 0;
        int maxrow = 3;
        while (value <= 16) {
            for (int col = mincol; col <= maxcol; col++) {
                spiral[minrow][col] = value;
                value++;
            }
            for (int row = minrow + 1; row <= maxrow; row++) {
                spiral[row][maxcol] = value;
                value++;
            }
            for (int col = maxcol - 1; col >= mincol; col--) {
                spiral[maxrow][col] = value;
                value++;
            }
            for (int row = maxrow - 1; row >= minrow + 1; row--) {
                spiral[row][mincol] = value;
                value++;
            }
            mincol++;
            maxcol--;
            minrow++;
            maxrow--;

        }
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(spiral[row][col] + "\t");
            }
            System.out.println();
        }
    }
}