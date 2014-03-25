package tema1;

import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float num1,num2;
		System.out.println("num1");
		num1=teclado.nextFloat();
		System.out.println("num2");
		num2=teclado.nextFloat();
		System.out.println(num1+num2);
		teclado.close();
	}
}