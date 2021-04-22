package ro.ase.cts.strategy;

public class Program {

	public static void main(String[] args) {
		
		Client client = new Client("Ionescu");
		client.setModPlata(new Card());
		client.platesteNota(2000);
		client.setModPlata(new Cash());
		client.platesteNota(8000);
	}

}
