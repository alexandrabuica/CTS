package ro.ase.cts.state;

public class Program {

	public static void main(String[] args) {
		 
		Masa masa = new Masa(7);
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.ocupaMasa();
		masa.elibereazaMasa();
	}

}
