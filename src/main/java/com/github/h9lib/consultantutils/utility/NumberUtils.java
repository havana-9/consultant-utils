package com.github.h9lib.consultantutils.utility;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumberUtils {

    /**
     * @param n
     * @return true if the int argument is a prime number
     */
    public static boolean isPrime(int n) {
        return n > 1 && IntStream
                .rangeClosed(2, n - 1)
                .noneMatch(divisor -> n % divisor == 0);
    }

    /**
     * @param n
     * @return true if the long argument is a prime number
     */
    public static boolean isPrime(long n) {
        return n > 1 && LongStream
                .rangeClosed(2, n - 1)
                .noneMatch(divisor -> n % divisor == 0);
    }
}
