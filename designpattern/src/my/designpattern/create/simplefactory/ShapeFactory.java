package my.designpattern.create.simplefactory;

public class ShapeFactory {
	
	private static Shape SHAPE = null;
	
	private static class Square implements Shape{

		@Override
		public void draw() {
			System.out.println("Square draw");
		}

		@Override
		public void erase() {
			System.out.println("Square erase");
		}
		
	}
	
	private static class Triangle implements Shape{

		@Override
		public void draw() {
			System.out.println("Triangle draw");
		}

		@Override
		public void erase() {
			System.out.println("Triangle erase");
			
		}
		
	}
	
	public static Shape getShape(String shapeName){
		if(shapeName.equalsIgnoreCase("Triangle")){
			SHAPE = new Triangle();
		}else if(shapeName.equalsIgnoreCase("Square")){
			SHAPE = new Square();
		}else{
			throw new RuntimeException("UnSupportedShapeException");
		}
		return SHAPE;
	}
	
}
