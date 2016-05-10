package ch01.ex11;

import java.util.Scanner;

/**
 * 11.	Write	a	program	that	reads	a	line	of	text	and	prints	all	characters	that	are	not	ASCII,
 together	with	their	Unicode	values.

 Input: Nepali and English Mixed
 This is cool. यो राम्रो छ।
 https://en.wikipedia.org/wiki/Devanagari_(Unicode_block)
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] lineArr = line.toCharArray();

        for (int i = 0; i < lineArr.length; i++) {
            if (lineArr[i] > 255)
                System.out.println("Code point: " +
                        Integer.toString(Character.codePointAt(lineArr, i), 16) + ", " +
                        "Char: " + lineArr[i]);
        }
    }
}
