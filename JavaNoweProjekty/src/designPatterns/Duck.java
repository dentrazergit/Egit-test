package designPatterns;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performQuack(){
		quackBehavior.quack();
	}
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void Swim(){
		System.out.println("All ducks swim...");
	}

	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
}
