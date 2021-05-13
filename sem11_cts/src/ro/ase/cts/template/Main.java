package ro.ase.cts.template;

public class Main {

	public static void main(String[] args) {
		
		SpectatorAbstract spectator1 = new Spectator("Ionescu");
		Spectator spectator2 = new Spectator("John");
		
		spectator1.intrareSpectatorPeStadion();
		System.out.println();
		spectator2.intrareSpectatorPeStadion();
		System.out.println();
		SpectatorAbstract spectatorVip = new SpectatorVip("Ronaldo");
		spectatorVip.intrareSpectatorPeStadion();
		
	}

}
