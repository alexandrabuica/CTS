package ro.ase.cts.facade;

public class BirouCredite {
	
	public static boolean areCredite(Persoana persoana) {
		int cifra = Integer.parseInt(""+persoana.getCnp().charAt(9));
		return cifra%2==0;
	}
}
