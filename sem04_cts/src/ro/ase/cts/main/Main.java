package ro.ase.cts.main;

import ro.ase.cts.clase.Celebritate;
import ro.ase.cts.clase.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;

public class Main {

	public static void main(String[] args) {
		 
		DepartamentFinanciarEager primulDepFinanciarEager=DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager alDoileaDepFinanciarEager=DepartamentFinanciarEager.getInstance();
	
		System.out.println(primulDepFinanciarEager.toString());
		System.out.println(alDoileaDepFinanciarEager.toString());
		
		primulDepFinanciarEager.setDirector("Sandulescu");
		alDoileaDepFinanciarEager.setNrAngajati(20);
		
		System.out.println(primulDepFinanciarEager.toString());
		System.out.println(alDoileaDepFinanciarEager.toString());
		
		DepartamentFinanciar primulDepFinanciar = DepartamentFinanciar.getInstance(35, "John", 3500);
		DepartamentFinanciar alDoileaDepFinanciar = DepartamentFinanciar.getInstance(40, "Mark", 2700);

		System.out.println(primulDepFinanciar.toString());
		System.out.println(alDoileaDepFinanciar.toString());
		
		System.out.println();
		
		Celebritate celebritate1 = Celebritate.getInstance("Antonio Banderas", 60, "film", 200000);
		Celebritate celebritate2 = Celebritate.getInstance("Justin Timberlake", 40, "muzica", 350000);
		
		System.out.println(celebritate1.toString());
		System.out.println(celebritate2.toString());
		

	}

}
