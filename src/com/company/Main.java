package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

   public static void main(String[] args) {
        System.out.println("Hello");

       int count;
       count = 280;
       count = 230;
       //count = count + 20;
       count += 20;
       System.out.println(count);

       String firstName = "John";
       String lastName = "Doe";

       System.out.println(firstName + " "+  lastName);
       firstName.length();
       firstName.indexOf('o');
       firstName.substring(2);

       //int x = 100 + 50;

       int x = 10;
       int y = 5;
       if (x < 20)  {
           if(y < 10) {
               System.out.print("This is if statement");
           }
       }
       else {
           System.out.print("This is else statement");
       }

       int temp1 = 6;

       switch (temp1) {
           case 5:
               System.out.println("5");
               break;
           case 6:
               System.out.println("6");
               break;
           case 10:
               System.out.println("10");
               break;
       }

       for(int z = 10; z < 20; z = z +1) {
           if(z == 13)
               continue;
           System.out.println(z);
       }

       int[] numbers = {10, 25, 30, 85, 5, 78, 15, 10};

       int sum = 0;
       //Sum
       for(int k = 0; k < numbers.length; k++) {
           sum += numbers[k];
       }
       System.out.println("Zbir brojeva niza :" + sum);

       //Max number, Min
       //int maxNumber = numbers[0];
       int minNumber = numbers[0];
       for(int k = 1; k < numbers.length; k++) {
           /*if(maxNumber < numbers[k]) {
               maxNumber = numbers[k];
           }*/
           if(minNumber > numbers[k]) {
                minNumber = numbers[k];
           }
       }
       System.out.println("Max number :" + minNumber);


       System.out.println(numbers[0]);
       System.out.println(numbers[3]);

       for(int num : numbers) {
           System.out.println(num);
       }

       for(int j = 0; j < numbers.length; j++) {
           System.out.println(numbers[j]);
       }

       int m = 5;

       while(m < 4) {
           System.out.println(m);
           m++;
       }

       do {
           System.out.println(m);
       }
       while(m < 4);



       List<Integer> l2 = new ArrayList<Integer>();
       l2.add(3);
       l2.add(5);
       l2.add(2);

       for(int i = 0; i < l2.size(); i++) {
           System.out.println(l2.get(i));
       }

       HashMap<Integer, String> map = new HashMap<>();
       map.put(1, "Stefan");
       map.put(2, "Stefan");
       map.put(4, "Stefan");
       map.put(4, "Stefan");

       HashMap<Integer, List<String>> map1 = new HashMap<>();
       List<String> row_1 = new ArrayList<String>();
       row_1.add("123");
       row_1.add("QA");
       row_1.add("Nis");

       List<String> row_2 = new ArrayList<String>();
       row_2.add("124");
       row_2.add("DEV");
       row_2.add("Kragujevac");

       map1.put(1, row_1);
       map1.put(2, row_2);

       System.out.println(map1.get(1).get(0) + " " +  map1.get(1).get(1) + " "+  map1.get(1).get(2));



       System.out.println(map.get(1));
       System.out.println(map.get(4));

       System.out.println("");

       Test test = new Test();
       //test.max(2, 5);

       Brojevi brojevi = new Brojevi();
       brojevi.returnParni(10, 50);
       }



    }

    //System.out.println("Hello");


