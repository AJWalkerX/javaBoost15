package com.ajwalker.factory.ornek02;

public class ShapeFactory {

	public static IShape getShape(EShapes shape) {
		switch (shape) {
		case CIRCLE:
			return new Circle();
		case SQUARE:
			return new Square();
		case RECTANGLE:
			return new Rectangle();
		}
		return null;
	}
}