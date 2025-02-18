package com.abstracts.factory;

import com.abstracts.factory.interfaces.Color;
import com.abstracts.factory.interfaces.Shape;

public abstract class AbstractFactory {
	
	public abstract Shape getShape(String shape) ;
	public abstract Color getColor(String color) ;

}
