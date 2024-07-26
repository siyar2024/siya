class FruitRunner
{
	public static void main(String[] args)
	{
		Fruit fruit=new Fruit();
		String name=fruit.name;
		double cost=fruit.cost;
		int quantity=fruit.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		
		fruit.name="apple";
		fruit.cost=200;
		fruit.quantity=8;
		String name1=fruit.name;
	    double cost1=fruit.cost;
		int quantity1=fruit.quantity;
		System.out.println("name updated:"+name1);
		System.out.println("cost updated:"+cost1);
		System.out.println("quantity1 updated:"+quantity1);
	}
}