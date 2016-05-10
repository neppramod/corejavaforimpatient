package ch01.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1.	Write	a	program	that	reads	an	integer	and	prints	it	in	binary,	octal,	and	hexadecimal.
 * Print	the	reciprocal	as	a	hexadecimal	floating-point	number.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(Integer.toBinaryString(input));
        System.out.println(Integer.toOctalString(input));
        System.out.println(Integer.toHexString(input));

        // Another one is toString(input, radix).
        System.out.println(Integer.toString(input, 2));

        System.out.println(toBase(2, input));
        System.out.println(toBase(8, input));
        System.out.println(toBase(16, input));
    }

    public static String toBase(int base, int number)
    {

        StringBuffer sb = new StringBuffer();
        while (number > 0) {
            sb.append(number % base);
            number /= base;
        }

        sb = sb.reverse();
        return sb.toString();
    }
}
