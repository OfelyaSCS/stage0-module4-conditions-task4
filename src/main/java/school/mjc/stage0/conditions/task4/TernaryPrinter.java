package school.mjc.stage0.conditions.task4;

import java.util.Scanner;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        System.out.println(first > second ? first : second);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        TernaryPrinter ternaryPrinter=new TernaryPrinter();
        ternaryPrinter.printWhichIsBigger(number1,number2);
    }
}