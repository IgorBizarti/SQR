package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int minvalue, int maxvalue) {

        int result = 0;
        for (int i = 10; i <= 99; i++) {
            int ii = i * i;
            if (ii > minvalue) {
                if (ii < maxvalue) {
                    result = result + 1;
                }
            }

        }
        return result;
    }
}
