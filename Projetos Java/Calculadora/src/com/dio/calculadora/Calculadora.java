package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a,b;
		
		System.out.println("Digite o primeiro n�mero:");	
		a= scan.nextFloat();
		System.out.println("Digite o segundo n�mero:");	
		b= scan.nextFloat();
		
		float soma = soma(a,b);
		float subtra��o = subtra��o(a,b);
		float multiplica��o = multiplica��o(a,b);
		float divis�o = divis�o(a,b);
		
		System.out.println("Resultados:");
		System.out.println("Soma = " + soma);
		System.out.println("Subtra��o = " + subtra��o);
		System.out.println("Multiplica��o = " + multiplica��o);
		System.out.println("Divis�o = " + divis�o);
		
	}
// Aqui est�o as 
	public static float soma (float a, float b) {
		return a+b;		
	}
	public static float subtra��o (float a, float b) {
		return a-b;		
	}
	public static float multiplica��o (float a, float b) {
		return a*b;		
	}
	public static float divis�o (float a, float b) {
		return a/b;		
	}
	
}
