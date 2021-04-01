package ro.ase.cts.prototype;

public class Bilet implements AbstractPrototype{
	
	private int codBilet;
	private String echipa1;
	private String echipa2;
	private String dataMeci;
	private String loc;
	
	public Bilet() {
		super();
	}

	public Bilet(int codBilet, String echipa1, String echipa2, String dataMeci, String loc) {
		super();
		this.codBilet = codBilet;
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
		this.dataMeci = dataMeci;
		this.loc = loc;
	}

	public void setCodBilet(int codBilet) {
		this.codBilet = codBilet;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Bilet [codBilet=" + codBilet + ", echipa1=" + echipa1 + ", echipa2=" + echipa2 + ", dataMeci="
				+ dataMeci + ", loc=" + loc + "]";
	}

	@Override
	public AbstractPrototype copiaza() {
		Bilet bilet = new Bilet();
		bilet.codBilet = this.codBilet;
		bilet.echipa1 = this.echipa1;
		bilet.echipa2 = this.echipa2;
		bilet.dataMeci = this.dataMeci;
		bilet.loc = this.loc;
		return bilet;
	}
	
}
