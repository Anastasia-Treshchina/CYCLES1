package ru.netology.sqr;

public class SQRService {
    public int howManySquares(int startNumber, int lastNumber) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            for (int j = startNumber; j <= lastNumber; j++) {
                if (i * i == j) {
                    count++;
                }
            }
        }
        return count;
    }
}
