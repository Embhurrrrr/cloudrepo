package org.ssglobal.training.codes.itemA;

public class BadNews {
	public static int max_Odd = 21;
	
	public static void writeOdds() {
		int count;
		
		// print each odd number
		for (count = 1; count <= (max_Odd - 2); count++) {
			System.out.print(count + " ");
			count = count + 1;
		}
		
		// print the last odd number
		System.out.println(count++); 
	}
	
	
	public static void main(String[] args) {
		// write all odds up to 21
		writeOdds();
		
		// now, write all odds up to 11
		max_Odd = 11;
		writeOdds();
	}
}
