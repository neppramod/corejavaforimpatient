package ch01.ex15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 15.	Write	a	program	that	stores	Pascal’s	triangle	up	to	a	given	n	in	an
 ArrayList<ArrayList<Integer>>.
 Input:
 6
 1
 1 1
 1 2 1
 1 3 3 1
 1 4 6 4 1
 1 5 10 10 5 1
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> pascalTriangleList = new ArrayList<>();

        int j = 1;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> currentLineList = new ArrayList<>();
            for (int k = 0; k < j; k++) {
                currentLineList.add(sc.nextInt());
            }
            pascalTriangleList.add(currentLineList);
            j++;
        }

        for (ArrayList<Integer> currentLine : pascalTriangleList) {
            for (Integer currentVal : currentLine) {
                System.out.print(currentVal + ", ");
            }
            System.out.println();
        }
    }
}
