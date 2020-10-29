public class TestTriangles {
public static void main(String[] args) {

	Point P1 = new Point (5, 7);
	Point P2 = new Point (1, 4);

	System.out.println("Point clone testing:");
	Point P3 = new Point (P2);
	//(1, 4)
	System.out.println(P3.getX());
	System.out.println(P3.getY());

	System.out.println("\n" + "Distance");
	// 5
	System.out.println(P1.distanceTo(P2));

	System.out.println("\n" + "Same coordinates?");
	//false
	System.out.println(P1.equals(P2));
	//true
	System.out.println(P2.equals(P3));

	System.out.println("\n" + "Triangles!");
	Point P4 = new Point (5, 4);
	Triangle T1 = new Triangle (P1, P2, P4);
	Triangle T2 = new Triangle (0, 0, 1, 2, 2, 0);
	System.out.println(T1);
	System.out.println(T2);

	System.out.println("\n" + "Perimeter");
	//12
	System.out.println(T1.getPerimeter());
	//some irrational number
	System.out.println(T2.getPerimeter());

	System.out.println("\n" + "Area");
	//6
	System.out.println(T1.getArea());
	//2
	System.out.println(T2.getArea());
}
}
