package ro.ase.cts.chainOfResponsability;

public class ContCredit extends Handler{

	public ContCredit(float sold) {
		super(sold); 
	}

	@Override
	public void realizeazaPlata(float suma) {
		if (super.getSold()>=suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realizat plata din contul de credit in valoare de "+suma);
		}else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
