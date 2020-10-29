public class Triangle {
private Point v1, v2, v3;

public Triangle (Point a, Point b, Point c) {
	v1 = a;
	v2 = b;
	v3 = c;
}

public Triangle (double x1, double x2, double x3, double y1, double y2, double y3) {
	v1 = new Point (x1, y1);
	v2 = new Point (x2, y2);
	v3 = new Point (x3, y3);
}

public String toString() {
	String tri = "v1(" + v1.getX() + ", " + v1.getY() + ") " + "v2(" + v2.getX() + ", " + v2.getY() + ") " + "v3(" + v3.getX() + ", " + v3.getY();
	return tri + ")";
}
}
