package by.epamtc.taskepam01_01.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    //не использовать массивы, реализовать на свитчах
    //целочисленное деление использовать
    public static void main(String[] args) throws IOException {
        int numberOfDay = 625;
        int day = 0;
        int month = 0;
        int res = numberOfDay;
        int defaultMounth = 1;

        //если введено число больше 365
        if (numberOfDay > 365) numberOfDay = numberOfDay % 365;

        for (int i = 1; i < 12; i++) {

        switch (defaultMounth){
            // для февраля
            case(2):
                res = res - 28;
                break;
            // для августа
            case(8):
                res = res - 31;
                break;
            default:
            //для четных месяцев
            if ((defaultMounth % 2) == 0)
                res = numberOfDay - 30;
            //для нечетных месяцев
            else
                res = numberOfDay - 31;
                break;
        }
        //конец свитча
            if (res < 0)
            {
                day = numberOfDay;
                month = i;
                break;
            }

            numberOfDay = res;
            defaultMounth++;
        }

        System.out.println("Current Date: Day " + day + " / Month " + month);







    }
}
