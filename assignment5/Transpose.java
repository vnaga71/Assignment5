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
public class Transpose {

    public static void main(String args[]) {
        int a[][] = {{2, 5, 4}, {7, 58, 63}, {1, 3, 6}};
        System.out.println("before transpose");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("after transpose");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
