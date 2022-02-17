package ru.netology.sqr;

public class SQRService {
    public int howManySquares(int startNumber, int lastNumber) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= lastNumber && startNumber <= i * i) {
                count++;
            }
        }
        return count;
    }
}


