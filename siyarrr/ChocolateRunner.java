class ChocolateRunner
{
	public static void main(String[] args)
	{
		Chocolate chocolate=new Chocolate(20);
		chocolate.flavour="Chocolate";
		chocolate.size='S';
		chocolate.display();
		
		Chocolate chocolate1=new Chocolate(50);
		chocolate1.flavour="Chocolate";
		chocolate1.size='M';
		chocolate1.display();
		
		Chocolate chocolate2=new Chocolate(30);
		chocolate2.flavour="Chocolate";
		chocolate2.size='L';
		chocolate2.display();
		
	}
}