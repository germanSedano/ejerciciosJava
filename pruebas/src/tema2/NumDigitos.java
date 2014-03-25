package tema2;

import java.util.Scanner;

public class NumDigitos {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num;
		System.out.println("num");
		num=teclado.nextInt();
		if(num<10){
			System.out.println("una cifra");
		}
		else{
			System.out.println("dos cifras");
		}
		teclado.close();
	}
}