package ro.ase.cts.state;

public class Masa {
	private int nrMasa;
	private Stare stare;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new StareLibera();
	}
	
	public void rezervaMasa() {
		if(this.stare instanceof StareLibera) {
			this.stare = new StareRezervata();
			System.out.println("Ati rezervat masa cu nr. "+nrMasa);
		}
		else {
			System.out.println("Masa cu numarul "+this.nrMasa+" nu poate fi rezervata.");
		}
	}
	
	public void ocupaMasa() {
		if(this.stare instanceof StareLibera || this.stare instanceof StareRezervata) {
			this.stare = new StareOcupata();
			System.out.println("Ati ocupat masa cu nr. "+nrMasa);
		}
		else {
			System.out.println("Masa cu numarul "+this.nrMasa+" nu poate fi ocupata.");
		}
	}
	
	public void elibereazaMasa() {
		if (!(this.stare instanceof StareLibera)) {
			this.stare = new StareLibera();
			System.out.println("Masa cu numarul "+nrMasa+" este libera.");
		}
		else {
			System.out.println("Masa cu numarul "+nrMasa+" este deja libera.");
		}
	}
}
