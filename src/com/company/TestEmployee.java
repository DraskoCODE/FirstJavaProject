package com.company;

public class TestEmployee {

    public static void main(String[] args) {
        final double PI = 3.14;

        Employee employee = new Employee();
        employee.firstName = "Stefan";
        employee.lastName = "Ivanovic";
        employee.position = "DEV";
        employee.age = 30;

        Department department = new Department();

        Company company = new Company();
        company.name = "Symphony";
        company.city = "Nis";
        employee.company = company;
        System.out.println(employee.calculateSalary(employee.position));

        Employee employee1 = new Employee("Nikola", "Mandic", "QA", 25, new Company("VegaIT", "Nis"));

        Employee.printMessage();

        System.out.print(employee.firstName);
    }

}
