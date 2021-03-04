package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public abstract class AplicantReader {

	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException, NumberFormatException;
	
}
