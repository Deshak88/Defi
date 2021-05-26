package Defi;
///////////////////////////
//
//F4r3s5 S4d3K
//Le 24 Mars 2021
//Defi 5 -> etoile
//
///////////////////////////


public class Defi5 {
	public static void main(String args[]) {
		
		System.out.println();
		for(int l = 1; l<6; l++) {
			for(int h = 5; h>l; h--) {
				System.out.print(" ");
			}
			//top left
				for(int g = 1; g<l; g++) {
					System.out.print("");
				}
				for(int b = 0; b<l; b++) {	
					System.out.print("*");
				}
				System.out.println();
		}
	}
}