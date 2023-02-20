package org.ssglobal.training.codes.itemC;

public class GeneralMethods {
	public void powersOfTwo() {
		short powerOf2;
		
		for (powerOf2 = 2; powerOf2 <= 1024; powerOf2 *= 2) {
			System.out.println(powerOf2);
		}
	}
	
	public void alarm(int alarmNum) {
		for (int num = 1; num <= alarmNum; num++) {
			System.out.println("Alarm!");
		}
	}
	
	public short sum100() {
		short sum = 0;
		
		for (short num = 1; num <= 100; num++) { 
			sum += num;
		}
		return sum;
	}
	
	public int sumRange(int num1, int num2) {
		int sum = 0;
		
		for (int num = num1; num <= num2; num++) {
			sum += num;
		}
		return sum;
	}
	
	public int maxOfTwo(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}
	
	public boolean larger(double num1, double num2) {
		return (num1 > num2) ? true : false;
	}
	
	public boolean evenlyDivisible(int num1, int num2) {
		return (num1 % num2 == 0 || num2 % num1 == 0) ? true : false;
	}
}
