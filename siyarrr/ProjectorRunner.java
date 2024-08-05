class ProjectorRunner{
	public static void main(String[] args)
	{
	Projector projector=new Projector("digital");
	projector.company="sony";
	projector.weight=10;
	projector.display();
	
	Projector projector1=new Projector("digital");
	projector1.company="sony";
	projector1.weight=15;
	projector1.display();
	
	Projector projector2=new Projector("digital");
	projector2.company="sony";
	projector2.weight=20;
	projector2.display();
	}
}