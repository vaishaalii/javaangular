package com.company;
class Example1{
    public void addition(int x ,int y){
        System.out.println("from parent");
        System.out.println(x+y);
    }
}

class Scientific extends Example1{
    public void addition(int x ,int y){    //if the child has the same method child will execute or else parent.
        System.out.println("from child");
        System.out.println(x+y);
    }
}
public class TestOverriding {
    public static void main(String[] args){
        Scientific obj =  new Scientific();   //from child class
        obj.addition(4,5);

        Example1 obj1 = new Scientific();    //from child class
        obj1.addition(3,4);

        Example1 obj2 =  new Example1();     //this will take frm parent class
        obj2.addition(4,6);


    }
}
