package ch01.ex16;

/**
 * 16.	Improve	the	average	method	so	that	it	is	called	with	at	least	one	parameter.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(average(5));
        System.out.println(average(5,2,4,5));
        System.out.println(average(4,5,6,7,7,8,9));
    }

    public static int average(int firstParameter, int ... otherParameters)
    {
        int sum = firstParameter;
        int divisor = 1;
        for (int param : otherParameters) {
            sum += param;
        }

        if (otherParameters.length > 0)
            divisor += otherParameters.length;

        return sum / divisor;
    }
}
