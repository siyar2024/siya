class AeroplaneRunner
{
	public static void main(String[] args)
	{
		Aeroplane aeroplane=new Aeroplane();
		
		Aeroplane aeroplane1=new Aeroplane("indigo",1000,100000,"bngl","usa");
		System.out.println("aeroplane company:"+aeroplane1.company);
		System.out.println("aeroplane noOfSeats:"+aeroplane1.noOfSeats);
		System.out.println("aeroplane ticketPrice:"+aeroplane1.ticketPrice);
		System.out.println("aeroplane source:"+aeroplane1.destination);
		System.out.println("aeroplane source:"+aeroplane1.destination);
		
		Aeroplane aeroplane2=new Aeroplane("indigo","mngl","dubai");
		System.out.println("aeroplane company:"+aeroplane2.company);
		System.out.println("aeroplane source:"+aeroplane2.source);
		System.out.println("aeroplane destination:"+aeroplane2.destination);

		Aeroplane aeroplane3=new Aeroplane("indigo",200000,"bngl","russia");
		System.out.println("aeroplane company:"+aeroplane3.company);
		System.out.println("aeroplane ticketPrice:"+aeroplane3.ticketPrice);
		System.out.println("aeroplane source:"+aeroplane3.source);
		System.out.println("aeroplane destination:"+aeroplane3.destination);
	}
}