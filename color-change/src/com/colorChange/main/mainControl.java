package com.colorChange.main;

import com.colorChange.functionalInt.CheckTrial;
import com.colorChange.utility.Color;
import com.colorChange.world.Matrix;

public class mainControl{
	
	private static void paintState(String description, Matrix matrix, CheckTrial<Matrix> test ) {
			
			if(test.isRuning(matrix)) {
				System.out.println("");
				System.out.println("");
				System.out.println("it ran correctly:"+ description);
				System.out.println("");
				
			}
			else {
				System.out.println("there was a problem generating the "+ description);
			}
			
	}
	
	public static void main(String [] args) throws Exception {
		
		Matrix matrix = new Matrix();
		
				
		paintState("loadMatrix",matrix, a -> a.loadMatrix());
		paintState("paintMatrix",matrix, a -> a.paintMatrix());	
		paintState("setColorNode",matrix, a -> {
			try {
				return a.setColorNode(2, 1, Color.BLANCO.getValue());
				
			} catch (Exception e) {
				System.out.println("Wrong input parameter");
				return false;
			}
			
		});
		
		paintState("paintMatrix",matrix, a -> a.paintMatrix());
		
	}

}
