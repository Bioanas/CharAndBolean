package com.ia;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2 bytes)
	    char myChar = '\u00A9';
        System.out.println("Unicode output was = " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char myChar2 = '\u00AE';
        System.out.println("Unicode output was = " + myChar2);

        String myString = "This is a string";
        System.out.println("myString is equal to " +  myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " +  myString);
        myString = myString + "\u00A9 2015";
        System.out.println("myString is equal to " +  myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is  " +  numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to: " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastStriing is equal to: " + lastString);
    }
}
