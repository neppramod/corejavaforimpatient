package ch01.ex14;

import java.util.Scanner;

/**
 * 14.	Write	a	program	that	reads	a	two-dimensional	array	of	integers	and	determines
 whether	it	is	a	magic	square	(that	is,	whether	the	sum	of	all	rows,	all	columns,	and
 the	diagonals	is	the	same).	Accept	lines	of	input	that	you	break	up	into	individual
 integers,	and	stop	when	the	user	enters	a	blank	line.	For	example,	with	the	input
 16	3	2	13
 3	10	11	8
 9	6	7	12
 4	15	14	1
 (Blank	line)
 */
public class Solution {

    public static boolean isMagicSquare(int[][] numbers)
    {
        // considering values are greater than Integer.MIN_VALUE
        int sum1 = Integer.MIN_VALUE;
        int sum2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            // rows
            sum2 = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum2 += numbers[i][j];
            }
            if (sum1 == Integer.MIN_VALUE) {
                sum1 = sum2;
            } else if (sum2 != sum1) {
                return false;
            }

            // cols
            sum2 = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum2 += numbers[j][i];
            }
            if (sum2 != sum1) {
                return false;
            }
        }

        // diagonal from [0][0] to [lenght-1][length-1]
        sum2 = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum2 += numbers[j][j];
        }
        if (sum2 != sum1) {
            return false;
        }

        // diagonal from [length-1-0][0] to [0][length-1-0]
        sum2 = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum2 += numbers[numbers.length-1-j][j];
        }
        if (sum2 != sum1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] numbers = new int[][]{
                {16,3,2,13},
                {3,10,11,8},
                {9,6,7,12},
                {4,15,14,1}};
        System.out.println(isMagicSquare(numbers));

        int[][] numbers1 = new int[][] {
                {4,	9,	2},
                {3,	5,	7},
                {8,	1,	6},
        };

        System.out.println(isMagicSquare(numbers1));

        Scanner sc = new Scanner(System.in);
        String line;
        String inputStringLines = "";
        while(!"".equals(line = sc.nextLine())) {
            inputStringLines += line + " ";
        }

        /*
        4 9 2
        3 5 7
        8 1 6
        */
        String[] numberStrArr = inputStringLines.split("\\s+");
        int N = (int)Math.sqrt(numberStrArr.length);
        int numbers3[][] = new int[N][N];
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                numbers3[i][j] = Integer.parseInt(numberStrArr[k++]);
            }
        }

        System.out.println(isMagicSquare(numbers3));
    }

}
