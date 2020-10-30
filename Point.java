public class Point {
private double x, y;

public Point (double X, double Y) {
	x = X;
	y = Y;
}

public Point (Point p) {
	x = p.x;
	y = p.y;
}

public double getX() {
	return x;
}

public double getY() {
	return y;
}

public double distanceTo (Point other) {
	double distance = Math.sqrt(Math.pow(other.getX() - getX(), 2) + Math.pow(other.getY() - getY(), 2));
	return distance;
}

public boolean equals (Point other) {
	if (other != null && other.getX() == getX() && other.getY() == getY()) {
		return true;
	}
	return false;
}
}
