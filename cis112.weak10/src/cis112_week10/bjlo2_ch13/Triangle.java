package cis112_week10.bjlo2_ch13;

/**
 * A triangular shape composed of stacked unit squares like this: [] [][] [][][]
 * . . .
 */
public class Triangle {

	private int width;

	/**
	 * Constructs a triangular shape.
	 * 
	 * @param aWidth the width (and height) of the triangle
	 */
	public Triangle(int aWidth) {
		width = aWidth;
	}

	/**
	 * Computes the area of the triangle.
	 * 
	 * @return the area
	 */
	public int getArea() {
		if (width <= 0) {
			return 0;
		} else if (width == 1) {
			return 1;
		} else {
			Triangle smallerTriangle = new Triangle(width - 1);
			int smallerArea = smallerTriangle.getArea();
			return smallerArea + width;
		}
	}

}
