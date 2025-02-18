package com.abstracts.factory.factory;

import com.abstracts.factory.AbstractFactory;
import com.abstracts.factory.impl.Circle;
import com.abstracts.factory.impl.Rectangle;
import com.abstracts.factory.impl.Square;
import com.abstracts.factory.interfaces.Color;
import com.abstracts.factory.interfaces.Shape;

public class ShapeFactory extends AbstractFactory{

	public Shape getShape(String shapeType) {
		if (null == shapeType) {
			return null;
		}

		if ("Rectangle".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} else if ("Circle".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("Square".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}
	
	public Color getColor(String colorType) {
		return null;
	}
}
