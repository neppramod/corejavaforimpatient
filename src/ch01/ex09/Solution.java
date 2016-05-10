package ch01.ex09;

/**
 * 9.	Section	1.5.3,	“String	Comparison,”	on	p.	21	has	an	example	of	two	strings	s	and	t
 so	that	s.equals(t)	but	s	!=	t.	Come	up	with	a	different	example	that	doesn’t
 use	substring).
 */
public class Solution {
    public static void main(String[] args) {
        String S1 = "Hello";
        String S2 = new String("Hello");

        if (S1 != S2) System.out.println("S1 != S2");
        if (S1.equals(S2)) System.out.println("S1.equals(S2)");
    }
}
