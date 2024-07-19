
class Buy
{
	public static void product(String brand,double price )
	{
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		if (price>0 && price<50000)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
	}
	
	public static void product(String name,int quantity,double price)
	{
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		if (quantity>50 && quantity<100000)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (price>50 && price<100000)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
	}
	
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("name:"+name);
		System.out.println("theaterName:"+theaterName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		if (quantity>100 && quantity<5000)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (price>50 && price<600)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		
		
	}
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("total:"+total);
		System.out.println("pricePerEgg:"+pricePerEgg);
		if (total>1 && total<60)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (pricePerEgg>3 && pricePerEgg<600)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
	}
	
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("quantityInMl:"+quantityInMl);
		System.out.println("price:"+price);
		System.out.println("brand:"+brand);
		System.out.println("manfDate:"+manfDate);
		if (quantityInMl>100 && quantityInMl<5000)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (price>50 && price<600)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
	}
	
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("size:"+size);
		System.out.println("type:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		if (cost>100 && cost<900)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (quantity>150 && quantity<700)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
	}
	
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("serialNo:"+serialNo);
		System.out.println("batteryCapacity:"+batteryCapacity);
		System.out.println("screenSize:"+screenSize);
		System.out.println("os:"+os);
		System.out.println("harddiskSize:"+harddiskSize);
		System.out.println("ramSize:"+ramSize);
		if (price>1 && price<700)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (serialNo>1 && serialNo<700)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (batteryCapacity>1 && batteryCapacity<700)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (screenSize>1 && screenSize<700)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (ramSize>1 && ramSize<700)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (harddiskSize>1 && harddiskSize<700)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
	}
	
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("mode:"+mode);
		if (price>10000 && price<100000)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		if (mode>10000 && mode<100000)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
	}
	
	
}