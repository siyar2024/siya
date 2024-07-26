class JuiceeRunner
{
	public static void main(String[] args)
	{
		Juicee juicee=new Juicee();
		String name=juicee.name;
		double cost=juicee.cost;
		int quantity=juicee.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		
		juicee.name="apple";
		juicee.cost=50;
		juicee.quantity=250;
		String name1=juicee.name;
	    double cost1=juicee.cost;
		int quantity1=juicee.quantity;
		System.out.println("name updated:"+name1);
		System.out.println("cost updated:"+cost1);
		System.out.println("quantity1 updated:"+quantity1);
	}
}