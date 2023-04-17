package PacoteJava;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int x,totalPar=0,totalImpar=0;
		
		for (int contadorNumeros = 1; contadorNumeros <= 10; contadorNumeros++) {
		    System.out.printf("\nDigite o %dº número: ", contadorNumeros);
		    int numero = leia.nextInt();
		    if (numero % 2 == 0) {
		        totalPar++;
		    } else {
		        totalImpar++;
		    }
			
		}
		
		System.out.println("\nQuantidade de números pares digitados: "+totalPar);
		System.out.println("\nQuantidade de números ímpares digitados: "+totalImpar);

	}

}
