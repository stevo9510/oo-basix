/**
 * Copyright 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * SubmarineTest.java - Contains JUnit Test Cases for the P3 Object
 * 06/20/2018
 * 
 * Note: This class does not include all possible test cases for P3 (e.g. complete code coverage).  I basically 
 * did as many to give myself a good understanding of how to write the tests, and get most of the edge cases.
 */

package defensevehicletests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import defensevehicle.P3;
import defensevehicle.Submarine;

public class SubmarineTest {
	
	private Submarine submarineUnderTest;

	@Before
	public void setUp()  {
		submarineUnderTest = new Submarine(0, 0, "foo", "bar", 0);
	}

	@Test
	public void testSetNumberTorpedosIntValidPositiveNumber() {
		int validPositiveNumber = 10;
		submarineUnderTest.setNumberTorpedos(validPositiveNumber);
		assertEquals(validPositiveNumber, submarineUnderTest.getNumberTorpedos());
	}
	
	@Test
	public void testSetNumberTorpedosIntNegativeNumberWillNotSetValue() {
		int currentValue = submarineUnderTest.getNumberTorpedos();
		int invalidPositiveNumber = -9;
		submarineUnderTest.setNumberTorpedos(invalidPositiveNumber);
		assertEquals(currentValue, submarineUnderTest.getNumberTorpedos());
	}

	@Test
	public void testSetNumberTorpedosIntWithTooLargeValueWillSetToMaxValue() {
		int tooLargeValue = Submarine.MAX_TORPEDOS + 5;
		submarineUnderTest.setNumberTorpedos(tooLargeValue);
		assertEquals(Submarine.MAX_TORPEDOS, submarineUnderTest.getNumberTorpedos());
	}
	
	@Test
	public void testSetNumberTorpedosStringWithValidPositiveNumberWillSetValue() {
		String validValue = "7";
		submarineUnderTest.setNumberTorpedos(validValue);
		assertEquals(7, submarineUnderTest.getNumberTorpedos());	
	}
	
	@Test
	public void testSetNumberTorpedosStringWithNonNumericValueWillSetToDefaultValue() {
		String invalidValue = "Foo";
		submarineUnderTest.setNumberTorpedos(invalidValue);
		assertEquals(Submarine.DEFAULT_TORPEDOS, submarineUnderTest.getNumberTorpedos());	
	}

	@Test
	public void testSetNumberTorpedosStringWithTooLargeValueWillSetToMaxValue() {
		int tooLargeValue = Submarine.MAX_TORPEDOS + 5;
		String tooLargeValueAsString = tooLargeValue + "";
		submarineUnderTest.setNumberTorpedos(tooLargeValueAsString);
		assertEquals(Submarine.MAX_TORPEDOS, submarineUnderTest.getNumberTorpedos());	
	}
	
	@Test
	public void testSetNumberTorpedosStringWithNegativeValueWillNotSetValue() {
		int currentValue = submarineUnderTest.getNumberTorpedos();
		String negativeStringValue = "-4";
		submarineUnderTest.setNumberTorpedos(negativeStringValue);
		assertEquals(currentValue, submarineUnderTest.getNumberTorpedos());	
	}

	@Test
	public void testToString() {
		submarineUnderTest.setLength(5);
		submarineUnderTest.setName("MyTestNameProperty");
		submarineUnderTest.setNumberTorpedos(9);
		submarineUnderTest.setSpeed(40);
		submarineUnderTest.setType("very cool");
		String subToString = submarineUnderTest.toString();
		// this test is less strict.  only check that it contains certain information, but doesn't care of what order it is in.
		if(!subToString.contains("Length: 5 meters") 
				|| !subToString.contains("Torpedos: 9") 
				|| !subToString.contains("Speed: 40 knots")
				|| !subToString.contains("Name: MyTestNameProperty")
				|| !subToString.contains("Type: very cool")
				|| !subToString.contains("Submarine Ship"))
		{
			fail("The toString does not contain some of the proper or required information.");
		}
	}

}
