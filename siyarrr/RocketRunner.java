class RocketRunner
{
	public static void main(String[] args){
		Rocket rocket=new Rocket(500);
		rocket.fuelCapacity=300;
		rocket.noOfThrusters=200;
		rocket.display();
		
		Rocket rocket1=new Rocket(500);
		rocket1.fuelCapacity=300;
		rocket1.noOfThrusters=200;
		rocket1.display();
		
		Rocket rocket2=new Rocket(500);
		rocket2.fuelCapacity=300;
		rocket2.noOfThrusters=200;
		rocket2.display();
		
	}
}