package com.company;
import java.util.Scanner;
public class Calculation {
    public static void main(String[] args){
        double a,b,add,sub,div,mul;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextDouble();
        System.out.println("Enter the second number:");
        b=sc.nextDouble();
        while(true)
        {
            System.out.println("Enter 1 for add");
            System.out.println("Enter 2 for sub");
            System.out.println("Enter 3 for multiply");
            System.out.println("Enter 4 for div");
            System.out.println("Enter 5 for exit");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1: add = a+b;
                       System.out.println("result of addition is:"+add);
                       break;
                case 2: sub = a-b;
                    System.out.println("result of subtraction is:"+sub);
                    break;
                case 3: mul = a*b;
                    System.out.println("result of multiplication is:"+mul);
                    break;
                case 4: div = a/b;
                    System.out.println("result of division is:"+div);
                    break;
                case 5: System.exit(0);
            }
        }

    }
}
