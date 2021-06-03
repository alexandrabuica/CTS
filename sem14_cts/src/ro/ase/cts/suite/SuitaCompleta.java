package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.TestGrupa;
import ro.ase.cts.teste.TestGrupaWithFake;
import ro.ase.cts.teste.TestGrupaWithStub;

@RunWith(Suite.class)
@SuiteClasses({TestGrupaWithFake.class, TestGrupaWithStub.class, TestGrupa.class})
public class SuitaCompleta {

}
