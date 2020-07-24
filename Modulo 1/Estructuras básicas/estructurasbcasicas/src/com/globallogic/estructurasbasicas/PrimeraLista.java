package com.globallogic.estructurasbasicas;

import java.util.ArrayList;

public class PrimeraLista {
	 public static void main( String[] args )
	    {
	        ArrayList<String> letters = new ArrayList<>();
	        letters.add("A");
	        letters.add("B");
	        letters.add("C");
	        System.out.println(letters);
	        System.out.println("Cantidad de elementos de letters: "+letters.size());
	        letters.add(0, "X");
	        System.out.println(letters);
	        System.out.println("Cantidad de elementos de letters: "+letters.size());
	    }
}
