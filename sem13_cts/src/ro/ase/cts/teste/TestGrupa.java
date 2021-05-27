package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {
	private Grupa grupa;
	
	@Before
	public void setUp() {
		//10 studenti cu cate 3 note
		grupa = new Grupa(1077);
		for (int i=0; i<10; i++) {
			Student s1 = new Student();
			s1.adaugaNota(5);
			s1.adaugaNota(10);
			s1.adaugaNota(4);
			grupa.adaugaStudent(s1);
		}
	}
	
	@Test
	public void testGetPromovabilitateRight() {
		Student studentMarcel = new Student("Marcel");
		studentMarcel.adaugaNota(10);
		studentMarcel.adaugaNota(10);
		
		Student studentMaria = new Student("Maria");
		studentMaria.adaugaNota(10);
		studentMaria.adaugaNota(10);
		
		grupa.adaugaStudent(studentMarcel);
		grupa.adaugaStudent(studentMaria);
		assertEquals(0.16, grupa.getPromovabilitate(), 0.1); 
	}
	
	@Test
	public void testGetPromovabilitateLowerBoundary() { 
		assertEquals(0, grupa.getPromovabilitate(), 0.1);
	}
	
	@Test
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
	public void testGetPromovabilitateError() {
		Grupa grupa = new Grupa(1000);
		grupa.getPromovabilitate();
	}
	
	@Test(timeout=500)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
	
	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
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
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1077);
	}
	
	@Test
	public void testConstructorExistence() {
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
	 
}
