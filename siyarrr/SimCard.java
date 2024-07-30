class SimCard
{
	double cost;
	String name;
	int quantity;
	
	public SimCard(double costLocal,String nameLocal,int quantityLocal)
	{
		cost=costLocal;
		name=nameLocal;
		quantity=quantityLocal;
		System.out.println("created SimCard");
	}
}