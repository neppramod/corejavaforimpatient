package ch01.ex05;

import java.util.Scanner;

/**
 *5.	What	happens	when	you	cast	a	double	to	an	int	that	is	larger	than	the	largest
 possible	int	value?	Try	it	out.
 It casts back to Integer.MAX_VALUE i.e 2 billion
 Answer, it remains at Integer.MAX_VALUE
 */
public class Solution {
    public static void main(String[] args) {
        double maxIntDoubleValue = Integer.MAX_VALUE + 3000.0;
        int newCast = (int)maxIntDoubleValue;
        System.out.println(newCast);
        System.out.println(Integer.MAX_VALUE);
    }
}
