class MountainRunner
{
	public static void main(String[] args)
	{
		Mountain mountain=new Mountain();
		mountain.size=1000;
		mountain.place="china";
		System.out.println("name:"+mountain.name);
		System.out.println("cost:"+mountain.size);
		System.out.println("quantity:"+mountain.place);
	}
}