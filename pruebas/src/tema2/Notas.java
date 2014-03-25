package tema2;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float nota1,nota2,nota3,promedio;
		System.out.println("nota1");
		nota1=teclado.nextFloat();
		System.out.println("nota2");
		nota2=teclado.nextFloat();
		System.out.println("nota3");
		nota3=teclado.nextFloat();
		promedio=(nota1+nota2+nota3)/3;
		if(promedio>=7){
			System.out.println("promocionado");
			System.out.println(promedio);
		}
		teclado.close();
	}
}