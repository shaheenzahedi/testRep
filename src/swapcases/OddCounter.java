/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapcases;

import java.util.Scanner;

/**
 *
 * @author Shaheen
 */
public class OddCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] seq = new int[5];
        for (int i = 0; i <= 4; i++) {
            seq[i] = scanner.nextInt();
        }
        System.out.println(findMostOdd(seq));
    }

    private static int findMostOdd(int[] seq) {
        int maxOdd = countOdd(seq[0]), result = seq[0];
        for (int i = 1; i < seq.length; i++) {
            int oddCount = countOdd(seq[i]);
            if (oddCount > maxOdd) {
                maxOdd = oddCount;
                result = seq[i];
            }
        }
        return result;
    }

    private static int countOdd(int src) {
        int[] srcArr = toIntArray(src);
        int counter = 0;
        for (int i = 0; i < srcArr.length; i++) {
            if (srcArr[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] toIntArray(int src) {
        String temp = Integer.toString(src);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }
        return newGuess;
    }

}
