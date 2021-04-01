package com.colorChange.test;


import org.junit.Before;
import org.junit.Test;
import com.colorChange.world.Matrix;
import com.colorChanges.entity.Node;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestJava {
	
	private Matrix matrix;
	private Matrix matrixTest;
	private Node node;
	
	@Before
	public void scenarios() {
		matrix = new Matrix();
		matrixTest = new Matrix();
		matrixTest.loadMatrix();
		node = new Node();
		node.setCoordinateX(1);
		node.setCoordinateY(1);
	}
	
	@Test
	public void loadMatrix() throws Exception {
		
		assertTrue(matrix.loadMatrix());
		
		assertTrue(matrix.paintMatrix());
		
		assertTrue(matrix.setColorNode(2, 1, 0));
		
		assertTrue(matrix.setColorNode(10, 10, 0));
		
		assertEquals(matrix.loadNode(1,1).getCoordinateX(),node.getCoordinateX());
		
		assertEquals(matrix.loadNode(1,1).getCoordinateY(),node.getCoordinateY());
		
		assertNotEquals(matrix,matrixTest);
		
		
	}


	
	
		
}
