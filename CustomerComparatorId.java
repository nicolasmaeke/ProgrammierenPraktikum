package org.nicolasmaeke.SS14.Praktikum1;

import java.util.Comparator;

/**
 * Klasse vergleicht zwei Kunden nach ihrer ID miteinander.
 */
public class CustomerComparatorId implements Comparator<Customer>{

	/**
	 * Methode subtrahiert die ID's der beiden Kunden voneinander und liefert das Ergebnis zurück.
	 */
	@Override
	public int compare(Customer customer1, Customer customer2) {
		int ergebnis = customer1.getId() - customer2.getId();
		return ergebnis;
	}

}
