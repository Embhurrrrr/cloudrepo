package org.ssglobal.training.codes.itemD;

public class TestOverflow {

	public static void main(String[] args) {
		byte x = 120;
		byte y = 8;
		
		System.out.println(Overflow.sumOverflow(x, y));
	}
}