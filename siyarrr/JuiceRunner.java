class JuiceRunner
{
	public static void main(String[] args)
	{
		if(args.length==5){
		String name=args[0];
			String brand=args[1];
			String flavor=args[2];
			String price=args[3];
			String quantity=args[4];
			float convertedprice=Float.parseFloat(price);
			int covertedquantity=Integer.parseInt(quantity);
		Juice.JuiceInfo(name,brand,flavor,convertedprice,covertedquantity);
		}
	}
}