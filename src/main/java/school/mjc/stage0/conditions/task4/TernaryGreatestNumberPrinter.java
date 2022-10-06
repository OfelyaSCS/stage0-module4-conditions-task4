package school.mjc.stage0.conditions.task4;

import java.util.Scanner;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int greatest=first>second?first:second;
        System.out.println(greatest);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int number1=input.nextInt();
        int number2=input.nextInt();

        TernaryGreatestNumberPrinter ternaryGreatestNumberPrinter=new TernaryGreatestNumberPrinter();
        ternaryGreatestNumberPrinter.printGreatest(number1,number2);

    }
}
