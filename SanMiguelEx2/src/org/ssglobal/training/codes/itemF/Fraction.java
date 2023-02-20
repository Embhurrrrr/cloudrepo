package org.ssglobal.training.codes.itemF;

public class Fraction {

	public byte getNumerator(byte nume) {
		byte num= 5;
		return num;
	}
	
	public byte getDenominator(byte deno) {
		byte num = 10;
		return num;
	}

	public void printRational() {
		Fraction f = new Fraction();
		byte nume = 0;
		byte deno = 0;
		System.out.println(f.getNumerator(nume) + "/" + f.getDenominator(deno));
	}
	
	public Fraction add(Fraction summand) {
		return summand;
	}
	
	public void multiply(Fraction factor) {
		
	}
	
	public boolean greaterEqual(Fraction comp) {
		return true;
	}
}
