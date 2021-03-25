package ro.ase.cts.simpleFactory;

public class Program {

	public static void main(String[] args) {
;
		try {
//			FactoryPersonal factoryPersonal = new FactoryPersonal();
			PersonalSpital personalSpital1 = null;
			PersonalSpital personalSpital2 = null;
			personalSpital1 = FactoryPersonal.createPersonal(TipPersonal.Brancardier, "Popescu", 3200);
			personalSpital2 = FactoryPersonal.createPersonal(TipPersonal.Medic, "Ionescu", 5600);
			System.out.println(personalSpital1.toString());
			System.out.println(personalSpital2.toString());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
