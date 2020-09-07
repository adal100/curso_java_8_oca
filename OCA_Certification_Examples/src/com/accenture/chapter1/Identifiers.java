package com.accenture.chapter1;

public class Identifiers {
	
	int x;
	{
		int x;
	}
	
	public Identifiers() { x = 1;} 
	
	public void __isValidMethodIdentifier() {}
	
	public void $() {}
	
	public void _() {} // Palabra reservada a partir de Java 9
	
	public void $$$$() {}
	
	public void Public() {}
	
	class _ {} // Palabra reservada a partir de Java 9
	
	class $ {
		int Int;
	}
	
	class Class {}
	
	enum x {}
	
	interface __ {}
	
	// public void 3{} //No compila
	
	//public void class{} // No compila
	
	
}
