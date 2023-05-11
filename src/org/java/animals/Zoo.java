package org.java.animals;

public class Zoo {

	public static void main(String[] args) {

		Animale balto = new Cane();
		Animale tity = new Passerotto();
		Animale usa = new Aquila();
		Animale flipper = new Delfino();

		Animale[] animals = { balto, tity, usa, flipper };

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].toString());
			animals[i].verso();
			System.out.println("----------------\n");
		}

		AnimaleManager man = new AnimaleManager();
		System.out.println("----------------------------\n");
		man.faiNuotare(flipper);

		man.faiVolare(balto);
	}

}
