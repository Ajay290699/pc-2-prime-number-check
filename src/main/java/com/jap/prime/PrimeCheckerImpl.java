package com.jap.prime;

public class PrimeCheckerImpl {

    public boolean primeNumberCheck(int number) {

        // write the logic here to check is a number is prime or not
        PrimeChecker primeChecker = number1 -> {
            int count = 0;
            if (number1 == 0 || number1 == 1) {
                return false;
            }
            for (int i = 2; i < number1; i++) {
                if (number1 % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                return true;
            }
            return false;
        };
        return primeChecker.isPrimeNumber(number);
    }

}
