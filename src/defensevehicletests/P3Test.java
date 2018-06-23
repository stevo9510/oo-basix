/**
 * Copyright 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * P3Test.java - Contains JUnit Test Cases for the P3 Object
 * 06/20/2018
 * 
 * Note: This class does not include all possible test cases for P3 (e.g. complete code coverage).  I basically 
 * did as many to give myself a good understanding of how to write the tests, and get most of the edge cases.
 */

package defensevehicletests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import defensevehicle.Aircraft;
import defensevehicle.P3;

public class P3Test {

	private P3 p3UnderTest;
	
    @Before
    public void setUp() {
    	p3UnderTest = new P3("stub type");
    }
    
	@Test
	public void testSetNumberEnginesWithValidValueWillSave() {
		int positiveNumberEngines = 5;
		p3UnderTest.setNumberEngines(positiveNumberEngines);
		assertEquals(positiveNumberEngines, p3UnderTest.getNumberEngines());
	}
	
	@Test 
	public void testSetNumberEnginesNegativeNumberDefaultsTheValue() {
		int negativeNumberEngines = -5;
		p3UnderTest.setNumberEngines(negativeNumberEngines);
		assertEquals(P3.DEFAULT_NUMBER_OF_ENGINES, p3UnderTest.getNumberEngines());
	}
	
	@Test
	public void testSetNumberEnginesTooLargeValueDefaultsToMaxValue() {
		int greaterThanMaxValue = P3.MAX_ENGINES + 1;
		p3UnderTest.setNumberEngines(greaterThanMaxValue);
		assertEquals(P3.MAX_ENGINES, p3UnderTest.getNumberEngines());
	}

	@Test 
	public void testSetLengthWithValidValueWillSave() {
		int validValue = 53;
		p3UnderTest.setLength(validValue);
		assertEquals(validValue, p3UnderTest.getLength());
	}
	
	@Test
	public void testSetLengthWillNotSetValueForNegativeNumber() {
		int currentLength = p3UnderTest.getLength();
		int negativeNumber = -2;
		p3UnderTest.setLength(negativeNumber);
		assertEquals(currentLength, p3UnderTest.getLength());
	}

	@Test
	public void testSetLengthWillNotSetValueForTooLargeValue() {
		int currentLength = p3UnderTest.getLength();
		int greaterThanMaxValue = Aircraft.MAX_LENGTH + 2;
		p3UnderTest.setLength(greaterThanMaxValue);
		assertEquals(currentLength, p3UnderTest.getLength());
	}
	
	@Test
	public void testSetSpeedStringToInvalidNumberWillNotSetValue() {
		int currentSpeed = p3UnderTest.getSpeed();
		String invalidValue = "Foo";
		p3UnderTest.setSpeed(invalidValue);
		assertEquals(currentSpeed, p3UnderTest.getSpeed());
	}

	@Test
	public void testSetSpeedStringToValidNumberWillSetValue() {
		 String validSpeed = "150";
		 p3UnderTest.setSpeed(validSpeed);
		 assertEquals(150, p3UnderTest.getSpeed());
	}
	
	@Test
	public void testSetSpeedStringToNegativeNumberWillNotSetValue() {
		 int currentSpeed = p3UnderTest.getSpeed();
		 String invalidSpeed = "-150";
		 p3UnderTest.setSpeed(invalidSpeed);
		 assertEquals(currentSpeed, p3UnderTest.getSpeed());
	}
	
	@Test
	public void testSetTypeToAStringWillSetCorrectly() {
		String someType = "foobarbaz";
		p3UnderTest.setType(someType);
		assertEquals(someType, p3UnderTest.getType());
	}

	@Test
	public void testSetAltitudeToNegativeNumberWillNotSetValue() {
		int currentAltitude = p3UnderTest.getAltitude();
		int badAltitude = -33;
		p3UnderTest.setAltitude(badAltitude);
		assertEquals(currentAltitude, p3UnderTest.getAltitude());
	}

    @Test
    public void testSimpleConstructorSetsDefaultValuesCorrectly() {
    	String type = "some type";
    	P3 simpleConstructorP3 = new P3(type);
    	assertEquals(type, simpleConstructorP3.getType());
    	assertEquals(P3.DEFAULT_LENGTH, simpleConstructorP3.getLength());
    	assertEquals(P3.DEFAULT_NAME, simpleConstructorP3.getName());
    	assertEquals(P3.DEFAULT_NUMBER_OF_ENGINES, simpleConstructorP3.getNumberEngines());
    	assertEquals(P3.DEFAULT_ALTITUDE, simpleConstructorP3.getAltitude());
    	assertEquals(P3.DEFAULT_SPEED, simpleConstructorP3.getSpeed());
    }
    
}
