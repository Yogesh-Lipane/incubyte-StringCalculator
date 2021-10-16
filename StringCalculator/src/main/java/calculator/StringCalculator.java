package main.java.calculator;

public class StringCalculator {
	private final static String delimeter = ",|\n";
    public static int add(String numbers) {
    	 int returnValue = 0;
    	 String[] numbersArray = numbers.split(delimeter);
//         if (numbersArray.length > 2) {
//             throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
//         } else {
             for (String number : numbersArray) {
            	 if (!number.trim().isEmpty()) { 
                     returnValue += Integer.parseInt(number);
                 }
             }
//         }
         return returnValue;
    }

}