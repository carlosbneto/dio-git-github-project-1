package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a,b;
		
		System.out.println("Digite o primeiro número:");	
		a= scan.nextFloat();
		System.out.println("Digite o segundo número:");	
		b= scan.nextFloat();
		
		float soma = soma(a,b);
		float subtração = subtração(a,b);
		float multiplicação = multiplicação(a,b);
		float divisão = divisão(a,b);
		
		System.out.println("Resultados:");
		System.out.println("Soma = " + soma);
		System.out.println("Subtração = " + subtração);
		System.out.println("Multiplicação = " + multiplicação);
		System.out.println("Divisão = " + divisão);
		
	}
// Aqui estão as 
	public static float soma (float a, float b) {
		return a+b;		
	}
	public static float subtração (float a, float b) {
		return a-b;		
	}
	public static float multiplicação (float a, float b) {
		return a*b;		
	}
	public static float divisão (float a, float b) {
		return a/b;		
	}
	
}
