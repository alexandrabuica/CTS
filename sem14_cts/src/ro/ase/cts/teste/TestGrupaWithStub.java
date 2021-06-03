package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluri.StudentStub;

public class TestGrupaWithStub {

	@Test
	public void testGetPromovabilitateGrupa() {
		Grupa grupa = new Grupa(1077);
		IStudent student1 = new StudentStub();
		grupa.adaugaStudent(student1);
		assertEquals(1, grupa.getPromovabilitate(), 0.1);
	}

}
