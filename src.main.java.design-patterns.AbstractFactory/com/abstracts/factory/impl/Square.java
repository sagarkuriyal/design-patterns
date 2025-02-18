package com.abstracts.factory.impl;

import com.abstracts.factory.interfaces.Shape;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Draw using Square");
		
	}

}
