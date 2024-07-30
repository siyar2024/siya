class Led{
	double cost;
	int quantity;
	String color;
	
	public Led(double costLocal,int quantityLocal,String colorLocal)
	{
		cost=costLocal;
		quantity=quantityLocal;
		color=colorLocal;
		System.out.println("created Led");
	}
}