package com.hackerrank.java.introduction;

import java.util.Scanner;

public class IfElse {
    /*
    Task
    Given an integer, n, perform the following conditional actions:

    If n is odd, print Weird
    If n is even and in the inclusive range of  to , print Not Weird
    If n is even and in the inclusive range of  to , print Weird
    If n is even and greater than , print Not Weird
    Complete the stub code provided in your editor to print whether or not  is weird.

    Input Format

    A single line containing a positive integer, n.

    Constraints
    1<=n<=100
    Output Format

    Print Weird if the number is weird; otherwise, print Not Weird.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (!(N % 2 == 0)) {
            System.out.println("Weird");
        } else if ((N % 2 == 0) && (2 <= N) && (N <= 5)) {
            System.out.println("Not Weird");
        } else if ((N % 2 == 0) && (6 <= N) && (N <= 20)) {
            System.out.println("Weird");
        } else if (N > 20) {
            System.out.println("Not Weird");
        }
    }
}
