package school.mjc.stage0.conditions.task4;

import java.util.Scanner;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println(first>=(second>=third?second:third)?first:(second>=third?second:third));
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();

        TernaryMaxNumberPrinter ternaryMaxNumberPrinter=new TernaryMaxNumberPrinter();
        ternaryMaxNumberPrinter.printGreatest(number1,number2,number3);
    }
}
