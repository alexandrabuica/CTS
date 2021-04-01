package ro.ase.cts.builder;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare = new RezervareBuilder().setCodRezervare(123).setAreMancareInclusa(true).setAreMuzicaAmbientalaPersonalizata(true).build();
		Rezervare rezervare2 = new RezervareBuilder().setCodRezervare(456).setAreBauturaRacoritoare(true).setAreScaunErgonomic(true).build();
		System.out.println(rezervare);
		System.out.println(rezervare2);
		
		RezervareBuilder builder = new RezervareBuilder().setAreScaunErgonomic(true);
		Rezervare rezervare3 = builder.build();
		
		//referinta catre aceeasi instanta (shallow copy)
		Rezervare rezervare4 = builder.setCodRezervare(100).build();
		rezervare3.setCodRezervare(200);
		System.out.println(rezervare3);
		System.out.println(rezervare4);
	}

}
