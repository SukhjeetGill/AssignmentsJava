package BankingSystemSimulator;

import java.util.Scanner;

public class Calculator {
        private double num1,num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return num1+num2;
        }
        public double subtract(){
        return num1-num2;
        }
        public double multiply(){
        return num1*num2;
        }
        public double divide(){
            if (num1 != 0) {
                return num2 / num1;
            } else {
                throw new ArithmeticException("Cannot divide by zero.");
            }
        }
}
