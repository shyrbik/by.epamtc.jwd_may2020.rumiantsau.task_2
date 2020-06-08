package by.epamtc.taskepam01_01.task_07;

public class Task7 {
    public static void main(String[] args) {
        double r = 111.222;
        int a = (int) (r * 1000);
        int hungreds = a % 1000;
        int thouthends = (a - hungreds) / 1000;

        System.out.println(hungreds + "." + thouthends);

        r = (double)((hungreds * 1000) + thouthends) / 1000;
        System.out.println(r);






    }
}
