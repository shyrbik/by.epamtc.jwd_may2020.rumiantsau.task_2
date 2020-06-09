package by.epamtc.taskepam01_01.task_04;

import static java.lang.Math.pow;

public class Task4 {
    public static void main(String[] args) {
        double fX;
        double x = 10;

        if (x > 13)
        fX = -1 * 3 / (x +1);
        else
            fX = -1 * pow(x, 3) + 9;

        System.out.println("F(x) = " + fX);


    }
}
