package ch01.ex10;

import java.util.Random;

/**
 * 10.	Write	a	program	that	produces	a	random	string	of	letters	and	digits	by	generating	a
 random	long	value	and	printing	it	in	base	36.
 */
public class Solution {
    public static void main(String[] args) {
        long longInt = new Random().nextLong();
        System.out.println(Long.toString(longInt, 36));
    }
}
