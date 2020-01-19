package lab_2B;

public class OctagonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon shape = new Octagon(8);
		shape.calcPerimeter();
		shape.calcArea();
		Octagon shape1 = (Octagon)shape.clone();
		if(shape.booleanCompareTo(shape.compareTo(shape1)) == true) {
			System.out.println("The objects are equivalent");
		} else {
			System.out.println("The objects are not equivalent");
		}
	}
}
