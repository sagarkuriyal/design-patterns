package com.abstracts.factory;

import com.abstracts.factory.producer.FactoryProducer;

public class AbstractFactoryDemoMain {

	public static void main(String[] args) {
		AbstractFactory shapFact = FactoryProducer.getFactory("Shape");
		AbstractFactory colorFact = FactoryProducer.getFactory("Color");
		shapFact.getShape("Square").draw();
		shapFact.getShape("Circle").draw();
		shapFact.getShape("Rectangle").draw();;
		
		colorFact.getColor("Green").fill();
		colorFact.getColor("Blue").fill();
		colorFact.getColor("Red").fill();
	}

}
