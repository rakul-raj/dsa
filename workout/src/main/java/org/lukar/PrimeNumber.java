package org.lukar;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number:\n");
        int number = input.nextInt();
        System.out.println(number);

         if(isPrime(number))
             System.out.println("Prime");
         else
             System.out.println("Not a prime number");


    }

    //Complex Optimization 6+ or- 1 ~O(√n/3)
    static boolean isPrime(int n) {

        if (n <= 1) return false;
        if (n <= 3) return true;
        System.out.println(n % 2);
        System.out.println(n % 3);
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            System.out.println(i*i);
            System.out.println("i="+i);
            System.out.println("n % i "+n % i );
            System.out.println("n % (i + 2)"+n % (i + 2));

            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    //Simple Basic check O(n)
    static boolean isPrimeNoOp(int n) {

        for (int i = 2; i < n; i++) {
            System.out.println(n+"%"+i+"= "+n % i);
            if (n % i == 0)
                return false;
        }

        return true;
    }


    //Basic Optimization with sq(N)  O(√n)
    static boolean isPrimeBasicOptimization(int n) {
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }
}
