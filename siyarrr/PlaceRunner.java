class PlaceRunner
{
	public static void main(String[] args)
	{
		Place place=new Place();
		String name=place.name;
		int visitors=place.visitors;
		double price=place.price;
		System.out.println("name:"+name);
		System.out.println("visitors:"+visitors);
		System.out.println("price:"+price);
		
		place.name="escon";
		place.visitors=500;
		place.price=25;
		String name1=place.name;
	    int visitors1=place.visitors;
		double price1=place.price;
		System.out.println("name updated:"+name1);
		System.out.println("visitors updated:"+visitors1);
		System.out.println("price updated:"+price1);
	}
}