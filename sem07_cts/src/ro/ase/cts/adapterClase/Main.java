package ro.ase.cts.adapterClase;

import ro.ase.cts.adapterClase.Creditable;
import ro.ase.cts.adapterObiecte.Leasing;
import ro.ase.cts.adapterObiecte.LeasingAdapter;

public class Main {

	public static void afiseazaInformatiiCredit(Creditable credit) {
		credit.oferaCredit();
	}
	
	public static void main(String[] args) {
		Leasing leasing = new Leasing("Popescu");
		LeasingAdapter adapter = new LeasingAdapter(leasing);
		
		LeasingAdapterClase leasingAdapterClase = new LeasingAdapterClase("Ionescu");
		afiseazaInformatiiCredit(leasingAdapterClase);
	}

}
