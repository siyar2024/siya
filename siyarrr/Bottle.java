class Bottle
{
	public static String name(double cost)
	{
		if(cost>=0)
		{
			return "positive";
		}
		else if(cost<=100)	
		{
			return "negative";
		}
		return "invalid" ;
	}
}