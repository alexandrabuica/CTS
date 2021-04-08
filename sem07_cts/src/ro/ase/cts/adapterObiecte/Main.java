package ro.ase.cts.adapterObiecte;

public class Main {

	public static void afiseazaInformatiiCredit(Creditable credit) {
		credit.oferaCredit();
	}
	
	public static void main(String[] args) {
		
		Leasing leasing = new Leasing("Popescu");
		LeasingAdapter adapter = new LeasingAdapter(leasing);
		
		afiseazaInformatiiCredit(adapter);
	}

}
