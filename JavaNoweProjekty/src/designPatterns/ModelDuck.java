package designPatterns;

public class ModelDuck extends Duck{
	
	public ModelDuck(){
		flyBehavior = new FlyNoWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Iam a model duck");
		
		
	}

}
