package org.nicolasmaeke.SS14.Praktikum1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Klasse repr�sentiert einen Web-Shop
 */
public class WebShop {
	
	/**
	 * Aufz�hlungstyp f�r die Sortierkriterien
	 */
	public enum Kriterium {ALPHABET, ID}
	
	/**
	 * Objektvariable f�r die Kundenliste des Shops
	 */
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	/**
	 * Methode zum Hinzuf�gen eines Kunden bekommt Vor- und Nachname �bergeben.
	 * Daraus wird ein neues Kunden-Objekt erzeugt und der Kundenliste angeh�ngt.
	 */
	public void add(String firstName, String lastName){
		Customer next = new Customer(firstName, lastName);
		customerList.add(next);
	}
	
	/**
	 * Methode zum L�schen eines Kunden bekommt Vor- und Nachname �bergeben.
	 * Dann wird die Hilfsmethode zum Suchen des Kunden aufgerufen und dieser wird dann entfernt.
	 */
	public void remove(String firstName, String lastName){
		customerList.remove(search(firstName, lastName));
	}
	
	/**
	 * wandelt das Array in einen String um, der in Tabellenform zur�ckgeliefert wird
	 */
	@Override
	public String toString(){
		String ergebnis = "";
		for(int i = 0; i < customerList.size(); i++){
			ergebnis = ergebnis + customerList.get(i).getLastName() + ", " + customerList.get(i).getFirstName() + "(ID: " + customerList.get(i).getId() + ")" + "\n";
		}
		return ergebnis;
	}
	
	/**
	 * als Sortierkriterium wird ein Enum als Parameter �bergeben
	 * dann wird die Liste sortiert und mit Hilfe von toString ausgegeben
	 */
	public void printCustomerList(Kriterium kriterium){
		if(kriterium == Kriterium.ALPHABET){
			CustomerComparatorAlphabet comp = new CustomerComparatorAlphabet();
			Collections.sort(customerList, comp);
		}
		else {
			CustomerComparatorId comp = new CustomerComparatorId();
			Collections.sort(customerList, comp);
		}
		System.out.println(this.toString());
	}
	
	/**
	 * Hilfsmethode um einen Kunden in der Liste zu finden
	 */
	
	private Customer search(String firstName, String lastName){
	Customer aktuell = null;
	for(Customer element : customerList){
		if(element.getFirstName().equals(firstName) && element.getLastName().equals(lastName)){
			aktuell = element;
			break;
		}	
	}
	return aktuell;
}
}

