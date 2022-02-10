package com.company;
//abstraction--> just the overview (implementing important one ).

abstract class RBILoanCalculator{
    //method signature  abstract method means just signature no body
     abstract void emiCalculator(int rate);
}

class SBIBank extends RBILoanCalculator{


    @Override
    void emiCalculator(int rate) {
        System.out.println("calculation of sbi bank"+rate);
    }
}
class HDFCBank extends RBILoanCalculator{


    @Override
    void emiCalculator(int rate) {
        System.out.println("calculation of hdfc bank"+rate);
    }
}

public class TestAbstraction {
    public static void main(String[] args){
        SBIBank obj = new SBIBank();
        obj.emiCalculator(4);

        HDFCBank obj1 = new HDFCBank();
        obj1.emiCalculator(5);



    }
}
