package org.nicolasmaeke.SS14.Praktikum1;

/**
 * Klasse repr�sentiert einen Kunden
 */
public class Customer {
	/**
	 * Klassenvariable f�r einen statischen Z�hler
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
	 * Konstruktor bekommt den Vor- und Nachname �bergeben und speichert diese in den zugeh�rigen Variablen.
	 * Au�erdem wird der Z�hler erh�ht und der ID wird der Wert des Z�hlers zugewiesen.
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
