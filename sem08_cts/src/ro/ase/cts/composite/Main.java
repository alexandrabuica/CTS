package ro.ase.cts.composite;

public class Main {

	public static void main(String[] args) {
		
		Sectiune sectiuneBauturi = new Sectiune("Bauturi");
		Sectiune sectiuneDesert = new Sectiune("Desert");
		
		Item itemFrappe = new Item("Frappe");
		Item itemCafea = new Item("Cafea");
		Item itemEcler = new Item("Ecler");
		
		sectiuneBauturi.addComponenta(itemCafea);
		sectiuneBauturi.addComponenta(itemFrappe);

		sectiuneDesert.addComponenta(itemEcler);

		Sectiune meniu = new Sectiune("Meniu");
		meniu.addComponenta(sectiuneBauturi);
		meniu.addComponenta(sectiuneDesert);
		
		meniu.afiseazaDescriere();
		
		sectiuneBauturi.stergeComponenta(itemFrappe);
		sectiuneDesert.addComponenta(itemFrappe);
		
		System.out.println();
		
		meniu.afiseazaDescriere();
	}

}
