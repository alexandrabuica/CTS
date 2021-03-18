package ro.ase.cts.clase;

public class Celebritate {
	private String nume;
	private int varsta;
	private String domeniuActivitate;
	private double venitAnual;
	
	private static Celebritate celebritate = null;
	
	private Celebritate(String nume, int varsta, String domeniuActivitate, double venitAnual) {
		this.nume = nume;
		this.varsta = varsta;
		this.domeniuActivitate = domeniuActivitate;
		this.venitAnual = venitAnual;
	}
	
	public static synchronized Celebritate getInstance(String nume, int varsta, String domeniuActivitate, double venitAnual) {
		if (celebritate == null) {
			celebritate = new Celebritate(nume, varsta, domeniuActivitate, venitAnual);
		}
		return celebritate;
	}

	@Override
	public String toString() {
		return "Celebritate [nume=" + nume + ", varsta=" + varsta + ", domeniuActivitate=" + domeniuActivitate
				+ ", venitAnual=" + venitAnual + "]";
	}
	
}
