package org.java.animals;

public class AnimaleManager {
	public static void faiVolare(Animale animale) {
		IVolante.vola();
	};

	public static void faiNuotare(Animale animale) {
		INuotante.nuota();
	};
}
