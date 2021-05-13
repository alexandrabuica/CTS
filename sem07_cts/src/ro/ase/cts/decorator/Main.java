package ro.ase.cts.decorator;

public class Main {

	public static void main(String[] args) {
		CardAbstract card = new Card("Georgescu");
		card.realizeazaPlataNormala();
		card.realizeazaPlataOnline();
		System.out.println();
		DecoratorAbstract decorator = new DecoratorContactless(card);
		decorator.realizeazaPlataContactless();
		decorator.realizeazaPlataNormala();
		decorator.realizeazaPlataOnline();
	}

}
