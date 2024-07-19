class Product
{
	public static String price(double price)
	{
		System.out.println("running price in product");
		if(price>100)
		{
			System.out.println("valid");
			return "valid";
		}
		else{
			return "invalid";
		}
	}
	
	public static void price( String product_name)
	{
		System.out.println("running price in product"+product_name);

	}
}