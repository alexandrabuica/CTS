package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluri.StudentFake;

public class TestGrupaWithFake {

	@Test
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1077);
		for (int i=0; i<8; i++) {
			StudentFake studentFake = new StudentFake();	
			studentFake.setAreRestanta(false);
			grupa.adaugaStudent(studentFake);
		}
		for (int i=0; i<2; i++) {
			StudentFake studentFake = new StudentFake();	
			studentFake.setAreRestanta(true);
			grupa.adaugaStudent(studentFake);
		}
		assertEquals(0.8, grupa.getPromovabilitate(), 0.05); 
	}

}
