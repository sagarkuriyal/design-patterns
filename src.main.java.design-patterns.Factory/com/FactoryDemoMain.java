package com;

import com.factory.ShapeFactory;
import com.interfaces.Shape;

public class FactoryDemoMain {
 
	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shC = shapeFactory.getShape("Circle");
		shC.draw();
		
		Shape shR = shapeFactory.getShape("Rectangle");
		shR.draw();
		
		Shape shS = shapeFactory.getShape("Square");
		shS.draw();
	}

}
