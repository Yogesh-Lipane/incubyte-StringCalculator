package test.java.calculator;
import main.java.calculator.*;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIs0() {
	    Assert.assertEquals(0, StringCalculator.add(""));
	}
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
	    Assert.assertEquals(3, StringCalculator.add("3"));
	}
	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
	    Assert.assertEquals(3+6, StringCalculator.add("3,6"));
	}
	 @Test
	    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
	        Assert.assertEquals(3+6+15+18+46+33, StringCalculator.add("3,6,15,18,46,33"));
	 }
	 @Test
	    public final void newLineBetweenNumbers() {
	        Assert.assertEquals(6, StringCalculator.add("1\n2,3"));
	 }
	 @Test
	 public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
		 RuntimeException exception = null;
		    try {
		        StringCalculator.add("3,-6,15,46,33");
		    } catch (RuntimeException e) {
		        exception = e;
		    }
	 }
	 
}
