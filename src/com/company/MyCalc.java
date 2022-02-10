package com.company;
class Calculator1{
    int num1;
    int num2;
    Calculator1(int a,int b){
        this.num1 = a;
        this.num2 = b;
    }
    public int addition() {
        int result = this.num1 + this.num2;
        return result;
    }
    public int subtraction(){
        int result = this.num1-this.num2;

        return result;
    }
}
public class MyCalc {
    public static void main(String[] args){
        Calculator1 obj = new Calculator1(45,34);
        System.out.println(obj.addition());
        System.out.println(obj.subtraction());

    }
}
