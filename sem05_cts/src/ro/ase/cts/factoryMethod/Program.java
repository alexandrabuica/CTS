package ro.ase.cts.factoryMethod;

public class Program {

	public static void printeazaPersonal(FactoryPersonal factoryPersonal, String nume, double salariu) {
		PersonalSpital personalSpital = factoryPersonal.createPersonal(nume, salariu);
		System.out.println(personalSpital.toString());
	}
	
	public static void main(String[] args) {
		FactoryPersonal personal1 = new FactoryBrancardier();
		FactoryPersonal personal2 = new FactoryAsistent();
		FactoryPersonal personal3 = new FactoryAnestezist();
		printeazaPersonal(personal1, "Ion", 2800);
		printeazaPersonal(personal2, "Ana", 3400);
		printeazaPersonal(personal3, "Stefanescu", 5400);
	}

}
