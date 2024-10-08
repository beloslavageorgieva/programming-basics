package NestedLoops_02;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeSum = 0;
        int nonPrimeSum = 0;

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = true;

                for (int divisor = 2; divisor <= number - 1; divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeSum += number;
                } else {
                    nonPrimeSum += number;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);
    }
}
