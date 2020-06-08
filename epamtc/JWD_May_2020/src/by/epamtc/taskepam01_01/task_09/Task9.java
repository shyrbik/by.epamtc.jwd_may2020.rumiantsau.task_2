package by.epamtc.taskepam01_01.task_09;

public class Task9 {
    public static void main(String[] args) {
        int sum = 3;
        int finalSum = 0;

        for (int i = 3; i < 11; i++) {
            finalSum = sum * (sum + i);
            sum = sum + i;
        }

        System.out.println("finalSum = " + finalSum);

    }
}
