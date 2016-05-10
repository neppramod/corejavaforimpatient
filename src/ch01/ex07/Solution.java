package ch01.ex07;

import java.util.Scanner;

/**
 * 7.	Write	a	program	that	reads	in	two	numbers	between	0	and	65535,	stores	them	in
 * short	variables,	and	computes	their	unsigned	sum,	difference,	product,	quotient,
 * and	remainder,	without	converting	them	to	int. This does not work, because every arithmetic operation
 * converts the operands to int.
 * <p>
 * Write a program that reads in two numbers between 0 and 4294967295, stores them in
 * int variables, and computes and displays their unsigned sum, difference, product, quotient,
 * and remainder, without converting them to long.
 * <p>
 * <p>
 * Javadoc comment for Integer.
 *
 * Note that in two's complement arithmetic, the three other basic arithmetic operations
 * of add, subtract,
 * and multiply are bit-wise identical if the two operands are regarded as both being signed or both being unsigned.
 * Therefore separate addUnsigned, etc. methods are not provided.
 * <p>
 * Author's comment:
 * <p>
 * + - * work correctly unless the result overflows. For + and - that's just how 2's complement arithmetic works.
 * I had to think about multiplication a bit. If both factors are < 2^31 - 1, then there is no sign bit, and the
 * multiplication will work correctly. If either of the factors is >= 2^31 - 1, then the other must be 1,
 * or the product overflows.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Here I am taking input as Strings
        int N1 = Integer.parseUnsignedInt(sc.next());
        int N2 = Integer.parseUnsignedInt(sc.next());
        System.out.println("SUM: " + Integer.toUnsignedString(N1 + N2));  // Input : 4294967295 1. Here 4294967295 is
        // treated as -1, therefore the result is 0
        System.out.println("DIFFERENCE: " + Integer.toUnsignedString(N1 - N2));
        System.out.println("PRODUCT: " + Integer.toUnsignedString(N1 * N2));
        System.out.println("QUOTIENT: " + Integer.divideUnsigned(N1, N2));
        System.out.println("REMAINDER: " + Integer.remainderUnsigned(N1, N2));


    }
}
