/**
 * 
 */
package com.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class PairImpair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	Scanner rectangle = new Scanner(System.in);
	System.out.println("Veuillez saisir un nombre :");
	int nb1 = rectangle.nextInt();
	rectangle.close();
	if (nb1%2==0){
		System.out.println("Ce nombre est pair.");
	} else {
		System.out.println("Ce nombre est impair.");
		
	}

	}

}