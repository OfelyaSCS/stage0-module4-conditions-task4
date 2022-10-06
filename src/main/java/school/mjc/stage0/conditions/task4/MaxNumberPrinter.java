package school.mjc.stage0.conditions.task4;

import java.util.Scanner;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if(first>=second&&first>=third) {
            System.out.println(first);
        }else if(second>=first&&second>=third) {
            System.out.println(second);
        }else System.out.println(third);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();

        MaxNumberPrinter maxNumberPrinter=new MaxNumberPrinter();
        maxNumberPrinter.printGreatest(number1,number2,number3);
    }
}
