package ro.ase.cts.factoryMethod;

public class Brancardier extends PersonalSpital{

	public Brancardier(String nume, double salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Brancardier [getNume()=" + getNume() + ", getSalariu()=" + getSalariu() + "]";
	}

}
