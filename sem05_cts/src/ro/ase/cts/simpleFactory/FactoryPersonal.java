package ro.ase.cts.simpleFactory;

public class FactoryPersonal {
	
	public static PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, double salariu) throws Exception {
		switch(tipPersonal) {
		case Medic:{
			return new Medic(nume, salariu);}
		case Brancardier:
			return new Brancardier(nume, salariu);
		case Asistent:
			return new Asistent(nume, salariu);
		default:
			throw new Exception();
		}
	}
}
