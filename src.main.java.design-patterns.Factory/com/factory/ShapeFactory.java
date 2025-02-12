package com.factory;

import com.impl.Circle;
import com.impl.Rectangle;
import com.impl.Square;
import com.interfaces.Shape;

public class ShapeFactory {
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		
		if ("Circle".equalsIgnoreCase(shape)) {
			return new Circle();
		} else if ("Rectangle".equalsIgnoreCase(shape)) {
			return new Rectangle();
		} else if ("Square".equalsIgnoreCase(shape)) {
			return new Square();
		}
		return null;
	}

}
