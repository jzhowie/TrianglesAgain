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
}
}
