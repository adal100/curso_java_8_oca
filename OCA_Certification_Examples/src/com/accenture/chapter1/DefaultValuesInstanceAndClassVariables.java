package com.accenture.chapter1;

public class DefaultValuesInstanceAndClassVariables {
	double w_double;
	int x_int;
	long y_long;
	boolean z_boolean;
	char a_char;
	String b_reference;
	
	public static void main(String args[]) {
		DefaultValuesInstanceAndClassVariables example = new DefaultValuesInstanceAndClassVariables();
		
		System.out.println("double: " + example.w_double);
		System.out.println("int: " + example.x_int);
		System.out.println("long: " + example.y_long);
		System.out.println("boolean: " + example.z_boolean);
		System.out.println("char: " + example.a_char); //Caracter no desplegable
		System.out.println("char: " + (int) example.a_char); //Equivalente a 0 en formato numerico
		System.out.println("reference: " + example.b_reference);
	}
}
