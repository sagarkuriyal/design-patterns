package com.abstracts.factory.impl;

import com.abstracts.factory.interfaces.Color;

public class Green implements Color{

	@Override
	public void fill() {
		System.out.println("Shape filled with Green Color");
	}

}
