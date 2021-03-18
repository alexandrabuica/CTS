package ro.ase.cts.clase;

public class DepartamentFinanciar {
	private int nrAngajati;
	private String director;
	private double salariuDeBaza;
	
	private static DepartamentFinanciar departamentFinanciar = null;
	
	private DepartamentFinanciar(int nrAngajati, String director, double salariuDeBaza) {
		this.director=director;
		this.nrAngajati=nrAngajati;
		this.salariuDeBaza=salariuDeBaza;
	}
	
	public static synchronized DepartamentFinanciar getInstance(int nrAngajati, String director, double salariuDebaza) {
		if (departamentFinanciar == null) {
			departamentFinanciar = new DepartamentFinanciar(nrAngajati, director, salariuDebaza);
		}
		return departamentFinanciar;
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

	@Override
	public String toString() {
		return "DepartamentFinanciar [nrAngajati=" + nrAngajati + ", director=" + director + ", salariuDeBaza="
				+ salariuDeBaza + "]";
	}

}
