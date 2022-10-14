package com.tms.task2;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {

        String name1 = "Pavel";
        String name2 = "Pavel";
        String name3 = new String("Pavel");
        System.out.println(name1 + "(name1) = " + name2 + "(name2) - " + (name1 == name2));
        System.out.println(name2 + "(name2) = " + name3 + "(name3) - " + (name2 == name3));
        System.out.println(name1 + "(name1) = " + name3 + "(name3) - " + name1.equals(name3));

        Integer number1 = 1;
        Integer number2 = valueOf(1);
        Integer number3 = new Integer(1);
        System.out.println(number1 + "(number1) = " + number2 + "(number2)- " + (number1 == number2));
        System.out.println(number1 + "(number1) = " + number3 + "(number3)- " + (number1 == number3));
        System.out.println(number1 + "(number1) = " + number3 + "(number3)- " + number1.equals(number3));
        System.out.println();
    }
}
