package com.globallogic.app.interfaces;

public interface Persona {
	public void hablar();
	public void dormir();
	public default void come() {
		System.out.println();
	}

}
