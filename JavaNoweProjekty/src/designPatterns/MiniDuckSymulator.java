package designPatterns;

public class MiniDuckSymulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		modelDuck.setQuackBehavior(new Quack());
		
	}

}
