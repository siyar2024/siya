class AlcoholBrandRunner
{
	public static void main(String[] args)
	{
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		String name=alcoholBrand.name;
		double cost=alcoholBrand.cost;
		int quantity=alcoholBrand.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		
		alcoholBrand.name="beer";
		alcoholBrand.cost=500;
		alcoholBrand.quantity=250;
		String name1=alcoholBrand.name;
	    double cost1=alcoholBrand.cost;
		int quantity1=alcoholBrand.quantity;
		System.out.println("name updated:"+name1);
		System.out.println("cost updated:"+cost1);
		System.out.println("quantity1 updated:"+quantity1);
	}
}