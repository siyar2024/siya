class Board
{
	double cost;
	int quantity;
	String type;
	
	public Board(double costLocal,int quantityLocal,String typeLocal)
	{
		cost=costLocal;
		quantity=quantityLocal;
		type=typeLocal;
		System.out.println("created Board");
	}
}