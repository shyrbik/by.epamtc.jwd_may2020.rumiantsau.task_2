package taskepam01_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        double a = 2;
        double b = 3;
        double c = 4;
        double result;

        result = b + sqrt(b*b + 4*a*c) / (2 *a) - a*a*a*c + pow(b, -2);
        System.out.println("result =" + result);

    }








}
