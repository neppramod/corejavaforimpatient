package ch01.ex08;

import java.util.Scanner;

/**
 * Write	a	program	that	reads	a	string	and	prints	all	of	its	nonempty	substrings.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        String[] inputStrArr = inputStr.split("\\s+");
        for (String inputStrVal : inputStrArr) {
           System.out.print(inputStrVal.trim());
        }
        System.out.println();
    }
}
