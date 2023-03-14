package epicode.d2;

public class Rectangle {
int h;
int w;
public Rectangle (int x, int y) {
	this.h = x;
	this.w = y;
}

public int getPerimeter() {
	return 2*(h + w);
}

public int getArea() {
	return h*w;
}

public static void printRectangle(Rectangle r) {
	System.out.println("The perimeter of the given rectangle is: " + r.getPerimeter() + ", its area is: " + r.getArea());
}

public static void printTwoRectangles(Rectangle r1, Rectangle r2) {
	System.out.println("The perimeter of the first rectangle is: " + r1.getPerimeter() + ", its area is: " + r1.getArea());
	System.out.println("The perimeter of the second rectangle is: " + r2.getPerimeter() + ", its area is: " + r2.getArea());
	System.out.println("The sum of their perimeters is: " + (r1.getPerimeter() + r2.getPerimeter()) + ", the sum of their areas is: " + (r1.getArea() + r2.getArea()));
}
}
