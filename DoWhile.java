package PacoteJava;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int soma = 0,numero;

        System.out.print("Digite um numero INTEIRO: ");
        numero = leia.nextInt();
        
        if (numero>0) {
            soma = soma + numero;
        }

        do {
            System.out.print("Digite um numero INTEIRO: ");
            numero = leia.nextInt();
            if (numero>0) {
                soma = soma + numero;
            }
        } while (numero!=0);

        System.out.println("\nA soma de todos os números digitádos é igual a: " +soma);
	}

}
