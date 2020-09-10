package com.accenture.chapter2;

import java.io.IOException;

public class UnaryOperators {
	
	public static void main(String[] args)  {
		
		/////Operadores de complemento lógico y negación.
		
		boolean a = !true;
		boolean b = false;
		System.out.println(b); // false
		
		b = !b;
		System.out.println(b); // true
		
		double d = +1.5; // Es lo mismo que -> double d = 1.5;
		double d1 = -2.5;
		System.out.println(d); // 1.5
		
		d = -d;
		System.out.println(d); // -1.5
		
		d = -d;
		System.out.println(d); // 1.5
		
		d = +d;
		System.out.println(d); // 1.5
		
		d1 = +d1; // No modifica el valor de la variable.
		System.out.println(d1); // -2.5
		
		///Ejemplos de mal uso de operadores
		boolean b1 = false;
		//b1 = -b1; 	// No compila
		//b1 = -true; 	// No compila
		//int c1 = !0; 	// No compila
		
		
		///// Operadores de incremento y decremento
		
	}
}
