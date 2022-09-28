package com.company;

public class Brojevi {

    public class Parni {
        Brojevi brojevi = new Brojevi();

    }

    //Sve dvocifrene parne brojeve
   public void returnParni(int min, int max) { // 10 - 100
        //int sum = 0;
        for(int i = min; i < max; i++) {
            int sum = 0;
            if(i%2 == 0) {
                System.out.println(i);
                sum = 7;
            }
        }
        //sum = 8;
    }

    //Overriding
    public static void returnParni(int min, int max, String message) { // 10 - 100
        for(int i = min; i < max; i++) {
            if(i%2 == 0) {
                System.out.println(i);

            }
        }
    }

    //Overloading
    public static void returnParni(double min, double max) { // 10 - 100
        for(double i = min; i < max; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int max(int num1, int num2) {
        int toReturn;
        if(num1 > num2) {
            toReturn = num1;
        }
        else {
            toReturn = num2;
        }
        return toReturn;
    }

    /*public int[] returnParni(int min, int max) { // 10 - 100
        int[] toReturn = {3};

        return toReturn;
    }*/

    public static void main(String[] args) {
        Brojevi brojevi = new Brojevi();
        brojevi.returnParni(10, 100);
        returnParni(10.0, 50.2);
        max(52, 26);
        //brojevi.returnParni(53, 68);

    }

}
