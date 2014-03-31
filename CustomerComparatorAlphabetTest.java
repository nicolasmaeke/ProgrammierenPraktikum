package org.nicolasmaeke.SS14.Praktikum1;

import org.junit.Test; 

import static org.junit.Assert.*;

public class CustomerComparatorAlphabetTest {
	
		
	@Test
	public void testCompare(){
		
		Customer one = new Customer("Uli","Hoeneﬂ");
		Customer two = new Customer("Dieter", "Hoeneﬂ");
		Customer three = new Customer("Dieter", "Hoeneﬂ");
		Customer four = new Customer("Hansi", "Flick");
		Customer five = new Customer("Hansi", "Mueller");
		
		CustomerComparatorAlphabet comp = new CustomerComparatorAlphabet();
		
		assertEquals(1, comp.compare(one, two));
		assertEquals(0, comp.compare(two, three));
		assertEquals(1, comp.compare(three, four));
		assertEquals(-1, comp.compare(four, five));
	
	}

}