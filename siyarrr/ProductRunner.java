class ProductRunner
{
	public static void main(String[] args)
	{
		String ref=Product.price(100);
		System.out.println("ref:"+ref);
		
		Product.price("laptop");
		
		
	}
}