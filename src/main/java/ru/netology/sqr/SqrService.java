package ru.netology.sqr;

public class SqrService {
    public int counter(int min, int max) {
        int counter = 0;
        int x;
        for (x = 10; x <= 99; x++) {
            if (x * x >= min & x * x <= max) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
