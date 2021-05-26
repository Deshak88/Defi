package Defi;
///////////////////////////
//
//F4r3s5 S4d3K
//Le 24 Mars 2021
//Defi 4 -> etoile
//
///////////////////////////


public class Defi4 {
	public static void main(String args[]) {
		
		System.out.println("");
		//pour ranger
		for(int l = 1; l<6; l++) {
			//pour colonne
			for(int h = 5; h>l; h--) {
				System.out.print(" ");
			}
			//top left	
				for(int g = 0; g<l; g++) {
					System.out.print("*");
				}
				//top right
				for(int c = 1; c<l; c++) {
					System.out.print("*");
				}
			System.out.println();
		}
		//pour ranger
		for(int l = 2; l<6; l++) {
			//pour colonne
			for(int h = 1; h<l; h++) {
				System.out.print(" ");
			}
			//bottom left
				for(int g = 6; g>l; g--) {
					System.out.print("*");
				}
				//bottom right
				for(int c = 5; c>l; c--) {
					System.out.print("*");
				}
			System.out.println();
		}
		
	}
}