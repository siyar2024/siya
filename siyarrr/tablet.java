class Tablet

{
	public static String medicine(double price)
	{
		if(price==150)
		{
			return "dolo";
		}
		if(price==90)
		{
			return "strepsil";
		}
		if(price==100)
		{
			return "paracetamal";
		}
		return "not found";
	}
	
	public static String symptom(String name)
	{
		if(name=="dolo")
		{
			return "fever";
		}
		if(name=="paracetamal")
		{
			return "cough";
		}
		if(name=="strepsil")
		{
			return "head ache";
		}
		return "not found";
	}
	
	public static String doctor(String availability)
	{
		if(availability=="morning")
		{
			return "nandini";
		}
		if(availability=="afternoon")
		{
			return "hema";
		}
		if(availability=="evening")
		{
			return "siya";
		}
		return "not found";
	}
}