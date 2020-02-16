//Sam Ballard

package lab4;
import java.util.Scanner;

public class OctagonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side length of the octogon: ");
		Octagon shape = new Octagon(sc.nextInt());
		shape.calcArea();
		Octagon shape1 = (Octagon)shape.clone();
		System.out.println("Octogon 1: " + shape.toString());
		System.out.println("Octogon 2: " + shape1.toString());
		if(shape.compareTo(shape1) == 0) {
			System.out.println("The objects are equivalent");
		} else {
			System.out.println("The objects are not equivalent");
		}
		sc.close();
	}
}
