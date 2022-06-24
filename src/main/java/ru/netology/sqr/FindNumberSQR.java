package ru.netology.sqr;

public class FindNumberSQR {
    public int calculate(int from, int to) {
        int numberSqr = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= from && i * i <= to) {
                numberSqr = numberSqr + 1;
            }
        }
        return numberSqr;
    }
}
