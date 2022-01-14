package com.kodilla.testing.testing;

import com.kodilla.testing.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        int addResult = calculator.add(a, b);
        int subtractResult = calculator.subtract(a,b);

        if(addResult == 15){
            System.out.println("add test OK");
        }else{
            System.out.println("Error! add method");
        }

        if(subtractResult == 5){
            System.out.println("subtract test OK");
        }else{
            System.out.println("Error! subtract method");
        }
    }
}
