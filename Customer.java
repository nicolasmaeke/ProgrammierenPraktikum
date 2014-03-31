package org.nicolasmaeke.SS14.Praktikum1;

/**
 * Klasse repräsentiert einen Kunden
 */
public class Customer {
	/**
	 * Klassenvariable für einen statischen Zähler
	 */
	public static int zaehler = 0;
	/**
	 * Objektvariablen: 
	 * Ein Kunde hat eine Vor- und Nachnamen und eine eindeutige ID.
	 */
	private String firstName;
	private String lastName;
	private final int id;
	
	/**
	 * Konstruktor bekommt den Vor- und Nachname übergeben und speichert diese in den zugehörigen Variablen.
	 * Außerdem wird der Zähler erhöht und der ID wird der Wert des Zählers zugewiesen.
	 * Damit ist die ID eindeutig.
	 */
	public Customer(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		zaehler ++;
		id = zaehler;
		}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


}
