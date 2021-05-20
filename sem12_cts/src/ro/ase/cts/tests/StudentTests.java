package ro.ase.cts.tests;

import static org.junit.Assert.*;
 
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	Student student = null;
	
	@Before
	public void setUp() {
		student = new Student();
	}
	
	@Test
	public void testApelCorectConstructorCuParametru() {
		String nume = "Ion";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testApelConstructorFaraParametru() {
		String nume = "Student";
		Student student = new Student();
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareListaConstructorFaraParametru() {
		//Student student = new Student();
		assertNotNull(student.getNote());
	}

	@Test
	public void testAdaugareNotaInLista() {
		//Student student = new Student();
		int nota=6;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiuneListaCorecta() {
		//Student student = new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testSetareNume() {
		//Student student = new Student();
		String nume = "Marcel";
		student.setNume(nume);
		assertEquals(student.getNume(), nume);
	}
	
	@Test
	public void testCalculMedie() {
		student.adaugaNota(7);
		student.adaugaNota(5); 
		assertEquals(6, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculMedieFaraNote() {
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculMedieONota() {
		student.adaugaNota(9);
		assertEquals(9, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testVerificareRestante() {
		student.adaugaNota(8);
		student.adaugaNota(4);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificareNuAreRestante() {
		student.adaugaNota(9);
		student.adaugaNota(5);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testVerificareRestanteFaraNote() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testVerificareAruncareExceptie() {
		int index = -1;
		student.getNota(index);
	}
	
	public void testGetNotaShouldThrowException() {
		//1
		try {
			//2
			student.getNota(-1);
			fail("nu trebuie sa ajunga aici");
		}catch (IndexOutOfBoundsException ex){
			//4
		}
		//5
	}
}