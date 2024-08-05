

class Chocolate
{
	String brand="kitkat";
	double price;
	String flavour;
	char size;
	
	Chocolate(double price)
	{
		this.price=price;
	}
	
	public void setFlavour(String flavour)
	{
		this.flavour=flavour;
	}
	
	public void display()
	{
		System.out.println("Chocolate brand:"+brand);
		System.out.println("Chocolate price:"+price);
		System.out.println("Chocolate flavour:"+flavour);
		System.out.println("Chocolate size:"+size);
	}
}