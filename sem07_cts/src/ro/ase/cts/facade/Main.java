package ro.ase.cts.facade;

public class Main {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("Maricica", "2990708194329");
		if (persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				if (!BirouCredite.areCredite(persoana)) {
					System.out.println("I se ofera credit lui "+persoana.getNume());
				}
			}
		} 
		
		Persoana persoana2 = new Persoana("Ionela", "2990513245873");
		if (Facade.esteAptaPersoana(persoana2)) {
			System.out.println("I se ofera credit lui "+persoana.getNume());
		}else {
			System.out.println("Nu i se ofera credit lui "+persoana.getNume());
		}
	}
}
