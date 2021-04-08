package ro.ase.cts.facade;

public class Facade {
	
	public static boolean esteAptaPersoana(Persoana persoana) {
		if (persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				if (!BirouCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
