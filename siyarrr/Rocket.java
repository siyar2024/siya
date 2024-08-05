

class Rocket
{
	String country="India";
	double speed;
	int fuelCapacity;
	int noOfThrusters;
	
	Rocket(double speed)
	{
		this.speed=speed;
	}
	
	public void setfuelCapacity(int fuelCapacity)
	{
		this.fuelCapacity=fuelCapacity;
	}
	
	public void display()
	{
		System.out.println("Rocket country:"+country);
		System.out.println("Rocket speed:"+speed);
		System.out.println("Rocket fuelCapacity:"+fuelCapacity);
		System.out.println("Rocket noOfThrusters:"+noOfThrusters);
	}
}