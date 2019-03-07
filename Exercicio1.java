package br.com.unimep.programa.aulas;

import java.util.Scanner;
	
public class Exercicio1 {
	
	public static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Este programa apresentará o produto de 3 valores inteiros\n");
		
		System.out.printf("Informe um valor inteiro : \n");
		int x=sc.nextInt();
		
		System.out.printf("Informe outro valor inteiro: \n");
		int y=sc.nextInt();
		
		System.out.printf("Informe mais um valor inteiror: \n");
		int z=sc.nextInt();
		
		int result = x*y*z;
		
		System.out.printf("Product is:" +result);
		
		//feito por Vinicius Pivetta,
	}

}
