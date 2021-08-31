package com.kodilla.testing;
import com.kodilla.testing.user.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.add(6, 5);
        int result1 = calculator.substract(6, 5);

        if (result == 11) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test ERROR");
        }

        if (result1 == 1) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test ERROR");

            }
        }
    }

