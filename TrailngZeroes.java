// Given an integer n, write a function that returns count of trailing zeroes in n!. 
// Examples : 

// Input: n = 5
// Output: 1 
// Factorial of 5 is 120 which has one trailing 0.

// Input: n = 20
// Output: 4
// Factorial of 20 is 2432902008176640000 which has
// 4 trailing zeroes.

// Input: n = 100
// Output: 24

public class TrailngZeroes {

    static int findTrailingZeros(int n) {
        if (n < 0)
            return -1;

        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Count of trailing 0s in " + n + "! is " + findTrailingZeros(n));
    }
}
