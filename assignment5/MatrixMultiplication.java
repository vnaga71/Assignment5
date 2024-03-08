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
public class MatrixMultiplication {

    public static void main(String args[]) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int b[][] = {{2, 3, 4}, {5, 6, 7}, {8, 9, 1}};
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j< 3; j++) {
                System.out.print(c[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
