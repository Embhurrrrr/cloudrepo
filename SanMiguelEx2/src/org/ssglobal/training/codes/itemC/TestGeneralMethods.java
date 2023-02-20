package org.ssglobal.training.codes.itemC;

public class TestGeneralMethods {

	public static void main(String[] args) {
		GeneralMethods gm = new GeneralMethods();
		gm.powersOfTwo();
		gm.alarm(5);
		System.out.println(gm.sum100());
		System.out.println(gm.sumRange(4, 7));
		System.out.println(gm.maxOfTwo(8, 5));
		System.out.println(gm.larger(6, 9));
		System.out.println(gm.evenlyDivisible(26, 85));
	}
}
