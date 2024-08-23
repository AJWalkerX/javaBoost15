package com.ajwalker.factory.ornek02;

public class Main {

	public static void main(String[] args) {
		IShape shape = ShapeFactory.getShape(EShapes.CIRCLE);
		shape.draw();
		shape = ShapeFactory.getShape(EShapes.SQUARE);
		shape.draw();
		shape = ShapeFactory.getShape(EShapes.RECTANGLE);
		shape.draw();
		
	}
}