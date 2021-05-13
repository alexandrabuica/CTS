package ro.ase.cts.observer;

public class ClientFidel implements Observer{

	private String nume;
	
	public ClientFidel(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println(nume+", ai primit mesajul: "+mesaj);
	}

	
}
