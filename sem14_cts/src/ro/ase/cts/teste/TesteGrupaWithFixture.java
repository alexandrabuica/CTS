package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TesteGrupaWithFixture {
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
	@Category({TesteGetPromovabilitate.class})
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
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitateLowerBoundary() { 
		assertEquals(0, grupa.getPromovabilitate(), 0.1);
	}
	

	@Test(timeout=500)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
	
}
