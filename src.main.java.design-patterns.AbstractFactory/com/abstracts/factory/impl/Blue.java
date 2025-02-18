package com.abstracts.factory.impl;

import com.abstracts.factory.interfaces.Color;

public class Blue implements Color{

	@Override
	public void fill() {
		System.out.println("Shape filled with Blue Color");
	}

}
