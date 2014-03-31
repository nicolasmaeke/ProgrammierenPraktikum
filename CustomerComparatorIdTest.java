package org.nicolasmaeke.SS14.Praktikum1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerComparatorIdTest {

	@Test
	public void testCompare(){
		
		Customer one = new Customer("Uli","Hoeneﬂ");
		Customer two = new Customer("Dieter", "Hoeneﬂ");
		
		CustomerComparatorId comp = new CustomerComparatorId();

		assertEquals(-1, comp.compare(one, two));
		assertEquals(1, comp.compare(two, one ));
		assertEquals(0, comp.compare(one, one));
		
	
	}
}
