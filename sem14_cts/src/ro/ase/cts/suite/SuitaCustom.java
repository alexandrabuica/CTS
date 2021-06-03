package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith; 
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.categorii.TesteUrgente;
import ro.ase.cts.teste.TestGrupa;
import ro.ase.cts.teste.TestGrupaWithFake;
import ro.ase.cts.teste.TestGrupaWithStub;
import ro.ase.cts.teste.TesteGrupaWithFixture;


@RunWith(Categories.class)
@SuiteClasses({TestGrupa.class, TestGrupaWithStub.class, TestGrupaWithFake.class, TesteGrupaWithFixture.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class, TesteUrgente.class})
public class SuitaCustom {

}
