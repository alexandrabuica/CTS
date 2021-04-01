package ro.ase.cts.builderV2;

public class Main {

	public static void main(String[] args) {
		RezervareBuilder builder = new RezervareBuilder().setCodRezervare(999).setAreBauturaRacoritoare(true).setAreMuzicaAmbientalaPersonalizata(true);
		Rezervare rezervare1 = builder.build();
		builder.setCodRezervare(888).setAreMancareInclusa(true);
		Rezervare rezervare2 = builder.build();
		System.out.println(rezervare1);
		System.out.println(rezervare2);
	}

}
