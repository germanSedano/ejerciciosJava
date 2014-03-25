package tema2;

import java.util.Scanner;

public class SumaOresta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float num1, num2;
		System.out.println("num1");
		num1 = teclado.nextFloat();
		System.out.println("num2");
		num2 = teclado.nextFloat();
		if (num1 > num2) {
			System.out.println("Es suma" + (num1 + num2));
		} else {
			System.out.println("Es resta " + (num1 - num2));
		}
		teclado.close();
	}
}