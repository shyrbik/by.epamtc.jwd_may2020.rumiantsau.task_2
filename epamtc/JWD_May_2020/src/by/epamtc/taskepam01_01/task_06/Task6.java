package by.epamtc.taskepam01_01.task_06;
//через знак д вычислить переполнение сверху или снизу будет
public class Task6 {
    public static void main(String[] args) {
        int a1 =-1;
        int d = -10;

        System.out.println("Sn is out of range of INT type while n =" + calcOutOfRangInt(a1, d));

        System.out.println("Sn is out of range of LONG type while n =" + calcOutOfRangLong(a1, d));

    }

    private static int calcOutOfRangInt(int a1, int d){
        int an;
        int sum = 0;
        int n = 2;

        if (d > 0)
            do {
                an = a1 + (n - 1) * d;
                sum = (a1 + an) * n / 2;
                n += 1;
            } while (sum > 0);
        else
            do {
                an = a1 + (n - 1) * d;
                sum = (a1 + an) * n / 2;
                n += 1;
            } while (sum < 0);
        return n;
    }

    private static long calcOutOfRangLong(int a1, int d){
        long an;
        long sum = 0;
        int n = 2;

        if (d > 0)
            do {
                an = a1 + (n - 1) * d;
                sum = (a1 + an) * n / 2;
                n += 1;
            } while (sum > 0);
        else
            do {
                an = a1 + (n - 1) * d;
                sum = (a1 + an) * n / 2;
                n += 1;
            } while (sum < 0);
        return n;
    }

}
