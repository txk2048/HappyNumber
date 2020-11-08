package org.txk64;

import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (true) {
            int sumOfSquares = 0;
            while (n > 0) {
                int digit = n % 10;
                n /= 10;

                sumOfSquares += digit * digit;
            }

            if (sumOfSquares == 1)
                return true;

            else if (seen.contains(sumOfSquares))
                return false;

            seen.add(sumOfSquares);
            n = sumOfSquares;
        }
    }
}
