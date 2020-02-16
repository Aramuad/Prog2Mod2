//Sam Ballard

package lab4;

public abstract class GeometricObject {
	interface Cloneable {
	}
	interface Comparable {
	}
	protected int side;
	protected double area;
	public abstract void calcArea();
	public abstract int getSide();
	public abstract double getArea();
	@Override
	public String toString() {
		return String.format("%s: Side %d, Area: %.2f\n", this.getClass().getName(), side, area);
	}
}
