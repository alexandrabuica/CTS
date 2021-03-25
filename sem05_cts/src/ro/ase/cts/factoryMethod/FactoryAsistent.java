package ro.ase.cts.factoryMethod;

public class FactoryAsistent implements FactoryPersonal{
	
	@Override
	public PersonalSpital createPersonal(String nume, double salariu) {
		return new Asistent(nume, salariu);
	}

}
