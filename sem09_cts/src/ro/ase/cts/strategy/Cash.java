package ro.ase.cts.strategy;

public class Cash implements ModalitatePlata{

	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("A fost afisata plata cash pentru suma de "+sumaPlatita);
	}
	
}
