class CandyRunner
{
	public static void main(String[] args)
	{
		Candy candy=new Candy();
		String name=candy.name;
		double cost=candy.cost;
		int quantity=candy.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		
		candy.name="orange";
		candy.cost=30;
		candy.quantity=10;
		String name1=candy.name;
	    double cost1=candy.cost;
		int quantity1=candy.quantity;
		System.out.println("name updated:"+name1);
		System.out.println("cost updated:"+cost1);
		System.out.println("quantity1 updated:"+quantity1);
	}
}