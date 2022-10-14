package com.tms.task1;

public class Main {
    public static void main(String[] args) {

        User Pavel = new User("Pavel", "Kovalev", 23, MaritalStatus.Single,
                new CompanyName("FarmOstrov", "Minsk"));
        User Katya = new User("Katya", "Kozlova", 31, MaritalStatus.Married,
                new CompanyName("Zalog uspeha", "Borisov"));
        User Pavel2 = new User("Pavel", "Kovalev", 23, MaritalStatus.Single,
                new CompanyName("FarmOstrov", "Minsk"));

        System.out.println(Pavel.equals(Pavel2));
        System.out.println("ivan1 hashCode: " + Pavel.hashCode());
        System.out.println("ivan2 hashCode: " + Pavel2.hashCode());
        System.out.println(Pavel.equals(Katya));
        System.out.println("ivan1 hashCode: " + Pavel.hashCode());
        System.out.println("ivan2 hashCode: " + Katya.hashCode());
    }
}
