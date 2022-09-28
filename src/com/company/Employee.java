package com.company;

public class Employee {

    //firstName
    //lastName
    //position

    //calculateSalary
    public String firstName;
    public String lastName;
    public String position;
    public int age;
    public Company company;



    public Employee(String name, String secondName) {
        this.firstName = name;
        this.lastName = secondName;
    }

    public Employee(String name, String secondName, String position) {
        this.firstName = name;
        this.lastName = secondName;
        this.position = position;
    }

    public Employee(String name, String secondName, String position, int godine, Company company) {
        this.firstName = name;
        this.lastName = secondName;
        this.position = position;
        this.age = godine;
        this.company = company;
    }

    public Employee() {

    }


    public void printCompanyName() {
        System.out.println(company.name);
    }

    public double calculateSalary(String position) {
        double salary = 0;

        if(position.equals("QA")) {
            salary = 500;
        }
        else if(position.equals("DEV")) {
            salary = 750;
        }
        else if(position.equals("PO")) {
            salary = 800;
        }

        return salary;

    }

    public static void printMessage() {
        System.out.println("Emp message");
    }


}
