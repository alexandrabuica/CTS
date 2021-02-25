package sem01_cts;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		Zoo zoo = new Zoo();
		Zookeeper zookeeper = new Zookeeper();
		zookeeper.setName("John");
		zoo.setZookeeper(zookeeper);
		
		Zebra zebra1 = new Zebra("Zebra1");
		Zebra zebra2 = new Zebra("Zebra2");
		
		Giraffe girafa1 = new Giraffe("Girafa1");
		Giraffe girafa2 = new Giraffe("Girafa2");
		
		zoo.add(zebra1);
		zoo.add(zebra2);
		zoo.add(girafa1);
		zoo.add(girafa2);
		
		zoo.feedAllAnimals();
	}

}
