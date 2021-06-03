package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.categorii.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {
	
	@Test
	@Category({TesteGetPromovabilitate.class, TesteNormale.class})
	public void testGetPromovabilitateUpperBoundary() { 
		Grupa grupa = new Grupa(1076);
		for (int i=0; i<10; i++) {
			Student student = new Student("Ion");
			student.adaugaNota(7);
			student.adaugaNota(9);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.1);
	}
	 
	@Test(expected = IllegalArgumentException.class )
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitateError() {
		Grupa grupa = new Grupa(1000);
		grupa.getPromovabilitate();
	}
	
	@Test
	@Category({TesteUrgente.class})
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	@Category({TesteNormale.class})
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	@Category({TesteNormale.class})
	public void testLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testConstructorErrorConditionMaiMic() {
		int nrGrupa = 100;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testConstructorErrorConditionMaiMare() {
		int nrGrupa = 1200;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(timeout = 500)
	@Category({TesteUrgente.class})
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1077);
	}
	
	@Test
	public void testConstructorExistence() {
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
	 
}
