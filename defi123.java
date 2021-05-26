package Defi;
///////////////////////////
//
//F4r3s5 S4d3K
//Le 24 Mars 2021
//Defi 123 -> etoile
//
///////////////////////////

public class defi123 {
	public static void main(String[]args) {
		
		//Defi 1
		System.out.print("Defi 1");
		for(int i = 0; i<6; i++) {
			for(int j = 0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Defi 2
		System.out.println("Defi 2");
		for(int k = 0; k<5; k++) {
			for(int m = 5; m>k; m--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Defi 3
		System.out.println("Defi 3");
		for(int l = 1; l<6; l++) {
			for(int h = 5; h>l; h--) {
				System.out.print("~");
			}
				for(int g = 0; g<l; g++) {
					System.out.print("*");
				}
			System.out.println();
		}		
	}
}
 