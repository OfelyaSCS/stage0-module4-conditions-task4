package school.mjc.stage0.conditions.task4;

import java.util.Scanner;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result=first>second?10:-10;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int number1=input.nextInt();
        int number2=input.nextInt();

        TernaryAssignment ternaryAssignment=new TernaryAssignment();
        ternaryAssignment.assignAndPrintBasedOnWhichBigger(number1,number2);
    }
}
