package by.epamtc.taskepam01_01.task_03;
import static java.lang.Math.abs;

public class Task3 {
    public static void main(String[] args) {
        double a = 10;
        double b = 9;
        double c = -8;

        if(a > b && b > c) {
            a = abs(a*2);
            b = abs(b*2);
            c = abs(c*2);
        }

        System.out.println("a = " + a + " / b = "+ b + " / c = " + c);


    }
}
