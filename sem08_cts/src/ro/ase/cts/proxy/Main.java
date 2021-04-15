package ro.ase.cts.proxy;

public class Main {

	public static void main(String[] args) { 

		OperatorRezervari operator1 = new OperatorRezervari();
		
		operator1.realizeazaRezervare(2);
		
		ProxyOperatorRezervari proxy = new ProxyOperatorRezervari(operator1, 4);
		
		proxy.realizeazaRezervare(2);
	}

}
