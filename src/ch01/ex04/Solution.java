package ch01.ex04;

import java.util.Scanner;

/**
 * 4.	Write	a	program	that	prints	the	smallest	and	largest	positive	double	value.	Hint:
 Look	up	Math.nextUp	in	the	Java	API.
 */
public class Solution {
    public static void main(String[] args) {


        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Math.nextUp(Double.MAX_VALUE));
        System.out.println(Math.nextDown(Double.MAX_VALUE));
    }
}
