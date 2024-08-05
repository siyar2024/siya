

class Speaker
{
	String brand="sony";
	char size;
	double cost;
	boolean output;
	
	Speaker(char size)
	{
		this.size=size;
	}
	
	public void setCost(double cost)
	{
		this.cost=cost;
	}
	
	public void display()
	{
		System.out.println("Speaker brand:"+brand);
		System.out.println("Speaker size:"+size);
		System.out.println("Speaker cost:"+cost);
		System.out.println("Speaker output:"+output);
	}
}