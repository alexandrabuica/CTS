package ro.ase.cts.facade;

public class Politie {
	
	public static boolean esteUrmarit(Persoana persoana) {
		int cifra = Integer.parseInt(""+persoana.getCnp().charAt(12));
		return cifra%2==0;
	}
}
