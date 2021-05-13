package ro.ase.cts.template;

public class SpectatorVip extends SpectatorAbstract{

	private String numeVip;
	
	public SpectatorVip(String numeVip) {
		super();
		this.numeVip = numeVip;
	}

	@Override
	public void asezareCoada() {
		System.out.println(numeVip +" se prezinta la poarta");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(numeVip +" prezinta bilet VIP");		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(numeVip +" este controlat");		
	}

	@Override
	public void intraPeStadion() {
		System.out.println(numeVip +" intra in tribuna VIP");		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(numeVip +" ocupa loc in loja");		
	}

}
