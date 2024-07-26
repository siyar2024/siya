class RupeeRunner
{
	public static void main(String[] args)
	{
		Rupee rupee=new Rupee();
		double price=rupee.price;
		String name=rupee.name;
		int quantity=rupee.quantity;
		System.out.println("price:"+price);
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
	}
}