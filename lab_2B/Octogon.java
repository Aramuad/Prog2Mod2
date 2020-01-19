package lab_2B;

import lab_2B.GeometricObject.Clonable;

final class Octagon extends GeometricObject
implements Clonable, Comparable<Octagon> {
		
	Octagon() {
	}
	Octagon(int side) {
		setSide(side);
	}
	public void calcPerimeter() {
		perimeter = side * 8;
	}
	public void calcArea() {
		area = (2 + 4 / Math.sqrt(2)) * side * side;
	}
	public int getSide() {
		return side;
	}
	public int getPerimeter() {
		return perimeter;
	}
	public double getArea() {
		return area;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public boolean booleanCompareTo(int compareTo) {
		if (compareTo == 1) {
			return true;
		} else {
			return false;
		}
	}
	public int compareTo(Octagon temp) {
		int eval;
		Octagon other = (Octagon) temp;
		if (getSide() == other.getSide() && getPerimeter() == other.getPerimeter()
				&& getArea() == other.getArea()) {
			eval = 1;
		} else {
			eval = 0;
		}
		return eval;
	}
}

