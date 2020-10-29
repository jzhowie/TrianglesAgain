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
}
}
