package org.nicolasmaeke.SS14.Praktikum1;

import org.nicolasmaeke.SS14.Praktikum1.WebShop.Kriterium;

public class Test {

	public static void main(String[] args) {
		
		WebShop webshop = new WebShop();
		webshop.add("Jogi", "L�w");
		webshop.add("Uli", "Hoene�");
		webshop.add("Hansi", "Flick");
		webshop.add("Dieter", "Hoene�");
		webshop.add("Hansi", "Flick");
		webshop.add("Mehmet", "Scholl");
		webshop.add("Marco", "Reus");
		webshop.printCustomerList(Kriterium.ALPHABET);
		webshop.printCustomerList(Kriterium.ID);
		webshop.remove("Mehmet", "Scholl");
		webshop.remove("Hansi", "Flick");
		webshop.printCustomerList(Kriterium.ID);
	}

}
