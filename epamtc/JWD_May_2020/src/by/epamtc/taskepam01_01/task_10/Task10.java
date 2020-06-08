package by.epamtc.taskepam01_01.task_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numberFirst;
        int numberSecond;
        int countNumbers = 1; //число введенных чисел
        boolean increasing = true; //флаг возрастания последовательности
        boolean samePairNumbers = false; //флаг одинаковых чисел подряд
        boolean plusMinus = true; //флаг чередования отритцательных и положительных чисел

        System.out.println("Input number");
        numberFirst=Integer.parseInt(input.readLine());
        if (numberFirst != 0)
        while((numberSecond= Integer.parseInt(input.readLine())) != 0){
            if (numberFirst == numberSecond) samePairNumbers = true;
            if (numberFirst >= numberSecond) increasing = false;
            if ((numberFirst * numberSecond) > 0) plusMinus = false;

            numberFirst = numberSecond;
            countNumbers++;
        }

        if (countNumbers == 1)
            System.out.println("Less than two numbers entered");
        else
            System.out.println("Is the sequence increasing? " + increasing + "\n"
                    + "Is there at least one pair of identical adjacent numbers in the sequence? " + samePairNumbers
                    + "\n" + "Is the sequence alternating? " + plusMinus);


    }
}
