package ro.ase.cts.composite;

public interface ComponentaAbstracta {

	void afiseazaDescriere();
	
	void addComponenta(ComponentaAbstracta componentaAbstracta) throws Exception;
	
	void stergeComponenta(ComponentaAbstracta componentaAbstracta);
	
	ComponentaAbstracta getComponenta(int pozitie);
}
