package com.abstracts.factory.impl;

import com.abstracts.factory.interfaces.Shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Draw using Rectangle");
		
	}

}
