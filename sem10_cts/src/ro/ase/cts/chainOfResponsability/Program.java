package ro.ase.cts.chainOfResponsability;

public class Program {

	public static void main(String[] args) {

		Handler contCurent = new ContCurent(2000);
		Handler contCredit = new ContCredit(5000);
		Handler contEconomii = new ContEconomii(3500);
		Handler refuzaTranzactia = new RefuzaTranzactie();
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(refuzaTranzactia);
		
		contCurent.realizeazaPlata(5500);
	}

}
