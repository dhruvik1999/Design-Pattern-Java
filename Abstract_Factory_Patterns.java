interface Shape{
	public void draw();
}

class Circle implements Shape{
	public void draw(){
		System.out.println("Draw()  :  Circle");
	}
}

class Squre implements Shape{
	public void draw(){
		System.out.println("Draw()  :  Squre");
	}
}

class Rectangle implements Shape{
	public void draw(){
		System.out.println("Draw()  :  Rectangle");
	}
}

interface Color{
	public void fill();
}

class Red implements Color{
	public void fill(){
		System.out.println("Fill()  :  Circle");
	}
}

class Black implements Color{
	public void fill(){
		System.out.println("Fill()  :  Black");
	}
}

class Blue implements Color{
	public void fill(){
		System.out.println("Fill()  :  Blue");
	}
}

abstract class AbstractFactory{
	abstract public Shape getShape(String name);
	abstract public Color getColor(String name);
}

class ShapeFectory extends AbstractFactory{
	public Shape getShape(String name){
		if(name.equals("Circle")){
			return new Circle();
		}else if(name.equals("Squre")){
			return new Squre();
		}else if(name.equals("Rectangle")){
			return new Rectangle();
		}else{
			return null;
		}
	}
	public Color getColor(String name){
			return null;
	}
}

class ColorFectory extends AbstractFactory{
	public Color getColor(String name){
		if(name.equals("Red")){
			return new Red();
		}else if(name.equals("Black")){
			return new Black();
		}else if(name.equals("Blue")){
			return new Blue();
		}else{
			return null;
		}
	}

	public Shape getShape(String name){
			return null;
	}
}

class FactoryProducer{
	public AbstractFactory getFactory(String name){
		if(name.equals("ShapeFectory")){
			return new ShapeFectory(); 
		}else if(name.equals("ColorFectory")){
			return new ColorFectory();
		}else{
			return null;
		}
	}
}

public class Abstract_Factory_Patterns{
	public static void main(String args[]){
		FactoryProducer factoryProducer = new FactoryProducer();
		AbstractFactory shapeFactory = factoryProducer.getFactory("ShapeFectory");
		
		Shape circle = shapeFactory.getShape("Circle");
		circle.draw();

		Shape squre = shapeFactory.getShape("Squre");
		squre.draw();

		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();

		AbstractFactory colorFactory = factoryProducer.getFactory("ColorFectory");
		Color red = colorFactory.getColor("Red");
		red.fill();

		Color black = colorFactory.getColor("Black");
		black.fill();

		Color blue = colorFactory.getColor("Blue");
		blue.fill();
	}
}