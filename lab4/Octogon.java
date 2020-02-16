//Sam Ballard

package lab4;

final class Octagon extends GeometricObject
implements Cloneable, Comparable<Octagon> {
		
	Octagon() {
		side = 8;
	}
	Octagon(int side) {
		this.side= side ;
	}
	public void calcArea() {
		area = (2 + 4 / Math.sqrt(2)) * side * side;
	}
	public int getSide() {
		return side;
	}
	public double getArea() {
		return area;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public int compareTo(Octagon temp) {
		int eval = 0;
		Octagon other = (Octagon)temp;
		if (getSide() == other.getSide() && getArea() == other.getArea()) {
			eval = 0;
		} else if (getSide() < other.getSide()){
			eval = 1;
		} else if (getSide() > other.getSide()) {
			eval = -1;
		}
		return eval;
	}
}

