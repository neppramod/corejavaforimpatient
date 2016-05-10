package ch01.ex02;

import java.util.Scanner;

/**
 * 2.	Write	a	program	that	reads	an	integer	angle	(which	may	be	positive	or	negative)	and
 * normalizes	it	to	a	value	between	0	and	359	degrees.	Try	it	first	with	the	%	operator,
 * then	with	floorMod.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();
        System.out.println(normalize(angle));
        System.out.println(Math.floorMod(angle, 360));
    }

    public static int normalize(int angle)
    {

        if (angle < 0) {
            if (angle < -360) {
                angle %= 360;
            }

            angle += 360;
        }

        return angle % 360;
    }
}
