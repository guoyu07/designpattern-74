package my.designpattern.create.simplefactory;

public class TestClass {
	
	public static void main(String[] args) {
		Shape shape = ShapeFactory.getShape("a");
		shape.draw();
		shape.erase();
	}
	
}
