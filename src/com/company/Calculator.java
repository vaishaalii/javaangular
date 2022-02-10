package com.company;

import java.util.Scanner;
class Calc1 {
    int result;

    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    public int sub(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    public int mul(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    public int div(int num1, int num2) {
        if (num2 != 0) {
            result = num1 / num2;
            return result;
        }
        return 0;
    }
}

class Calc2{
    private int num1;
    private int num2;

    public  int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public  int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

}

public class Calculator {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1;
        num1 = n.nextInt();
        System.out.println("Enter the second number:");
        int num2;
        num2 = n.nextInt();
        Calc2 obj = new Calc2();
        obj.setNum1(num1);
        obj.setNum2(num2);

        Calc1 calc = new Calc1();
        int addition = calc.add(obj.getNum1(), obj.getNum2());
        System.out.println("Addition is" + addition);

        int subtract = calc.sub(obj.getNum1(), obj.getNum2());
        System.out.println("Subtraction is" + subtract);

        int multiply = calc.mul(obj.getNum1(), obj.getNum2());
        System.out.println("Multiplication is" + multiply);

        int division = calc.div(obj.getNum1(), obj.getNum2());
        if(division!=0 || num1<num2){
            System.out.println("Division is" + division);
        }
        else {
            System.out.println("Division is not possible");

        }
    }
}
