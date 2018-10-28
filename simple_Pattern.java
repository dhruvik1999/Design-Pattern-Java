//simple pattern Implementation

interface Shape{
	public void draw();
}

class Circle implements Shape{
	public void draw(){
		System.out.println("Draw : circle");
	}
}

class Squre implements Shape{
	public void draw(){
		System.out.println("Draw : Squre");
	}
}

class Rectangle implements Shape{
	public void draw(){
		System.out.println("Draw : Rectangle");
	}
}

class ShapeFectory{

	public Shape getShape(String name){

		if(name.equals("Circle")){
			return new Circle();
		}else if(name.equals("Squre")){
			return new Squre();
		}else if(name.equals("Rectangle")){
			return new Rectangle();
		}else{
			//nothing to do
			return null;
		}
	}
}

public class simple_Pattern{
	public static void main(String a[]){
		ShapeFectory shape = new ShapeFectory();
		Shape circle = shape.getShape("Circle");
		circle.draw();

		Shape squre = shape.getShape("Squre");
		squre.draw();

		Shape rectangle = shape.getShape("Rectangle");
		rectangle.draw();		
	}
}