
class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	
	Kerosene()
	{
		System.out.println("created Kerosene without parameter");
	}
	
	Kerosene(double price,int quantity,boolean quality)
	{
this.price=price;
this.quantity=quantity;
this.quality=quality;
	}
	
	Kerosene(boolean quality)
	{
this.quality=quality;
	}
	
	Kerosene(double price)
	{
this.price=price;
	}
}