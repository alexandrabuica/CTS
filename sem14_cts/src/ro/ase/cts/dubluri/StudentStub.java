package ro.ase.cts.dubluri;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentStub  implements IStudent{

	@Override
	public String getNume() {
		return "Ion";
	}

	@Override
	public void setNume(String nume) { 
		
	}

	@Override
	public List<Integer> getNote() { 
		return null;
	}

	@Override
	public void adaugaNota(int nota) { 
		
	}

	@Override
	public float calculeazaMedie() {
		return 9.8f;
	}

	@Override
	public int getNota(int index) {
		return 8;
	}

	@Override
	public boolean areRestante() {
		return false;
	}

}
