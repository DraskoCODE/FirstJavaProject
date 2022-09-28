package com.company;

public class Test {

    public static int temp1 = 24;

    public static void main(String[] args) {
        //printMinNumber(23, 25);
        //printMinNumber(23.0, 25.0);

        Employee employee = new Employee();
        employee.firstName = "Vukasin";
        employee.lastName = "Milosevic";
        System.out.println(employee.calculateSalary("QA"));

        Employee employee1 = new Employee("Stefan", "Radosevic", "DEV");
        System.out.println(employee1.calculateSalary(employee1.position));

        final double PI = 3.14;
        //pi = 3.25;
        staticMetod();
        Test test = new Test();
        test.nonStaticMetod();
        test.temp1 = 3;
        System.out.println(test.temp1);

    }

    public void nonStaticMetod() {
        System.out.println("Non Static");
        System.out.println(Test.temp1);
    }

    public static void staticMetod() {
        System.out.println("Static");
    }

    public String getWebElement() {
        return "";
    }


   /* public int max(int num1, int num2) {

        int max;
        if(num1 > num2) {
            max = num1;
        }
        else {
            max = num2;
        }
        return max;
    }*/



    public static void printMinNumber(int num1, int num2) {

        if(num1 < num2) {
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }

    //overriding
    public static void printMinNumber(int num1, int num2, int num3) {

        if(num1 < num2) {
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }

    }

    //ovelodaing
    public static void printMinNumber(double num1, double num2) {

        if(num1 < num2) {
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }

    public void iteration() {
        int temp3 = 25;
        for (int i= 1; i< 10; i++) {
          int temp = 23;

        }

    }



}
