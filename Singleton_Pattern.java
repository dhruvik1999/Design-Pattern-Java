class SingletonObject{
	public static SingletonObject singletonObject = new SingletonObject();

	private void SingletonObject(){
		//code for constructor

	}

	public static SingletonObject getSingletonObject(){
		return singletonObject;
	}

	public void draw(){
		System.out.println("draw method....");
	}
}

public class Singleton_Pattern{
	public static void main(String args[]){
		SingletonObject so = SingletonObject.getSingletonObject();
		so.draw();
	}
}