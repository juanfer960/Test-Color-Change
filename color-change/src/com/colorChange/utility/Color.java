package com.colorChange.utility;

public enum Color {
	
	AMARILLO(1),AZUL(2),ROJO(3),VERDE(4),BLANCO(0);

	private int value;
	 
    private Color(){}
 
    private Color(int i){
    	this.value = i;
    }
    
    public int getValue(){
    	return this.value;
    }

}
