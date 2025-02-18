package com.abstracts.factory.producer;

import com.abstracts.factory.AbstractFactory;
import com.abstracts.factory.factory.ColorFactory;
import com.abstracts.factory.factory.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if("Shape".equalsIgnoreCase(choice)) {
			return new ShapeFactory();
		} else if ("Color".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		} else {
			return null;
		}
	}

}
