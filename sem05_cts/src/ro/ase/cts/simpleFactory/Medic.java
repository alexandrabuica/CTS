package ro.ase.cts.simpleFactory;

public class Medic extends PersonalSpital {

	public Medic(String nume, double salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Medic [getNume()=" + getNume() + ", getSalariu()=" + getSalariu() + "]";
	}

}
