package com.abstracts.factory.impl;

import com.abstracts.factory.interfaces.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Shape filled with Red Color");
	}

}
