package tema1;

import java.util.Scanner;

public class Atriangulo {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float area,base,altura;
		System.out.println("dame la  base");
		base=teclado.nextFloat();
		System.out.println("dame la altura");
		altura=teclado.nextFloat();
		area=(base*altura)/2;
		System.out.println(area);
		teclado.close();
	}

}
