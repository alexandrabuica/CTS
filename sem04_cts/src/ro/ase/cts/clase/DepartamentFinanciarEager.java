package ro.ase.cts.clase;

public class DepartamentFinanciarEager {
	private int nrAngajati;
	private String director;
	private double salariuDeBaza;
	
	private static DepartamentFinanciarEager departamentFinanciarEager = new DepartamentFinanciarEager(10, "Popescu", 3000);
	
	private DepartamentFinanciarEager(int nrAngajati, String director, double salariuDeBaza) {
		this.director=director;
		this.nrAngajati=nrAngajati;
		this.salariuDeBaza=salariuDeBaza;
	}
	
	public static DepartamentFinanciarEager getInstance() {
		return departamentFinanciarEager;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DepartamentFinanciarEager [nrAngajati=");
		builder.append(nrAngajati);
		builder.append(", director=");
		builder.append(director);
		builder.append(", salariuDeBaza=");
		builder.append(salariuDeBaza);
		builder.append("]");
		return builder.toString();
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setSalariuDeBaza(double salariuDeBaza) {
		this.salariuDeBaza = salariuDeBaza;
	}

	
}
