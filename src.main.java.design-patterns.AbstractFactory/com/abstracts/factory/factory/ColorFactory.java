package com.abstracts.factory.factory;

import com.abstracts.factory.AbstractFactory;
import com.abstracts.factory.impl.Blue;
import com.abstracts.factory.impl.Green;
import com.abstracts.factory.impl.Red;
import com.abstracts.factory.interfaces.Color;
import com.abstracts.factory.interfaces.Shape;

public class ColorFactory extends AbstractFactory{
	public Color getColor(String colorType) {
		if (null == colorType) {
			return null;
		}

		if ("Red".equalsIgnoreCase(colorType)) {
			return new Red();
		} else if ("Green".equalsIgnoreCase(colorType)) {
			return new Green();
		} else if ("Blue".equalsIgnoreCase(colorType)) {
			return new Blue();
		}
		return null;
	}
	
	public Shape getShape(String shapeType) {
		return null;
	}

}
