package by.epamtc.taskepam01_01.task_08;

public class Task8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int h = 1;
        int c = 12;
        int x = a;
        int y = 0;
        while (x <= b){
       if (x == 15) y= (x + c) *2;
       else y = (x - c) + 6;
            System.out.println("y = " + y + " / x = " + x);
        x = x + h;
        }




    }
}
