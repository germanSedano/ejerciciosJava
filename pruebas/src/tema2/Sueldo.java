package tema2;

import java.util.Scanner;

public class Sueldo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float sueldo;
		System.out.println("dame el sueldo");
		sueldo = teclado.nextFloat();
		if (sueldo < 1000) {
			System.out.println("mileurista");
		} else {
			System.out.println("millonetis");
		}
		teclado.close();
	}
}
