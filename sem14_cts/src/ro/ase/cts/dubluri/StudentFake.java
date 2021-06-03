package ro.ase.cts.dubluri;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentFake implements IStudent{

	private String valoareGetNume;
	private boolean areRestante;
	private float medie;
	 
	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}


	public void setAreRestanta(boolean areRestante) {
		this.areRestante = areRestante;
	}
 

	public void setMedie(float medie) {
		this.medie = medie;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return areRestante;
	}

}
