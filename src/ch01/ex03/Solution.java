package ch01.ex03;

import java.util.Scanner;

/**
 * 3.	Using	only	the	conditional	operator,	write	a	program	that	reads	three	integers	and
 prints	the	largest.	Repeat	with	Math.max.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        System.out.println(max(N1, N2, N3));
        System.out.println(Math.max(N1 > N2 ? N1 : N2, N3));
        int firstBig = Math.max(N1, N2);
        System.out.println(Math.max(firstBig, N3));
    }

    public static int max(int N1, int N2, int N3)
    {
        return N1 > N2 ? (N1 > N3 ? N1 : N3) : (N2 > N3 ? N2 : N3);
    }
}
