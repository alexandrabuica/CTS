package ro.ase.cts.chainOfResponsability;

public class RefuzaTranzactie extends Handler{

	public RefuzaTranzactie() {
		super(0); 
	}

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Fonduri insuficiente - tranzactie refuzata");
	}

}
