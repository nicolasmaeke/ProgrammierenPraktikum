package org.nicolasmaeke.SS14.Praktikum1;

import java.util.Comparator;

/**
 * Klasse vergleicht zwei Kunden miteinander nach dem Alphabet.
 */
public class CustomerComparatorAlphabet implements Comparator<Customer> {
	
	/**
	 * Methode vergleicht erst die Nachnamen miteinander, falls diese mit dem gleichen Buchstaben
	 * beginnen werden auch die Nachnamen verglichen.
	 */
	@Override
	public int compare(Customer customer1, Customer customer2) {
		int ergebnis = 0;
		if (customer1.getLastName().compareTo(customer2.getLastName())== 0){
			if (customer1.getFirstName().compareTo(customer2.getFirstName()) == 0){
				ergebnis = 0;
			
		} else {
			if (customer1.getFirstName().compareTo(customer2.getFirstName()) < 0) {
				ergebnis = -1;
			}
			else{
				ergebnis = 1;
			}}}
			 else 
				if(customer1.getLastName().compareTo(customer2.getLastName()) < 0){
				ergebnis = -1;}
			else{ ergebnis = 1;
			}
		
		return ergebnis;
	}

}
