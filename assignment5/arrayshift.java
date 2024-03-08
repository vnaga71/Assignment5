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

public class arrayshift {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of positions to right shift: ");
        int shiftCount = scanner.nextInt();

        System.out.println("Before right shift:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        for (int shift = 0; shift < shiftCount; shift++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }

        System.out.println("\nAfter right shift:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}