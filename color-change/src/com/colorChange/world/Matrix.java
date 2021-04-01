package com.colorChange.world;

import com.colorChanges.entity.Node;

public class Matrix {
	
	private  Node [][] matrix;
	
	private boolean acctionAbove;
	private boolean acctionDown;
	private boolean acctionLeft;
	private boolean acctionRight;
	
	private int currentColor;
	private int numIter;
	
	public Matrix() {
		matrix = new Node[10][10];
	}
	

    public boolean loadMatrix() {
    	
    	try {
    		
	    	for (int x=0; x < matrix.length; x++) {
				for (int y=0; y < matrix[x].length; y++) {
					matrix[x][y] = loadNode(x,y);
				 }
			}
	    	
    	}
    	catch(Exception e) {
    		return false;
    	}
    	
    	return true;
    }
    
    
    public Node loadNode(int x, int y) {
    	
    	Node node = new Node();
    	
    	node.setColor((int) Math.floor(Math.random()*5+1));
    	
    	node.setCoordinateX(x);
    	node.setCoordinateY(y);
    	    	
    	return node;
    }
    
    
    public boolean paintMatrix() {
    	
    	try {
    		
	    	for (int x=0; x < matrix.length; x++) {
				System.out.println("");
				for (int y=0; y < matrix[x].length; y++) {
				    System.out.print("["+matrix[x][y].getColor()+"]");
				 }
			}
	    	
    	}
    	catch(Exception e) {
    		return false;
    	}
    	
    	return true;
    	
    }
    
    
    public boolean setColorNode(int x, int y, int color) throws Exception {
    	
    	if(color < 0 | color > 4 | x < 0 | x > 10 | y < 0 | y > 10){
    		throw new Exception("Wrong input parameter");
    	}
    	
    	try {
    		if(numIter==0) {
    			currentColor = matrix[x][y].getColor();
    			numIter++;
    		}
    		matrix[x][y].setColor(color);
    	}
    	catch(IndexOutOfBoundsException e)
    	{
    		
    	}
    	
    	if(!acctionAbove) {
    		x +=  1;
    		acctionAbove = true;
    		if(matrix[x][y].getColor()!=currentColor) {
    			setColorNode(x, y,color);
    		}
    	}
    	   
    	if(!acctionDown) {
    		x -= 2;
    		acctionDown = true;
    		if(matrix[x][y].getColor()!=currentColor) {
    			setColorNode(x, y,color);
    		}
    	}
    	
    	if(!acctionLeft) {
    		x += 1;
    		y += 1;
    		acctionLeft = true;
    		if(matrix[x][y].getColor()!=currentColor) {
    			setColorNode(x, y,color);
    		}
    	}
    	
    	if(!acctionRight) {
    		y -= 2;
    		acctionRight = true;
    		if(matrix[x][y].getColor()!=currentColor) {
    			setColorNode(x, y,color);
    		}
    	}
    	
    	return true;
    	
    }

}






