package main.java.calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	private final static String delimeter = ",|\n";
    public static int add(String numbers) {
    	 int returnValue = 0;
    List<Integer> negativeNumbers = new ArrayList<Integer>();
    	 String[] numbersArray = numbers.split(delimeter);
//         if (numbersArray.length > 2) {
//             throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
//         } else {
             for (String number : numbersArray) {
            	 if (!number.trim().isEmpty()) { 
            		 int numberInt = Integer.parseInt(number.trim());
                     if (numberInt < 0) {
                         negativeNumbers.add(numberInt);
                     }
                     returnValue += numberInt;
                 }
             }
//         }
           if (negativeNumbers.size() > 0) {
                 throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
         }
         return returnValue;
    }

}