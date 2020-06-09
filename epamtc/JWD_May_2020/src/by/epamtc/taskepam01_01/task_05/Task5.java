package by.epamtc.taskepam01_01.task_05;


public class Task5 {
    public static void main(String[] args) {
        int hundreds;
        int dozens;
        int units;
        int number = 137;

        units = number % 100 % 10;
        dozens = (number - units) / 10 % 10;
        hundreds = (number - dozens*10 - units)/100;

        System.out.println("Sum = " + (units + dozens + hundreds));
        System.out.println("Div = " + units * dozens * hundreds);
        //число, полученное перестановкой цифр сотен и десятков;
        System.out.println("Reverse hundreds and dozens = " + (dozens*100 + hundreds * 10 + units));
        //четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч (например,
        // из числа 137 необходимо получить число 7137).
        System.out.println("4count number = " + (units*1000 + number));




    }
}
