class MedicineeRunner
{
	public static void main(String[] args)
	{
		Medicinee medicinee=new Medicinee();
		String name=medicinee.name;
		double cost=medicinee.cost;
		int quantity=medicinee.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		
		medicinee.name="dolo";
		medicinee.cost=50;
		medicinee.quantity=10;
		String name1=medicinee.name;
	    double cost1=medicinee.cost;
		int quantity1=medicinee.quantity;
		System.out.println("name updated:"+name1);
		System.out.println("cost updated:"+cost1);
		System.out.println("quantity1 updated:"+quantity1);
	}
}