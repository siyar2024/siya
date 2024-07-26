class KeyboardRunner
{
	public static void main(String[] args)
	{
		Keyboard keyboard=new Keyboard();
		keyboard.cost=300;
		keyboard.width=50;
		System.out.println("name:"+keyboard.buttons);
		System.out.println("cost:"+keyboard.cost);
		System.out.println("quantity:"+keyboard.width);
	}
}