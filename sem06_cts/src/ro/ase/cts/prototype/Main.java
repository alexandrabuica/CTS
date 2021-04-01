package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		
		ContClient contClient = new ContClient("John", 27);
		ContClient contClient2 = (ContClient) contClient.copiaza();
		
		System.out.println(contClient.toString());
		System.out.println(contClient2.toString());
		
		Bilet bilet1 = new Bilet(0, "Arsenal", "Barcelona", "1 aprilie", "1");
		Bilet bilet2 = new Bilet(1, "Milan", "Real Madrid", "2 aprilie", "2");
		
		Bilet bilet3 = (Bilet) bilet1.copiaza();
		bilet3.setCodBilet(2);
		bilet3.setLoc("1F");
		Bilet bilet4 = (Bilet) bilet1.copiaza();
		bilet4.setCodBilet(3);
		bilet4.setLoc("2F");
		
		System.out.println(bilet1);
		System.out.println(bilet3);
		System.out.println(bilet4);
	}

}
