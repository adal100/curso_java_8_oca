package com.accenture.chapter2.repaso;

import java.util.Date;

public class OperadorTernario {
	public static void main(String args[]) {
		double a = 1.0;
		int b = 2;
		short c = 1;
		boolean d = true;
		
		//Ejemplo 1
		//short x = a > b ? 2 + c : 0; //No compila
		
		//Ejemplo 2
		Object x1 = d ? "" : new Date();
		
		//Ejemplo 3
		int x2 = a > b || !d ? b + 1 : a > 10 ? c * 2 : 1;
	}
}
