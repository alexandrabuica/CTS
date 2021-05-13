package ro.ase.cts.observer;

public class Main {

	public static void main(String[] args) {

		Observer c1 = new ClientFidel("Ionel");
		Observer c2 = new ClientFidel("Ana");
		Observer c3 = new ClientFidel("George");
		Observer c4 = new ClientFidel("Paul");
		
		ManagerSala manager = new ManagerSala();
		
		manager.adaugaAbonat(c1);
		manager.adaugaAbonat(c2);
		manager.adaugaAbonat(c3);
		manager.adaugaAbonat(c4);
		
		manager.anuntaMeci("fotbal");
		
		manager.stergeAbonat(c2);
		System.out.println();
		
		manager.anuntaMeci("basket");
		
	}

}
