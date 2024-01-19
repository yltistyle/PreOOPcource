package edu.penzgtu.oop.Application;

public class Fibonacci {
    private static final long[] cache = new long[10003];

    public static long recursiveFibo(int n) {
        if (n < 3) {
            return 1;
        }
        return recursiveFibo(n-1) + recursiveFibo(n-2);
    }

    public static long cacheFibo(int n) {
        if (n < 3) {
            cache[n] = 1;
            return 1;
        }
        if (cache[n-1] != 0) {
            long rs = cache[n-1] + cache[n-2];
            cache[n] = rs;
            return rs;
        }
        return cacheFibo(n-1) + cacheFibo(n-2);
    }

    public static long iterativeFibo(int n) {
        int left = 0; int right = 1; int member = 0;

        for (int i = 0; i < n-1; i++) {
            member = left + right;
            left = right;
            right = member;
        }
        return member;
    }
}
