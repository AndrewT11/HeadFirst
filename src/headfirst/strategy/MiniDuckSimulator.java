package headfirst.strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();


//		MallardDuck	mallard = new MallardDuck();
//		RubberDuck	rubberDuckie = new RubberDuck();
//		DecoyDuck	decoy = new DecoyDuck();
//

//
//		mallard.performQuack();
//		rubberDuckie.performQuack();
//		decoy.performQuack();
//

	}
}
