class Train
{
public static void book(String source,String destination)
{
	System.out.println("source:"+source);
	System.out.println("destination:"+destination);
}

public static void book(String source,String destination,double quantity)
{
	System.out.println("source:"+source);
	System.out.println("destination:"+destination);
	System.out.println("quantity:"+quantity);
	}

public static void book(String source,String destination,double quantity,double price)
{
	System.out.println("source:"+source);
	System.out.println("destination:"+destination);
	System.out.println("quantity:"+quantity);
	System.out.println("price:"+price);
	}

public static void cancel(int ticketNo)
{
	System.out.println("ticketNo:"+ticketNo);
	
}	

public static void cancel(String source,String destination)
{
	System.out.println("source:"+source);
	System.out.println("destination:"+destination);
}


}