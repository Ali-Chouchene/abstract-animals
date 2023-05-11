package org.java.animals;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("Hi Hi Hi");

	}

	public void nuota() {
		System.out.println("Sto Nuotando!!!");
	}

	@Override
	public void mangia() {
		System.out.println("Pesce");

	}

}
