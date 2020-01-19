package lab_2B;

public abstract class GeometricObject {
	interface Clonable {
	}
	interface Comparable {
	}
	protected int side, perimeter;
	protected double area;
	protected void setSide(int side) {
		this.side = side;
	}
	protected abstract void calcPerimeter();
	protected abstract void calcArea();
	protected abstract int getSide();
	protected abstract int getPerimeter();
	protected abstract double getArea();
}
