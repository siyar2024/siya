class Rod
{
	public static int code(String country)
	{
		if(country=="India")
		{
			return 91;
		}
		if(country=="China")
		{
			return 90;
		}
		if(country=="Russia")
		{
			return 88;
		}
		if(country=="Italy")
		{
			return 93;
		}
		if(country=="Japan")
		{
			return 80;
		}
		return 0;
	}
	
	public static String item(double price)
	{
		if(price==150)
		{
			return "biriyani";
		}
		if(price==90)
		{
			return "kebab";
		}
		if(price==100)
		{
			return "burger";
		}
		if(price==200)
		{
			return "pizza";
		}
		if(price==80)
		{
			return "friedRice";
		}
		return "not found";
	}
	
	public static String movieName(String producer)
	{
		if(producer=="ashith")
		{
			return "kalki";
		}
		if(producer=="prashant")
		{
			return "kotee";
		}
		if(producer=="sharan")
		{
			return "goood news";
		}
		if(producer=="rishika")
		{
			return "bad news";
		}
		if(producer=="shreya")
		{
			return "ram";
		}
		return "not found";
	}

}