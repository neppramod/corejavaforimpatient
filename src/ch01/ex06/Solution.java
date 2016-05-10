package ch01.ex06;

import java.math.BigInteger;

/**
 * 6.	Write	a	program	that	computes	the	factorial	n!	=	1	×	2	×	...	×	n,	using
 BigInteger.	Compute	the	factorial	of	1000.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(factorial(1000));
    }

    static BigInteger factorial(int number)
    {
        BigInteger fact = BigInteger.valueOf(1L);
        while (number > 0) {
            fact = fact.multiply(BigInteger.valueOf(number));
            number--;
        }

        return fact;
    }
}
