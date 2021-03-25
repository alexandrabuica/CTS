package ro.ase.cts.simpleFactory;

public abstract class PersonalSpital {
	private String nume;
	private double salariu;
	
	public PersonalSpital(String nume, double salariu) {
		super();
		this.nume = nume;
		this.salariu = salariu;
	}
	
	public String getNume() {
		return nume;
	}
	
	public double getSalariu() {
		return salariu;
	}
}
