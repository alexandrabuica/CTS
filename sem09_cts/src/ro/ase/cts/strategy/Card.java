package ro.ase.cts.strategy;

public class Card implements ModalitatePlata{

	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("A fost afisata plata cu cardul pentru suma de "+sumaPlatita);
	}

}
