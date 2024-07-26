class FoodRunner
{
	public static void main(String[] args)
	{
		Food food=new Food();
		String name=food.name;
		double cost=food.cost;
		int quantity=food.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		
		food.name="biriyani";
		food.cost=150;
		food.quantity=5;
		String name1=food.name;
	    double cost1=food.cost;
		int quantity1=food.quantity;
		System.out.println("name updated:"+name1);
		System.out.println("cost updated:"+cost1);
		System.out.println("quantity1 updated:"+quantity1);
	}
}