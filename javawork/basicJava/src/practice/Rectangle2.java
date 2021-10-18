package practice;

public class Rectangle2 {
	int width;
	int length;
	String color;
	int perimeter;
	int area;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPerimiter() {
		return perimeter;
	}
	public void setPerimiter(int perimiter) {
		this.perimeter = perimiter;
	}
	public Rectangle2() {
		
	}
	public Rectangle2(int width, int length, String color, int perimiter) {
		this.width = width;
		this.length = length;
		this.color = color;
		this.perimeter = perimiter;
	}
	public int perimeter() {
		perimeter = (width+length)*2;
		return perimeter;
	}
	public int area() {
		area = width * length;
		return area;
	}
	
}