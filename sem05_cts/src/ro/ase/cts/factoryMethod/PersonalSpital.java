package ro.ase.cts.factoryMethod;

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

	@Override
	public String toString() {
		return "PersonalSpital [nume=" + nume + ", salariu=" + salariu + "]";
	}
	
	
}
